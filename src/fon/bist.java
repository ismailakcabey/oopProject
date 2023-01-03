package fon;

import user.User;

import java.util.ArrayList;
import java.util.List;

public class bist {
    private User user;
    private Integer stockAmount;
    stockEnum stock;

    private List<String> bistList = new ArrayList<String>();

    public void bist(){
        System.out.println("BIST FONKSIYON");
    }
    public void setUser(User user){
        this.user = user;
    }



    public List getListBist() {
        return bistList;
    }

    public Integer getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount() {
        this.stock = stock;
        this.stockAmount=stockAmount;
        this.bistList.add("-------\nhisse : "+ stock + "birimi : " + stockAmount);
    }

    public void setStockAmount(String stocks) {
    }
}
