package _01.notes;

public class Notes {

}

//default olarak yaptigimiz orneklerde Page Forward yaklasimini kullandik.
//h:commandButton -> input type submit e donusu ve ilgili formu submit eder.
//formu submit ettigimizde page forward yaklasimi icin URL degismez.
//burada sayfayi refresh etmeye calistigimizda formu tekrar gondermek icin popup cikar(risk soz konusu!)
//OK dersek tekrardan form submit edilir. bu durum da bazi noktalar icin istenmeyen sonuclar ortaya cikartabilir.
//duplicate submit / duplicate payment gibi.

//page redirect yaklasiminda ise 2 tane istek yapilir( server yapar.)
//bu yaklasimi kullandigimizda risk ortadan kalkar.