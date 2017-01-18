package _01.staticnavigation;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="sBean")
public class StaticNavigationBean {

	public String navigateToPage1() {
		return "page1";
	}
	
	
	public String navigateToPage2() {
		return "page2";
	}
	
	public String navigateToPage3() {
		return "page3";
	}
	
}
