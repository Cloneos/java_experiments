import java.util.HashMap;

public class shipComponents {

    //defining the strings
    static String shipComponent;
    static String repairedComponent;
    static boolean partStatus;

    //main component
    public static void main(String[] args) {

        //hashmap for storing ship status
        HashMap<String, Boolean> shipParts = new HashMap<String, Boolean>();
            shipParts.put("Life Support",true);
            shipParts.put("Warp Drive",false);
            shipParts.put("Maneuvering Thrusters",false);
            shipParts.put("Commuications Array",true);
            shipParts.put("Door Control",false);

        //here are the cogs and gears for the repair system
        partStatus = shipParts.get(shipComponent);
        for (shipParts.put(repairedComponent,true);
             !partStatus;
             System.out.println(shipComponent + " has been repaired."));-
    }

    //the command for checking statusses
    public static void systemStatus(String shipComponent) {

        if (partStatus) {
            System.out.println(shipComponent + " is functioning.");
        }
        else {
            System.out.println(shipComponent + " is not functioning correctly. Please address this issue.");
        }
    }

    //the command for repairing systems
    public static void repairSystem(String shipComponent) {
        if (partStatus){
            System.out.println("This system does not need repair, it is already functioning.");
        }
        else {
            shipComponent = repairedComponent;

        }
    }
}