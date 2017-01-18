package _06.jstl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

//JSTL -> jsp standart tag library
//SEARCH JSTL functiopns
@ManagedBean
public class JSTLBean {
	
	
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

	public int[] getNumbers() {
		return numbers;
	}
	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}
	public Map<String, String> getMyMap() {
		return myMap;
	}
	public void setMyMap(Map<String, String> myMap) {
		this.myMap = myMap;
	}
	public List<String> getMyList() {
		return myList;
	}
	public void setMyList(List<String> myList) {
		this.myList = myList;
	}
	
}
