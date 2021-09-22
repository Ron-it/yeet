public class Payment {
    private int DICount;
    private int FICount;

    private DrinkItem[] DI = new DrinkItem[100];// association relationship(has a ) one payment object can have up to
                                                // 100 drink item objects
    private FoodItem[] FI = new FoodItem[100];// association relationship(has a ) one payment object can have up to 100
                                              // food item objects

    private static double foodTax = 0.2;
    private static double drinkTax = 0.1;

    public Payment() {
        this.DICount = 0;
        this.FICount = 0;
    }

    public int getDICount() {
        return this.DICount;
    }

    public void setDICount(int DICount) {
        this.DICount = DICount;
    }

    public int getFICount() {
        return this.FICount;
    }

    public void setFICount(int FICount) {
        this.FICount = FICount;
    }

    public DrinkItem[] getDI() {
        return this.DI;
    }

    public void setDI(DrinkItem[] DI) {
        this.DI = DI;
    }

    public FoodItem[] getFI() {
        return this.FI;
    }

    public void setFI(FoodItem[] FI) {
        this.FI = FI;
    }

    public DrinkItem getDrinkItem(int x) {
        return DI[x];
    }

    public FoodItem getFoodItem(int x) {
        return FI[x];
    }

    public void addDrinkItem(DrinkItem drinkItem) {
        if (DICount <= 99) {
            DI[DICount] = drinkItem;
            DICount++;
        }
    }

    public void addFoodItem(FoodItem foodItem) {
        if (FICount <= 99) {
            FI[FICount] = foodItem;
            FICount++;
        }
    }

    @Override
    public String toString() {
        return "{" + " DICount='" + getDICount() + "'" + ", FICount='" + getFICount() + "'" + ", DI='" + getDI() + "'"
                + ", FI='" + getFI() + "'" + "}";
    }

}