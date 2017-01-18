package _04.hellojsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
//DÝKKAT!! dogru annatotionu import ettiðimize dikkat edelim yoksa çalýþmaz !!  

@ManagedBean
//name attr. kullanmazsak managedbean için isim sýnýfýmýzýn adý olur --> personBean olur ..

//bean lerin scope/yaþam alný vardýr .varsayýlan olarak RequestScope tur.
@SessionScoped
public class PersonBean {

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
