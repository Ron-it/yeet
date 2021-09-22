public class Test {
    public static void main(String[] args) {
        Payment table1 = new Payment();
        System.out.println(table1.getDrinkItem(0));

        FoodItem foodItem = new FoodItem("f1", 2);
        DrinkItem drinkItem = new DrinkItem("f2", 1);
        DrinkItem drinkItem2 = new DrinkItem("f3", 3);

        table1.addDrinkItem(drinkItem);
        table1.addDrinkItem(drinkItem2);
        table1.addFoodItem(foodItem);

        System.out.println(table1.getDICount());
        System.out.println(table1.getFICount());
        for (int i = 0; i < table1.getFICount(); i++) {
            System.out.println(table1.getFoodItem(i));
        }

    }
}
