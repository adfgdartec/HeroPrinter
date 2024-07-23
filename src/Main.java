public class Main {
    public static void main(String[] args){
        //Set the value of vars
         String name = "The Ember Shadow";
         int strength = 4;
         double health = 120.5;
         boolean hasWeapon = true;
         boolean hasAgility = true;

        //Output Vars
        System.out.println("SuperHero Name: " + name);
        System.out.println("Strength: " + strength);
        System.out.println("Health: " + health);
        System.out.println("HasWeapon: " + hasWeapon);
        System.out.println("hasAgility: " + hasAgility);

        //Reassign Values
        health -= 2;
        System.out.println( "Dr. Rhinoseros hits The Ember Shadow and does 2 damage.");
        System.out.println("Health: " + health);

        strength *=2;
        System.out.println("The Ember Shadow trains hard to get stronger.");
        System.out.println("Strength: " + strength);

        health -=4;
        System.out.println("The Ember Shadow hits Dr.Rhinoseros with more damage.");
        System.out.println("Health: " + health);

        strength *=2;
        System.out.println("Dr.Rhinoceros gains some strength.");
        System.out.println("Strength: " + strength);

        health -=8;
        System.out.println("Dr.Rhinoceros hits The Ember Shadow with even more damage.");
        System.out.println("Health: " + health);

        strength *=2;
        System.out.println("The Ember Shadow trains hard to get stronger.");
        System.out.println("Strength: " + strength);

        health -=16;
        System.out.println("The Ember Shadow hits Dr.Rhinoseros with more damage.");
        System.out.println("Health: " + health);

        strength *=2;
        System.out.println("Dr.Rhinoceros gains some strength.");
        System.out.println("Strength: " + strength);

        health -=32;
        System.out.println("Dr.Rhinoceros hits The Ember Shadow with even more damage.");
        System.out.println("Health: " + health);







    }
}
