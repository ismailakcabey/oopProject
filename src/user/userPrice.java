package user;

import fon.bist;

public class userPrice extends bist {
    private Integer asset=0;
    private currencyEnum currency;

    public void userPrice(){
        System.out.println("USER PRICE FONKSIYON");
    }
    public void setAsset(int asset){
        this.asset += asset;
    }
    public void setCurrency(currencyEnum currency){
        this.currency = currency;
    }
}
