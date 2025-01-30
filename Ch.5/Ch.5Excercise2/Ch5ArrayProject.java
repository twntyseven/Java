public class Ch5ArrayProject {
    public static void main(String[] args) {

        Ocean blackSea = new Ocean(); // Create an ocean object

        // Assign the new ocean a depth and hue
        blackSea.oceanDepth = 600; 
        blackSea.oceanHue = "Dark Blue";

        // Print the new ocean and its attributes
        System.out.println("You will be sailing in the Black Sea today. The Sea is " + blackSea.oceanDepth + " meters deep and has a " + blackSea.oceanHue + " hue."); 


        Ship stMary = new Ship(); // Create a ship object

        // Set the sails of the ship and use the default ship material
        stMary.isSailRaised = false; 

        // Print the new ship and its attributes
        System.out.println("You ship, the St. Mary, has a " + stMary.shipMaterial + " hull and it is " + stMary.isSailRaised + " that the sail is raised. ");


        UndeadArmy skeletalArmy = new UndeadArmy(); // Create an undead army

        // Assign the new army a size and banner color
        skeletalArmy.bannerColor = "Red";
        skeletalArmy.armySize = 1000;

        // Print the new army and its attributes
        System.out.println("The skeletal army has a high presence in this sea. Their army is mainly comprised of " + skeletalArmy.armySize + " skeletons, draped in " + skeletalArmy.bannerColor + " to match their banner.");

    }
}