public class Character {
    int strength; 
    int agility;
    int intelligence;
    String name;

    public void sayMyName() {
        System.out.println("Hello I am " + name);
    }

    public void sayMyStrength() {
            System.out.println("My power level is" + strength);
    }

    public void sayMyAgility() {
        System.out.println("My power speed is" + agility);
    }

    public void sayMyIntelligence() {
        System.out.println("My knowledge is" + intelligence);
    }
    
}
