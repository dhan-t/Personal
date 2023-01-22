import java.util.Scanner;

public class App {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        //myOrder();
        boole();

        scan.close();
 }
   /*  static void myOrder() {

        /*System.out.println("Welcome to KFC! What would you like to order?");
        System.out.println("Your first order: ");
        String firstOrder = scan.nextLine();
        System.out.println("Price: ");
        double price1 = scan.nextDouble();

        scan.nextLine();

        System.out.println("Your second order: ");
        String secondOrder = scan.nextLine();
        System.out.println("Price: ");
        double price2 = scan.nextDouble();

        scan.nextLine();

        System.out.println("Your third order: ");
        String thirdOrder = scan.nextLine();
        System.out.println("Price: ");
        double price3 = scan.nextDouble();

        double priceTotal = price1 + price2 + price3;

        System.out.println("Your order is: " + firstOrder + secondOrder + thirdOrder + ".");
        System.out.println("Total: " + priceTotal);
*/
        static void boole() {
        System.out.println("Welcome to KFC-Naic! Ready to order?" + "\n" + "Type in True or False");
        boolean start = scan.nextLine();
        if (start == true){
            System.out.println("Here is our menu:" + "\n" + "Set A ($9)" + "\n" + "Set B ($3)" + "\n" + "Set C ($7)");
        } else if (start == false){
            System.out.println("That's okay." + "\n" + "Order when you're ready!");
        }
}
    static void myOorder(){
        System.out.println("Select a set!");
        System.out.println("Add to cart");
        scan.nextLine();
        
       
    }
}



//Unfinished code, created Sep. 15, 2022
