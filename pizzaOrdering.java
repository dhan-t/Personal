import java.util.Scanner;

public class pizzaOrdering {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
//Calls out the orderPizza method which is the whole ordering method.
        orderPizza();
    }

    static void orderPizza() {
        
        System.out.println("==========================================");
        System.out.println("Welcome to Angelo's Pizzeria!");
        System.out.println("==========================================");

// Prompts user choose a meal set. Declares the variables for printing later.    
        System.out.println("Here is our menu:"
                + "\n SET(A) : (Creamy cheese pizza, Lasagna, Chicken Wings, Breadsticks)"
                + "\n SET(B) : (Hawaiian pizza, Lasagna, Fries)"
                + "\n SET(C) : (Pepperoni pizza, Fried Chicken, Fries)"
                + "\n[Ready to order? Type in the letter of the set you want!]");
        char choice = scan.next().charAt(0);

        String pizza = " ";
        int price = 0;
        switch (choice) {
            case 'A':
                System.out.println("Your meal set is SET (A)");
                pizza = "Creamy cheese pizza, Any chicken wings flavour";
                price = 600;
                    break;
            case 'B':
                System.out.println("Your meal set is SET (A)");
                pizza = "Hawaiian pizza, Any fries flavour";
                price = 400;
                    break;
            case 'C' :
                System.out.println("Your meal set is SET (A)");
                pizza = "Pepperoni pizza, Any fries flavour";
                price = 150;
                    break;
            default:
                System.out.println("Please enter A, B, or C!");
                break;
            }
        
//Prompts user to choose the pizza size.
        System.out.println("==========================================");
        System.out.println("What size would you like your pizza to be?"
                + "\n[*Note that the default is '(R)egular' and changing it will change the price.*]"
                + "\nSizes available: (L)arge, (M)edium, and (S)mall");
        char sizePizza = scan.next().charAt(0);

        String pizzaSize = " ";
        int additionalPrice = 0;
        switch (sizePizza) {
            case 'L':
                System.out.println("Your pizza size is Large.");
                pizzaSize = "Large";
                additionalPrice = 50;
                break;
            case 'M':
                System.out.println("Your pizza size is Medium.");
                pizzaSize = "Medium";
                additionalPrice = 20;
                break;
            case 'S':
                System.out.println("Your pizza size is Small.");
                pizzaSize = "Small";
                additionalPrice = 10;
                break;
            default:
                System.out.println("Your pizza size is Regular.");
                pizzaSize = "Regular";
                additionalPrice = 0;
                break;
        }

//Prompts user to pick a crust style.
        System.out.println("==========================================");
        System.out.println("Would you like to change the crust?"
                + "\n[*Note that the default is '(R)egular' and changing it will change the price.*]"
                + "\nSizes available: (T)hin crust or (H)and tossed crust");
        char pizzaCrust = scan.next().charAt(0);

        String crustPizza = " ";
        int additionalPrice2 = 0;

        switch (pizzaCrust) {
            case 'T':
                System.out.println("Your pizza crust is thin.");
                crustPizza = "Thin";
                additionalPrice2 = 50;
                break;
            case 'H':
                System.out.println("Your pizza crust is Hand tossed.");
                crustPizza = "Hand";
                additionalPrice2 = 30;
                break;
            default:
                System.out.println("Your pizza crust is Regular.");
                pizzaSize = "Regular crust";
                additionalPrice = 0;
                break;
        }

//Prompts user to quantify their order amount.
        System.out.println("==========================================");
        System.out.println("How many orders would you like to make?");
        int qnt = scan.nextInt();

//Prints out the whole order, factoring the changes in size, additional prices for the options, and multiplies them to the quantity of order.        
        System.out.println("==========================================");
        System.out.println("Your whole order is: " + pizza + ", " + pizzaSize + ", " + crustPizza
                + "and the total cost is: " + "P" + ((price + additionalPrice2 + additionalPrice) * (qnt)) + ".");

    }
}

// Created in Sep 22, 2022 in Mr. Elizer's class. Revisited in Jan 17, 2023.
