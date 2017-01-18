package _02.links;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="link")
public class LinksBean {

	public String navigateToPage1() {
		return "page1";
	}
	public String navigateToPage2() {
		return "page2";
	}
	public String navigateToPage3() {
		return "page3";
	}
	//--------------------
	public String getMyPageOutcome() {
		//<h:link value="h:link clickme" outcome="#{link.myPageOutcome}"></h:link>
		return "page1";
	}
	
	//command link komponenti h:commandbutton gibifromu submit eder
	//bu nedenle bu iki komponent h:form içinde olmalýdýr
	
	//h:commandLÝnk ve h:commandButton httpPost istegine neden olur ve url deðiþmez
	
	//h:commandlink ve h:commandbutton value ve action alýyor
	//action attributundedirekt metodu cagýrabýlýrsýnýz
	
	//<h:commandLink value="page2" action="#{link.navigateToPage2}"></h:commandLink>
	
	//h:link ve h:button outcome alýr.mantýgýnda getter seter mantýgý var. metod ismi direk yazýlmaz
	//burada getter yapýsnda býr method varsa cagýrabýlýrýz 
	
	//<h:link value="h:link clickme" outcome="#{link.myPageOutcome}"></h:link>
}
