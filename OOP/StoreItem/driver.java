/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StoreItem;

/**
 *
 * @author s510
 */
public class Driver {
    public static void main(String[] args) {
        System.out.println("------------- items -------------------");
        StoreItem pencil = new StoreItem("pencil", 0.7, "H1", false);
        System.out.println("pencil price (include tax): " + pencil.calculatePriceIncTax());

        StoreItem thermo = new StoreItem("thermometer", 12.5);
        System.out.println("pencil price (include tax): " + thermo.calculatePriceIncTax());
        // System.out.println(thermo.name);
        System.out.println(thermo.getName());
        thermo.setName("thermometer ABC brand");
        System.out.println(thermo.getName());

        System.out.println(thermo.getPrice());
        thermo.setPrice(13.8);
        System.out.println(thermo.getPrice());

        System.out.println(thermo.getPerishable());

        System.out.println(thermo.toString());

        System.out.println(thermo); // if nothing is there toString()

        // System.out.println("------------- items from user input-------------------");
        // String name = IBIO.inputString("please enter the name: ");
        // double price = IBIO.inputDouble("please enter the price: ");
        // String location = IBIO.inputString("please enter the location: ");
        // boolean perishable = IBIO.inputBoolean("is this item perishable: ");
        // StoreItem currentItem = new StoreItem(name, price, location, perishable);
        // System.out.println(currentItem);

        System.out.println("------------- array of objects -------------------");
        int numOfItems = IBIO.inputInt("please indicate how many items there are in the first batch: ");
        // int[] arr = new int[5];
        StoreItem[] firstBatch = new StoreItem[numOfItems];
        for (int i = 0; i < numOfItems; i++) {
            String name = IBIO.inputString("please enter the name: ");
            double price = IBIO.inputDouble("please enter the price: ");
            String location = IBIO.inputString("please enter the location: ");
            boolean perishable = IBIO.inputBoolean("is this item perishable: ");
            StoreItem currentItem = new StoreItem(name, price, location, perishable);
            firstBatch[i] = currentItem;
        }

        // Q1: calculate the total price of all the items inclusive of tax
        // Hint: call calculatePriceIncTax method
        double total = 0;
        for (int i = 0; i < numOfItems; i++) {
            total = total + firstBatch[i].calculatePriceIncTax();
        }
        System.out.println("total price (inclusive tax): " + total);

        // Q2: calculate the total price of all perishable items exclusive of tax
        double totalPricePerishable = 0;
        int numOfPerishableItems = 0;
        for (int i = 0; i < numOfItems; i++) {
            // individual item - firstBatch[i]
            if (firstBatch[i].getPerishable() == true) {
                totalPricePerishable = totalPricePerishable + firstBatch[i].getPrice();
                numOfPerishableItems = numOfPerishableItems + 1;
            }
        }
        System.out.println("total price of all perishable (exclusive tax): " + totalPricePerishable);
        System.out.println("numOfPerishableItems: " + numOfPerishableItems);

        // Q3: now we want to have a second batch
        int numOfItems2ndBatch = IBIO.inputInt("please indicate how many items there are in the second batch: ");
        StoreItem[] secondBatch = new StoreItem[numOfItems2ndBatch];
        for (int i = 0; i < numOfItems2ndBatch; i++) {
            String name = IBIO.inputString("please enter the name: ");
            double price = IBIO.inputDouble("please enter the price: ");
            secondBatch[i] = new StoreItem(name, price);
        }

        System.out.println("------------- method ------------------");
        System.out.println(add(3, 5)); // actual value/actual parameter/argument
        System.out.println(add(13, 15)); // actual value/actual parameter/argument
    }

    public static int add(int a, int b) { // formal parameter/parameter
        return a + b;
    }
}
