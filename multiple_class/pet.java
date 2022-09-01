public class pet {
    String Name;
    int trustlevel;
    int petlevel;
    boolean ishappy;

    public void sayMyPet() {
        System.out.println("My name is " + Name + " and I am " + petlevel + " years old.");
    }

    public pet(String petName, int petTrust, int petlevel, boolean petHappy) {
        Name = petName;
        trustlevel = petTrust;
        ishappy = petHappy;
    }
}
