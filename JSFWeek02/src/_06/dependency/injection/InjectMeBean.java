package _06.dependency.injection;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean
public class InjectMeBean {
	
	/*@ManagedProperty basic olarak DI mekanizmas�n� ger�ekle�tirir.*/
	@ManagedProperty(value = "#{messageBean}")
	/*jsf derleme zaman�nda bi property olusturuyr.*/
	private MessageBean messageBean; 

	
	/*setter �zerinden , setter injection ger�ekle�icek*/
	public void setMessageBean(MessageBean messageBean) {
		this.messageBean = messageBean;
	}
	//------------------------------------------------
	
	@ManagedProperty(value="admin user") /*bu �ekilde de�er atanabilir*/
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
		
		/*kod i�erisinde messagebean objesini olusturmad�k normal sartlarda 
		 * messageBean instance variable � null olacakt�r
		 * fakat burada DI()dependency injection) kulland���m�z i�in
		 * jsf bizim i�in  iligili objeyi olu�turacakt�r.bind edecektir.*/
		return messageBean.getMyMessage() + " " + name ;
	}
	
	
	
	
	

	
	
}
