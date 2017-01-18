package _05.redirectnavigation;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="rBean")
public class RedirectBean {

	public String redirectNavigation() {
		return "redirectOutcome";
	}
	
}
