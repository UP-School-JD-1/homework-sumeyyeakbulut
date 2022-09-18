package product;

public class ClothProduct extends BaseProduct {

    private Sex sex;
    private Size size;

    public ClothProduct(String sku, String description, double price, double tax, Sex sex, Size size) {
        super(Type.CLOTH, sku, description , price, tax);
        this.sex = sex;
        this.size = size;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    @Override
    public void purchase() {
        System.out.println("You buy " + super.getDescription());
    }
}
