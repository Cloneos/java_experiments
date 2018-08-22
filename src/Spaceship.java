public class Spaceship extends shipComponents{
    //here are the strings to create the spaceship
    String ShipName;
    static int Health;
    static int Ammo;

    //this is so that the creator of the object interprets everything correctly
    public Spaceship(String shipname,int currentHealth,int currentAmmo) {
        this.ShipName = shipname;
        this.Health = currentHealth;
        this.Ammo = currentAmmo;
    }

    //this is for checking out the stats of a ship
    public void checkShip() {
        System.out.println("Your ship is called " + ShipName);
        System.out.println("Your hull is at " + Health + "%");
        System.out.println("You have " + Ammo + " bullets");
        }


    //this is the main command
    public static void main (String[] args) {
        Spaceship standardship = new Spaceship("Theseus",100,10);
        standardship.checkShip();
        standardship.systemStatus("Life Support");
    }

}
/*
my expected output is:

Your ship is called Theseus
Your health is 10
You have 10 bullets
 */