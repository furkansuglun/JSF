package _08.xml.config;

public class HelloInjectBeanXML {

	private MessageBeanXML messageBeanXML;

	public void setMessageBeanXML(MessageBeanXML messageBeanXML) {
		this.messageBeanXML = messageBeanXML;
	}
	//----------------------------------------
	
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	//---------------------------------------
	
	private String password;
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	//----------------------------------------

	public String getWelcomeMessage() {
		if("".equals(name)) {
			return "Fill name";
		}
		
		return messageBeanXML.getMyMessage() + " " + name + " " + password;
	}
	
}
