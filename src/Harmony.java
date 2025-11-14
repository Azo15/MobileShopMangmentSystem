public class Harmony extends Mobil{


    public Harmony(String os,String model,float price){
        super(os,model,price);
    }


    public Harmony(){
    }



@Override
    public float calcMobilePrice(){

        return price - (price * 15/100);
    }








}
