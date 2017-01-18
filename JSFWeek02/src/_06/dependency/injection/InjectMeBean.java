package _06.dependency.injection;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean
public class InjectMeBean {
	
	/*@ManagedProperty basic olarak DI mekanizmasýný gerçekleþtirir.*/
	@ManagedProperty(value = "#{messageBean}")
	/*jsf derleme zamanýnda bi property olusturuyr.*/
	private MessageBean messageBean; 

	
	/*setter üzerinden , setter injection gerçekleþicek*/
	public void setMessageBean(MessageBean messageBean) {
		this.messageBean = messageBean;
	}
	//------------------------------------------------
	
	@ManagedProperty(value="admin user") /*bu þekilde deðer atanabilir*/
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//------------------------------------------------
	public String getWelcomeMessage() {
		
		if("".equals(name)) {
			return "";
		}
		
		/*kod içerisinde messagebean objesini olusturmadýk normal sartlarda 
		 * messageBean instance variable ý null olacaktýr
		 * fakat burada DI()dependency injection) kullandýðýmýz için
		 * jsf bizim için  iligili objeyi oluþturacaktýr.bind edecektir.*/
		return messageBean.getMyMessage() + " " + name ;
	}
	
	
	
	
	

	
	
}
