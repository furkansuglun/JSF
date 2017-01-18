package _12.checkbox;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="checkBean")
public class CheckboxBean {

	private boolean enabled=true;

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	//---------------------------
	
	private String[] array1;

	public String[] getArray1() {
		return array1;
	}

	public void setArray1(String[] array1) {
		this.array1 = array1;
	}
	//---------------------
	private String[] array2;
	

	public String[] getArray2() {
		return array2;
	}

	public void setArray2(String[] array2) {
		this.array2 = array2;
	}
	//--------------
	private List<String> list1;
	
	public List<String> getList1() {
		return list1;
	}
	
	public void setList1(List<String> list1) {
		this.list1 = list1;
	}
	//-------------------
	public Map<String, String> getMapPreparedData() {
		Map<String, String> map = new HashMap<String,String>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		map.put("key4", "value4");
		
		return map;
	}
	//-------------------------
	public String[] getPreparedData() {
		return new String[] {"data1" , "data2" , "data3" , "data4"};
	}
	
		
}
