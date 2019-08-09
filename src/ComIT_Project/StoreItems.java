package ComIT_Project;

public class StoreItems  {

    private String ProductName;
    private float Price;
    private int CodeNumber;
    private String ProductDescription;

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        Price = price;
    }

    public int getCodeNumber() {
        return CodeNumber;
    }

    public void setCodeNumber(int codeNumber) {
        CodeNumber = codeNumber;
    }

    public String getProductDescription() {
        return ProductDescription;
    }

    public void setProductDescription(String productDescription) {
        ProductDescription = productDescription;
    }

    public StoreItems(String productName, float price, int codeNumber, String productDescription) {
        ProductName = productName;
        Price = price;
        CodeNumber = codeNumber;
        ProductDescription = productDescription;
    }
    public StoreItems(){}
}


