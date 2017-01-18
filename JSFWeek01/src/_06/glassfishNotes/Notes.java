package _06.glassfishNotes;

public class Notes {

}

//Apache Tomcat bir Servlet Containerdir.
//Glassfish ise bir Application Server dir.
//Application Serverda daha fazla eklenti ozellik vardir.
//mesela tomcat ile ejb , CDI calýstýramazsýnýz ancak app serverlar ile calýstýrýlabilir


//https://glassfish.java.net/download.html

//servers ta sag tiklayip new Server diyip glassfish klasor gozukmuyorsa bu
//durumda eclipse glassfish server adapter i eklemek gerekir.
//bunun icin help--> eclipse market place diyip , glassfish diye aratip Glassfish Tools u yukleyin!
//Daha sonrasinda Apache Tomcat kurulumu gibi zip dosyasi icerisidneki glasfish/glasfish dizinini gosterip islem tamamlanir.

//Apache Tomcat gibi Glassfish de 8080 portunu kullanir!
//DESGÝSTÝRMEK ÝÇÝN PORTU --> glassfish klasoru altýnda glassfish4---> glassfish --> domains --> domain1--> config-- > domain.xml