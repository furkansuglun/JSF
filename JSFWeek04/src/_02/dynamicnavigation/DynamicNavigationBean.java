package _02.dynamicnavigation;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="dBean")
public class DynamicNavigationBean {

	private String name;
	private String password;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String checkLogin() {
		if("admin".equals(name) && "java".equals(password)) {
			//
			//
			return "success";
		} else {
			//
			//
			return "fail";
		}
	}
	
}
