package _03.radiobutton;

import java.util.HashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="radio")
public class RadiobuttonBean {

	
	private String gender;
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	//----------------------------------

	private String maritalStatus;
	
	public String[] getPreparedData() {
		
		return new String[] {"married" , "engage", "single" , "java man"};
		
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	
	//------------------------
	private String job; 
	
	public Map<String, String> getPreparedJob() {
		
		Map<String, String> map = new HashMap<String , String>();
		map.put("eng", "Software Engineer");
		map.put("arch", "Architect");
		map.put("doc", "Doctor");
		
		return map;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
	//-------------------------------------
	
	public String navigateToPage() {
		return "result";
	}
	
}
