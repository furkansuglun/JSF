package _08.hellocdibean.copy;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

//bunlar beraber kullanilir.
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.SessionScoped;


//@ManagedBean
@Named(value="personBeanCDI")
@SessionScoped
//@Named kullandigimida 
// javax.faces.bean.SessionScoped; bunu degil
//javax.enterprise.context.SessionScoped kullanmam gerekir!

public class PersonBean implements Serializable {

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
	
	
}
