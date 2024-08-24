public class DistanceConversion {
    public static double footToMeter (double foot) {
        return foot * 0.305;

    }

    public static double meterToFoot (double meter) {
        return 3.2787 * meter; /* I couldn't figure out this conversion rate as the one in the textbook was 3.279, which didn't give me
        the correct values for the meters to feet output. This was the number that got me the closest to the table values which were on the
        textbook*/

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
            //for the line of code below I used this article https://stackoverflow.com/questions/153724/how-to-round-a-number-to-n-decimal-places-in-java to help me round the decimal places
            String row = String.format("%.1f         %.3f       |       %.1f       %.3f", feet, metersFromFeet, meters, feetFromMeters);
            System.out.println(row);
        }
    }
}