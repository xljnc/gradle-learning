package com.wt.test.spring;

/**
 * @author qiyu
 * @date 2021/11/24
 */
public class MyTestBean {
	private String name = "qiyu";

	public MyTestBean(String name) {
		this.name = name;
	}

	public MyTestBean() {
	}

	@Override
	public String toString() {
		return "MyTestBean{" +
				"name='" + name + '\'' +
				'}';
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
