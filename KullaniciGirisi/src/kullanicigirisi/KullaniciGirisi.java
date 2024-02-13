package kullanicigirisi;

import java.util.Scanner;


public class KullaniciGirisi {


    
    
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in) ;
        
        String kadi,parola;
        
        System.out.print("Kullanıcı Adını Giriniz==>");
        
        kadi = input.nextLine();
        
        System.out.print("Parolanızı giriniz==>");
       
        parola = input.nextLine () ;
        
        
        //System.out.println(kadi);
        //System.out.println(parola);
        
        
        if ( kadi.equals("admin") && parola.equals("123") ) {
            
        System.out.println("Başarılı bir şekilde giriş yaptınız!!");
    }
        else {
            
            System.out.println("Kullanıcı adı veya parola yanlış!!");
        }
        
        
        
    }
    
}
