package _08.output;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="output")
public class OutputBean {

	private String plaintText="plain text";
	private String htmlText="<input type='text' size='10'";
	public String getPlaintText() {
		return plaintText;
	}
	public void setPlaintText(String plaintText) {
		this.plaintText = plaintText;
	}
	public String getHtmlText() {
		return htmlText;
	}
	public void setHtmlText(String htmlText) {
		this.htmlText = htmlText;
	}
	
	
	
}
