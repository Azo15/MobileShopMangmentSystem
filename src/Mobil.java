public class Mobil {



    protected String os;
    protected  String model;
    protected float price;





    public Mobil(){
    }
    public Mobil( String os, String model, float price){
        this.os = os;
        this.model = model;
        this.price = price;
    }

    public float getPrise(){
        return price;
    }

    public void setPrise(float price){
        this.price = price;
    }


    public float calcMobilePrice(){
        return price;
    }







}
