package _05.expression.language;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="el")
@SessionScoped
public class ExpressionLanguageBean {

	private String name="testName";
	private int numbers[];
	private Map<String, String> myMap;
	private List<String> myList;
	
	//jsf e ozgu degil 
	//obje olustugunda construcor ýndan sonra bu metod çalýþsýn anlamýna geliyor
	@PostConstruct 
	public void init() {
		numbers = new int[] {10,20,30,40,50};
		
		myMap = new HashMap<String , String>();
		myMap.put("key1", "value1");
		myMap.put("key2", "value2");
		myMap.put("key3", "value3");
		
		myList = new ArrayList<String>();
		myList.add("element1");
		myList.add("element2");
		myList.add("element3");
		myList.add("element4");
		
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	
}
