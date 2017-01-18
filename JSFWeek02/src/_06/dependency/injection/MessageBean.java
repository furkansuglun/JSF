package _06.dependency.injection;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class MessageBean {

	private String myMessage="hello injection message!";
	

	public String getMyMessage() {
		// TODO Auto-generated method stub
		return myMessage;
	}
	
	public void setMyMessage(String myMessage) {
		this.myMessage = myMessage;
	}

	
}
