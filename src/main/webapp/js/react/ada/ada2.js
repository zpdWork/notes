// 组件 React.createClass。
// 组件类的首字母一定要大写。
// 所有组件类都必须有自己的 render 方法，用于输出组件。
// 组件的属性可以在组件类的 this.props 对象上获取，比如 name 属性就可以通过 this.props.name 读取。
// this.props 对象的属性与组件的属性一一对应，但是有一个例外，就是 this.props.children 属性。
// 它表示组件的所有子节点,如果当前组件没有子节点，它就是 undefined ;如果有一个子节点，数据类型是 object ；如果有多个子节点，数据类型就是 array 。

let AdaButton = React.createClass({
  // 所有组件类都必须有自己的render方法，用于输出组件。
  render: function () {
    return <button>Ada{this.props.name}</button>
  }
});

ReactDOM.render(
    <AdaButton name='ada-button-name'/>,
    document.getElementById('divId')
);

// this.props.children 组件的所有子节点
let Adas = React.createClass({
  render: function () {
    return (
        <ol>{
          React.Children.map(this.props.children, function (child) {
            return <li>{child}</li>;
          })
        }
        </ol>
    )
  }
});
ReactDOM.render(
    <Adas>
      <span>ada1</span>
      <span>ada2</span>
    </Adas>,
    document.getElementById('divId2')
)
;

// PropTypes 限定组件类型
let Ada = React.createClass({
  PropTypes: {
    myName: React.PropTypes.string.isRequired, // 这里必须是string类型，值是必须的。我们还可以去设置默认属性值：
  },
  render: function () {
    return <h1>{this.props.myName}</h1>
  }
});
let myNameStr = "ada";
ReactDOM.render(
    <Ada myName={myNameStr}/>,
    document.getElementById('divId3')
);
// 指定默认值
let Ada1 = React.createClass({
  PropTypes: {
    myName1: React.PropTypes.string.isRequired,
  },
  getDefaultProps: function () {
    return {myName1: "default react"}
  },
  render: function () {
    return <h1>{this.props.myName1}</h1>
  }
});
let myNameStr1;
ReactDOM.render(
    <Ada1 myName1={myNameStr1}/>,
    document.getElementById('divId4')
);

/**
 * Virtual DOM
 *
 * 组件并不是真实的DOM节点，而是存在于内存中的一种数据结构，叫做虚拟DOM，只有插入文档的时候才会变成真实的DOM。
 * 根据React的设计，当重新渲染组件的时候，会通多diff寻找到变更的DOM节点，再把这个修改更新到浏览器实际的DOM节点上，
 * 所以实际上并不是渲染整个DOM数，这个Virtual DOM是一个纯粹的JS数据结构，性能比原生DOM快很多。
 * 这里面我们可以用通过ref属性来获取真实的DOM属性：
 */
let VirtualDom = React.createClass({
  render: function () {
    return (
        <div>
          <input type="text" ref="myTextInput"/>
          <input type="button" value="Virtual DOM Button"
                 onClick={this.adaClick}/>
        </div>
    );
  },
  adaClick: function () {
    // alert(this.refs.myTextInput); // 弹出的是：[object HTMLInputElement]
    console.log(this.refs.myTextInput);
    this.refs.myTextInput.focus(); // 这一步没有太搞懂。
  }
});
ReactDOM.render(
    <VirtualDom/>,
    document.getElementById('divId5')
);

// this.state 通过this.state来拿到组件的状态：
let StateButton = React.createClass({
  getInitialState: function () {
    return {isState: false};
  },
  adaClick: function () {
    this.setState({isState: !this.state.isState})
  },
  render: function () {
    let text = this.state.isState ? 'isState' : 'not isState';
    return (
        <p onClick={this.adaClick}>
          isState 状态：{text}
        </p>
    )
  }
});
ReactDOM.render(
    <StateButton/>,
    document.getElementById('divId6')
);

// Form 表单
let Form = React.createClass({
  getInitialState: function () {
    return {isFormState: 'hello'}
  },
  formClick: function (event) {
    this.setState({isFormState: event.target.value})
  },
  render: function () {
    let formText = this.state.isFormState;
    return (
        <div>
          <input type="text" value={formText} onChange={this.formClick}/>
          <p>{formText}</p>
        </div>
    )
  }
});
ReactDOM.render(
    <Form/>
    , document.getElementById('divId7')
);

/**
 * Component Lifecycle
 组件有三个主要的生命周期：
 Mounting:组件插入到DOM
 Updating:组件被重新渲染，如果DOM需要更新
 Unmounting:从DOM中删除组件
 React为每个状态都提供了两种处理函数，will函数在进入状态之前调用，did在进入状态之后调用。
 **/

let MyButton = React.createClass({
  componentWillMount: function () {
    alert('将要装载');
  },
  componentDidMount: function () {
    alert('装载完毕');
  },
  componentWillUpdate: function () {
    alert('准备更新');
  },
  componentDidUpdate: function () {
    alert('更新完毕');
  },
  componentWillUnmount: function () {
    alert('准备移除');
  },
  render: function () {
    return (<button>myButton</button> )
  }
});
let LoadButton = React.createClass({
  loadButtonClick: function () {
    ReactDOM.render(
        <MyButton/>,
        document.getElementById('mb')
    );
  },
  removeButtonClick: function () {
    //ReactDOM.render(
    // <MyButton/>,
    // document.getElementById('mb')
    //)
    let result = ReactDOM.unmountComponentAtNode(document.getElementById('mb'));
    console.log(result);
  },
  render: function () {
    return (
        <div>
          <button onClick={this.removeButtonClick}>移除button</button>
          <button onClick={this.loadButtonClick}>装在button</button>
          <div id="mb">这里是mybutton区域</div>
        </div>
    )
  }
});
ReactDOM.render(
    <LoadButton/>,
    document.getElementById('divId8')
);

// ajax
let AjaxDemo = React.createClass({
  getInitialState: function () {
    return {
      userName: '',
      lastGistUrl: ''
    }
  },
  componentDidMount: function () {
    $.get(this.props.adaUrl, function (data) {
      let lastGist = data[0];
      if (this.isMounted()) {
        this.setState(
            {userName: lastGist.owner.login, lastGistUrl: lastGist.html_url});
      }
    }.bind(this))
  },
  render: function () {
    return (
        <div>
          userName:{this.state.userName}<br/>
          <a href={this.state.lastGistUrl}>here</a>
        </div>
    )
  }
});
ReactDOM.render(
    <AjaxDemo adaUrl="https://api.github.com/users/octocat/gists"/>,
    document.getElementById('divId9')
);