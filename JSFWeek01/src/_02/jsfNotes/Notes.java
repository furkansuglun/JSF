package _02.jsfNotes;

public class Notes {

}

	// JSF --> Java Server Faces

	// JSF ;
	// ## Server-side

	// JSF --> Server-side , client in browserinda degil server da calisir!
	// client-side a ornek olarak --> javascript verilebilir. javascript kullanici
	// browserinda calisirken jsf ,servlet jsp serverda calisir.

	// ## Component-oriented/ Component-Based ozelliklere sahiptir.

	// JSF -> Swing'in server-side sekli olarak dusunebiliriz.

	// Swingte her bir yapi icin bir component vardi ; jlabel , jtextfield ,
	// jcheckbox gibi label , input ,checkbox radiobutton gibi kavramlar
	// icin bir component tanimliydi.

	// JSF te Swinge benzer sekilde component'ler tanimlidir.

	// ## MVC yapisinda bir Java Web Frameworktur.
	// MVC --> Model View Controller

	// JSFte tnaimli UI (user interface) componentler vardir.
	// JSFte event-driven/olaya dayali bir programlama modeli ozelligine sahiptir.

	// JSF , Java EE projeleri icin View Layer standard framework olma ozelligine
	// sahiptir.

	// /##### Hangi ortamlar ?

	// Eclipse
	// Apache Tomcat 8
	// Glassfish
	// JDK8
	// Maven
	// Reference implementation : Mojarra

	// Servlet , JSP , JSF , JPA vs dedigimiz kavramlar temelde bir
	// spec/belirtim/sartname/kurallar butunudur.

	// Ornegin Servlet ,JSP icin Apache Tomcat bir implementation'dir.
	// Benzer sekilde Jetty, Glassfish , Resin gibi server ve/veya container'larda
	// farkli sekile Servlet ve JSP spectlerini uygulayabilir.

	// Ya da JPA icin , reference implementation EclipseLinktir.
	// Baska implementationlar da vardir. Ornegin Hibernate icin 2 tane urun vardir.
	// bir tanesi bu JPA spectini/kurallarini uygulayan urun
	// digeri ise Kendilerinin gelistirmis oldugu JPAdan bagimsiz bir orm urunu.

	// JSF icin implementationlar Mojarra , Apache MyFaces vs


	// ### JSF sayfalari ? Facelets kavrami
	// JSF 1.x versiyonlarinda JSP sayfalari kullanilmaktadir fakat JSF 2.0
	// versiyonuyla birlikte artik Facelets sayfalari kullanilmaktadir.
	// Facelets ; JSF icin kullanilan view declaration dilini ifade eder.

	// Facelets sayfalari ;

	// Convention geregi .xhtml dosyalaridir.
	// EL(Expression Language) destegi saglar.
	// JSTL tag library destegi saglar.
	// Template destegi

	// Faceletste kullanabilecegimiz tag library'ler ;

	// 1- JavaServerFaces HTML tag library -> input , label , checkbox , radiobutton
	// , select gibi html componentlerini olsuturmak icin kullanacagimiz JSF
	// componentleri.

	// URI - Uniform Resource Identifier --> facelets sayfamiza ilgili namespace'i/tag library import etme gibi dusunebiliriz.
	//http://java.sun.com/jsf/html
	// h:

	// 2- JavaServerFaces Core Tag library 
	// http://java.sun.com/jsf/core
	// f:

	// 3 -JSTL Core Tag Library
	// http://java.sun.com/jsp/jstl/core
	// c:

	// 4- JSTL Function Tag library
	// http://java.sun.com/jsf/facelets
	// fn:

	// 5- JavaServer Faces Facelets Tag Library
	// http://java.sun.com/jsf/facelets
	// ui:

	// https://docs.oracle.com/javaee/6/tutorial/doc/gijtu.html


