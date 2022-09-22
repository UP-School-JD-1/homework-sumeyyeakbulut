package product;

import enums.Sex;

import java.util.Date;

public class ProductTest {

    public static void main(String[] args) {

        FoodProduct food = new FoodProduct("895478", "Banana", 8, 40, new Date(2022, 9, 12), 5);
        ClothProduct cloth = new ClothProduct("86549", "T-shirt",5, 9, Sex.MEN, Size.X_LARGE);

        food.purchase();
        cloth.purchase();


    }
}
