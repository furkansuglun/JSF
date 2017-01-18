package _04.fromaction;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="fABean")
public class FromActionBean {

	public String navigateMethod1() {
		return "navigate";
	}
	public String navigateMethod2() {
		return "navigate";
	}
}
