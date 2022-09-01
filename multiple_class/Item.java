public class Item {
    int price;
    float weight;
    int quantity;
    String description;
    boolean tradable;
    public void sayMyPrice() {
        System.out.println("This costs " + price + " and is great for " + description + "!!!");
    }
    public Item(int itemPrice, float itemWeight, int itemQuantity, String itemDescription, boolean itemTradable) {
            price = itemPrice;
            weight = itemWeight;
            quantity = itemQuantity;
            description = itemDescription;
            tradable = itemTradable;
            }
}
