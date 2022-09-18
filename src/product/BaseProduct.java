package product;

public abstract class BaseProduct implements Priceable{

    private String sku;
    private String description;
    private Type type;
    private double price;
    private double tax;


    public BaseProduct(Type type, String sku, String description, double price, double tax){
        this.type = type;
        this.description = description;
        this.sku = sku;
        this.price = price;
        this.tax = tax;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getSku() {
        return sku;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getTax() {
        return tax;
    }
}
