public class Android extends Mobil{



    public Android(String os, String model, float price){
        super(os,model,price);
    }


    public Android(){
    }


    @Override
    public float calcMobilePrice(){

        return price - (price * 10/100);
    }
}
