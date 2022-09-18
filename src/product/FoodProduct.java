package product;

import java.util.Date;

public class FoodProduct extends BaseProduct{

    private Date productionDate;
    private int life;

    public FoodProduct(String sku,String description, double price, double tax, Date productionDate, int life) {
        super(Type.CLOTH, sku, description, price, tax);
        this.productionDate = productionDate;
        this.life = life;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getLife() {
        return life;
    }

    @Override
    public void purchase() {
        System.out.println("You buy " + super.getDescription());
    }
}
