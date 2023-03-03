package manav;

import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        double sonuc, elma,armut,domates,muz,patlıcan,e=3.67,a=2.14,d=1.11,m=0.95,p=5.0;
        Scanner input=new Scanner(System.in);
        System.out.println("kaç kilo armut:");
        armut=input.nextDouble();
        
        System.out.println("kaç kilo elma:");
        elma=input.nextDouble();
        
        System.out.println("kaç kilo domates:");
        domates=input.nextDouble();
        
        System.out.println("kaç kilo muz:");
        muz=input.nextDouble();
        
        System.out.println("kaç kilo patlican:");
        patlıcan=input.nextDouble();
        
        sonuc=e*elma+a*armut+m*muz+ p*patlıcan+d*domates;
        System.out.println("toplam tutar:"+sonuc);
    }
    
}
