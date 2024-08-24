public class DistanceConversion {
    public static double footToMeter (double foot) {
        return foot * 0.305;

    }

    public static double meterToFoot (double meter) {
        return 3.279 * meter;
    }

    
    
    public static void main(String[] args) {
        //Top of the table
        System.out.println("Feet    Meters  |   Meters  Feet");

        //Outline of the table
        String firstHalf = "-".repeat(15);
        String secondHalf = "-".repeat(17);
        String output = firstHalf + " | " + secondHalf;
        System.out.println(output);

        //Loop for vertical |'s
        for (int i =0; i <11; i++) {
            System.out.println(" ".repeat(15) + " | "+" ".repeat(17));
        }
    }
}