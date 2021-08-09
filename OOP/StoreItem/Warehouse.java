
package StoreItem;

// one Warehouse contain multiple StoreItems
public class Warehouse {
    private static final int MAX_CAPACITY = 1000;
    private StoreItem[] allItems;  
    private int numOfItems;
    private String warehouseAddress;
    
    public Warehouse(String address){
        allItems = new StoreItem[MAX_CAPACITY]; // 1000 is the max capacity
        numOfItems = 0;
        warehouseAddress = address;
    }
    
    public void addStoreItem(StoreItem item){
        if(numOfItems < MAX_CAPACITY){
            allItems[numOfItems] = item;
            numOfItems = numOfItems + 1;
        }else{
            System.out.println("It is full");
        }
    }
    
    // remove an item
    
    // summary e.g. count how many are perishable
    
    // countByLocation("A1")
    
    
}
