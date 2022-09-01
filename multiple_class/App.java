public class App {
    public static void main(String[] args) {

        //WEAPON ITEMS
        Item knife = new Item(9 ,5.6f ,1 ,"very sharp", true);
        knife.sayMyPrice();

        Item sword = new Item(6 ,10.8f ,1 ,"super sharp", true);
        sword.sayMyPrice();

        Item shield = new Item(10 ,12.4f ,2 ,"sturdy af", false);
        shield.sayMyPrice();
        //PET
        pet Dog = new pet("bruh", 10, 10, true );
        Dog.sayMyPet();

        pet Cat = new pet("ëwwi", 5, 4, false );
        Cat.sayMyPet();

        pet Cockroach = new pet("mochi", 2, 1, true );
        Cockroach.sayMyPet();
    }
}
