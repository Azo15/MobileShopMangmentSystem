public class Ios extends Mobil{

    public Ios(String os, String model, float price){
        super(os,model,price);
    }

    public Ios(){
    }


    @Override
    public float calcMobilePrice(){

        return price - (price * 5/100);
    }










}
