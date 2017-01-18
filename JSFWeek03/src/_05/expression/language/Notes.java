package _05.expression.language;

public class Notes {

}

//JSP expression language
//JSF expression language (EL)  

//JSP EL -> $ 
//JSF EL -> #

//JSP EL -> page compilation time da render edilir. bu setteri calistirmaz/calistiramaz.

//JSF EL -> gecikmeli olarak calisir(deferred) , lifecycle a gore calismaktadir.
//setter'i ya da getter'i calistirir. read/write

//${managedBean.name} -> JSP expression language sadece getteri calistirabilir.
//#{managedBean.name} -> JSF EL
//<h:inputText value="#{managedBean.name}"> // jsf el seteri da çalýþrabilir