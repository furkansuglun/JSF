package _01.hello.ajax;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped

//default managedbean ismi helloAjaxBean oluyor
public class HelloAjaxBean {

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
	
	public String getWelcomeMessage() {
		if(name!=null && name.length()>0) {
			return "Hosgeldiniz: "+name+ " Parola : "+password;
		}
		else {
			return "";
		}
	}
	
	
	
}
