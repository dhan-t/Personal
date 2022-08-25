public class App {
    public static void main(String[] args) {

        Character archer = new Character();

        archer.strength = 6;
        archer.agility = 7;
        archer.intelligence = 5;
        archer.name = "SovaDiff";
        archer.sayMyStrength();
        archer.sayMyAgility();
        archer.sayMyIntelligence();
        archer.sayMyName();
    
        Character priest = new Character();

        priest.strength = 1;
        priest.agility = 3;
        priest.intelligence = 10;
        priest.name = "Merci";
        priest.sayMyName();
        priest.sayMyStrength();
        priest.sayMyAgility();
        priest.sayMyIntelligence();
        priest.sayMyName();

    }
}
