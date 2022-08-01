package Gun01;

import org.testng.annotations.Test;

public class _01_Giris {

//    public static void main(String[] args) {
//        webSitesiniAc();
//        LoginTestIsleminiYap();
//        driverıKapat();
//    }

    // Eğer test metodlarına sıralama verilmezse alfabetik sırasına göre çalışır.
    @Test( priority = 1) // annotation lar
    void webSitesiniAc(){
        System.out.println("Driver tanımlandı ve web sitesi açıldı.");
    }

    @Test( priority = 2) // priority: Öncelik sırası
    void loginTestIsleminiYap(){
        System.out.println("login test işlemleri yapıldı");
        // yeşil tik hatalı assertion yok demektir.
    }

    @Test( priority = 3)
    void driveriKapat(){
        System.out.println("driver kapatıldı ve çıkıldı.");
    }


}
