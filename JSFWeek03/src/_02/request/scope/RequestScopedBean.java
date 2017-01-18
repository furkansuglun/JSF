package _02.request.scope;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
//requestscope beanler için yasam alaný tek bir http
//request için geçerlidir
//yani name ilk page forward da belirli ancak ikinci page forward olayýnda null olacaktýr
@RequestScoped
public class RequestScopedBean {

	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getMyHashCode() {
		return super.hashCode();
	}
	
}
