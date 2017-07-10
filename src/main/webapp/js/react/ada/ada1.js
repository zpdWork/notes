// 数组 遍历
const ada1 = ['aaa', 'bbb', 'ccc'];
ReactDOM.render(
    <div>
      {
        ada1.map(function (ada, key) { // key是必须的
          return <h1 key={key}>{ada}</h1>;
        })
        // ada1.list(function (ada, key) { // ada1.list is not a function
        //   return <h1 key={key}>{ada}</h1>
        // })
      }
    </div>,
    document.getElementById('divId')
);