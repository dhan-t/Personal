import java.util.Scanner;

public class Switch {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        orderPizza();

    }
    static void orderPizza() {
        System.out.println("Welcome to Angelo's Pizzeria! \n Here is our menu: \n SETA : (Creamy cheese pizza, Chicken Wings, Lasagna, Breadsticks) \n SETB : (Hawaiian pizza, Lasagna, Fries) \n SETC : (Pepperoni pizza, Chicken, Fries) \n Ready to order? Type in the letter of the set you want!");
        char choice = scan.next().charAt(0);

        String pizza = " ";
        int price = 0 ;

        switch (choice) {
            case 'A' -> {
                pizza = "Creamy cheese pizza, Any chicken wings flavour";
                price = 600;
            }
            case 'B' -> {
                pizza = "Hawaiian pizza, Any fries flavour";
                price = 400;
            }
            case 'C' -> {
                pizza = "Pepperoni pizza, Any fries flavour";
                price = 150;
            }
            default -> {
                System.out.println("Please enter A, B, or C!");
                return;
                }
                System.out.println("What size would you like your pizza to be? \nNote that the default is 'Regular' and changing it will change the price.\nSizes available: (L)arge, (M)edium, (S)mall, and (R)egular");
                char sizePizza = scan.next().charAt(0);

                String pizzaSize = " ";
                int additionalPrice = 0;

                 switch (sizePizza) {
                     case 'L':
                         System.out.println("Your pizza size is Large");
                         pizzaSize = "Large";
                         additionalPrice = 50;
                         break;
                     case 'M':
                         System.out.println("Your pizza size is Medium");
                         pizzaSize = "Medium";
                         additionalPrice = 20;
                         break;
                     case 'S':
                         System.out.println("Your pizza size is Small");
                         pizzaSize = "Small";
                         additionalPrice = 10;
                         break;
                     default:
                         System.out.println("Your pizza size is Regular");
                         pizzaSize = "Regular";
                         additionalPrice = 0;
                         break;
                 }
                 System.out.println("Would you like to change anything to the crust?\nNote that the default is 'Regular' and changing it will change the price.\n(T)hin or (H)and tossed");
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
                                System.out.println("Your pizza crust is Regular");
                                pizzaSize = "Regular crust";
                                additionalPrice = 0;
                                break;
                        }

                        System.out.println("How many orders would you like to make?");
                        int qnt = scan.nextInt();


                    System.out.println("Your whole order is: " + pizza + " " + pizzaSize + " " + crustPizza + " and the whole cost is: " +((price+additionalPrice2+additionalPrice)*(qnt))+"!" );
        }


}
