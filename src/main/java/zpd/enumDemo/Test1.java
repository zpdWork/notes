package zpd.enumDemo;

/**
 * Created by Ad on 2016-11-09.
 */
public enum Test1 {
	ZHANG_SAN("zhangsan", 0), LI_SI("lisi", 1);

	private String name;
	private Integer code;

	Test1(String name, Integer code) {
		this.name = name;
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}
}
