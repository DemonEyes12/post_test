import org.testng.annotations.Test;

public class TestCreateProduct {
    StepUser stepUser=new StepUser();
    @Test
    public void ProductTest(){
        stepUser.createProduct("name", "price");
    }
}
