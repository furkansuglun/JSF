package _01.pageredirect;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
//D�KKAT!! dogru annatotionu import etti�imize dikkat edelim yoksa �al��maz !!  

@ManagedBean
//nama attr. kullanmazsak managedbean i�in isim s�n�f�m�z�n ad� olur --> personBean olur ..

//bean lerin scope/ya�am aln� vard�r .varsay�lan olarak RequestScope tur.
@RequestScoped
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
