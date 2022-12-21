package fon;

import user.User;

import java.util.ArrayList;
import java.util.List;

public class bist {
    private User user;
    private Integer stockAmount;
    private stockEnum stock;

    private List<String> bistList = new ArrayList<String>();

    public void bist(){
        System.out.println("BIST FONKSIYON");
    }
    public void setUser(User user){
        this.user = user;
    }
    public void setStockAmount(Integer stockAmount , stockEnum stock){
        this.stock = stock;
        this.stockAmount=stockAmount;
        this.bistList.add("-------\nhisse : "+ stock + "birimi : " + stockAmount);
    }


    public List getListBist() {
        return bistList;
    }

    public Integer getStockAmount() {
        return stockAmount;
    }

}
