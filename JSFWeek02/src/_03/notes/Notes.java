package _03.notes;

public class Notes {

}

//MVC  mimari/architecture
//JSF view ile modeli birbirine baglar.

//<h:inputText value="#{helloAjaxBean.name}"  id="nameId"/>

//Controller -> FacesServlet -> FrontController


//data conversion ->input alanina String degerler giriyoruz kendisi int'e vs cevirmektedir.
//validation & error handling, jsf bize validasyon icin componentler saglar. error mesajlarini gosterebiliriz.
//i18n -> internationalization


//rendering, encoding , decoding

//jsf sayfalarimizda h:inputText , h:commandButton gibi componentler yer almaktadir.
//her tag icin bir tag handler yer almaktadir.

//tld tag library descriptor , META-INF altinda bulabilirsiniz jsf impl jar icin.
//html_basic.tld
/*
   <name>
         commandButton
     </name>
     <tag-class>
         com.sun.faces.taglib.html_basic.CommandButtonTag
     </tag-class>
*/


//JSF tag handler siniflari/classlari birlikte calisarak component tree denilen bir veri yapisini olusturur.
//bu veri yapisinda bizim java objelerimiz/componentlerimiz yer alir.

//2 tane h:inputText componenti olsun -> 2 tane UIInput objesine karsilik gelecektir.
//1 tane h:commandButton componenti olsun -> 1 tane UICommand objesine karsilik gelecektir.

//html sayfasina donusturulmesi islemi -> rendering

//tarayicilar JSF BILMEZ! tarayicilarin bildigi sey -> HTML ve HTTP bilir.

//
/// <h:inputText value="#{helloAjaxBean.name}"  id="nameId"/> ---> 
//ENCODING ---> <input id="nameId" type="text" name="nameId">

//DECODING....

//sayfa goruntulendi, forma veri girip formu HTTP post ile submit ettik.
//forma girdigimiz data bir hasttable a eklenir , butun componentler bu hasttable i denetleyebilir.
//girilen veriler , componentler icin hazir hale getiriliyor. bu process e decoding adini veriyoruz.
