package Model;

public class ProductRequestModel {
    private String name;
    private String price;

    public ProductRequestModel(String login, String pass){
        this.name=login;
        this.price=pass;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }



}
