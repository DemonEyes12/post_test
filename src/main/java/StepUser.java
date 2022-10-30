import Model.ProductRequestModel;
public class StepUser {

    ApiUser apiUser = new ApiUser();

    public void createProduct(String name, String price) {
        ProductRequestModel model = new ProductRequestModel(name,price);
        apiUser.createProduct(model);
    }

}