public class DistanceConversion {
    public static double footToMeter (double foot) {
        return foot * 0.305;

    }

    public static double meterToFoot (double meter) {
        return 3.279 * meter;
    }

    
    
    public static void main(String[] args) {
        //Top of the table
        System.out.println("Feet        Meters      |      Meters      Feet");

        //Outline of the table
        String firstHalf = "-".repeat(23);
        String secondHalf = "-".repeat(24);
        String output = firstHalf + " | " + secondHalf;
        System.out.println(output);

        //Loop for table output
        for (int i =1; i <11; i++) {
            double feet = i;
            double metersFromFeet = footToMeter(feet);

            double meters = 20.0 + 5 * (i - 1);
            double feetFromMeters = meterToFoot(meters);

            String row = feet + "       " + metersFromFeet + "      |       "+ meters + "       "+ feetFromMeters;
            System.out.println(row);
        }
    }
}