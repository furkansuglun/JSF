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
	//bu nedenle bu iki komponent h:form i�inde olmal�d�r
	
	//h:commandL�nk ve h:commandButton httpPost istegine neden olur ve url de�i�mez
	
	//h:commandlink ve h:commandbutton value ve action al�yor
	//action attributundedirekt metodu cag�rab�l�rs�n�z
	
	//<h:commandLink value="page2" action="#{link.navigateToPage2}"></h:commandLink>
	
	//h:link ve h:button outcome al�r.mant�g�nda getter seter mant�g� var. metod ismi direk yaz�lmaz
	//burada getter yap�snda b�r method varsa cag�rab�l�r�z 
	
	//<h:link value="h:link clickme" outcome="#{link.myPageOutcome}"></h:link>
}
