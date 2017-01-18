package _04.select;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="select")
public class SelectBean {

	private String language;

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
	//------------------------------
	private String years;
	
	public String getYears() {
		return years;
	}

	public void setYears(String years) {
		this.years = years;
	}
	
	
	public String[] getPreparedYears() {
		return new String[] {"2011" , "2012" , "2013" , "2014" , "2015" , "2016"};
	}
	//--------------------
	//selectonelistbox
	private String birdYear;
	//selectmanylistbox
	private String year2;

	public String getBirdYear() {
		return birdYear;
	}

	public void setBirdYear(String birdYear) {
		this.birdYear = birdYear;
	}

	public String getYear2() {
		return year2;
	}

	public void setYear2(String year2) {
		this.year2 = year2;
	}
	
	
	
}
