//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Android samsung = new Android("Samsung", "J7",3600 );
        Ios iphone = new Ios("Iphone","11 PRO",3600);
        Harmony Redmi = new Harmony("Redmi","Note 8",3600);


        System.out.println(samsung.calcMobilePrice());
        System.out.println(iphone.calcMobilePrice());
        System.out.println(Redmi.calcMobilePrice());






    }
}