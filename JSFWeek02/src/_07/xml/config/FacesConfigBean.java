package _07.xml.config;
/*annotation kullanmadan örnek yapýyoruz.xml üzerinden.*/
public class FacesConfigBean {
	
	private String name;
	private String password;
	
	//----------------------------------
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//-------------------------------------
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	//---------------------------------------
	
	
	public String getWelcomeMessage() {
		
		if("".equals(name)) {
			return "PLZ fill ur name ! ";
		}
		
		return "hello "+name.toUpperCase()+" on faces-configuration file ! \nI don't tell ur pwd don't wory . :)  "+password.toUpperCase() ;
	}
	
}
