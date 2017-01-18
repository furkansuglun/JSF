package _04.jsf.lifecycle;

public class LifecycleNotes {
	
}


//### Restore View Phase
//restore -> yeniden kurmak

//bir jsf sayfasi icin istekte bulundugumuzda , link yada butona tikladik , ilk
//olarak Restore view phase i calisir.

//Her JSF sayfasi serverda Component Tree olarak saklanir/store.

//JSF sayfasina ilk istek/request geldiginde Component Tree olusturulur.
//sonraki istekelrde mevccut/current Component Tree kullanilir.

/// a)non postback / initial request
//bos bir component tree olusur , (her sayfa icin bir component tree olusur)
//component tree , FacesContext objesinde saklanir/store.

//basit bir login.xhtml dosyasini calistirdigimizda restore view fazindan sonra
//son faz olan render response fazina gecilir.

//b)post back request
//HTTP Post ile formu submit ettik. ozaman ortaya cikar.

//#### Apply Request Values Phase
//postback request sonrasi bu phase calisir. burada input alanlarina girdigimiz
//degerler (request values)
//component treedeki dugum/node alanlarina doldurulur/assign edilir.

//#### Process Validation
//bu fazda , conversion ve validation islemleri gerceklesir.
//component treede saklanan degerler , local value denilir, kontrol edilir. her
//sey yolundaysa bir sonraki phase a gecilir.
//eger problem varsa direkt olarak son phase olan render resposne phase ina
//gecilir.
//bu noktada hata mesaji olusur , h:message ya da h:messages taglariyla
//gosterebiliriz.

//#### Update Model Values
//process validation OK sa, bu phase calisir.
//Component tree deki local value'lar , JSF managed beandeki property
//alanlarina (instance variable) baglanir/bind edilir/assign.

//##### Invoke Application Phase
//update model values phase indan sonra bu phase calisacaktir.
//burada action gerceklesir ; page navigation , action -> method call , actionListener
//page navigation NavigationHandler

//##### Render Response Phase
//son phase. bu phase da component tree encoding islemine tabi tutulur.
//bu fazda render islemi yapilir ve butun JSF componentleri -> HTML componentlerine encoding islemi yapilarak donusturulur.
//son olarak browserda html input componentlerini render ederk son kullaniciya gosterir.	