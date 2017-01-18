package _02.request.scope;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
//requestscope beanler i�in yasam alan� tek bir http
//request i�in ge�erlidir
//yani name ilk page forward da belirli ancak ikinci page forward olay�nda null olacakt�r
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
