public class TheTimeClass {

    // Time class 
    public final class Time { 
        private int hr;
        private int min;
        private int sec;

        // This is the constructor that sets the time to the current system time
        public Time() { 
            setTimeToCurrent(); 
        }

        // The time constructor that will be used to show the amount of milliseconds elapsed from 1970
        public Time(long milliseconds) { 
            convertFromMilliseconds(milliseconds); 
        }

        // Constructor that initializes the time with specific hour, minute, and second
        public Time(int hour, int minute, int second) { 
            this.hr = hour;
            this.min = minute;
            this.sec = second;
        }

        // Method for getting the hour
        public int getHr() {
            return hr;
        }

        // Method for getting the minute
        public int getMin() {
            return min;
        }

        // Method for getting the second
        public int getSec() {
            return sec;
        }

        // Private method to set the time to the current system time
        private void setTimeToCurrent() { 
            long currentMs = System.currentTimeMillis();
            convertFromMilliseconds(currentMs); 
        }

        // Method for converting the milliseconds to hours, minutes, and seconds
        public void convertFromMilliseconds(long ms) { 
            long totalSecs = ms / 1000;
            this.sec = (int)(totalSecs % 60);
            long totalMins = totalSecs / 60;
            this.min = (int)(totalMins % 60);
            long totalHrs = totalMins / 60;
            this.hr = (int)(totalHrs % 24);
        }
    }

    
    public static void main(String[] args) {
        // Instantiating the Time objects
        TheTimeClass outer = new TheTimeClass();
        Time timenow = outer.new Time(); // Creating an instance with the current time
        Time elapsedTime = outer.new Time(555550000); // Creating an instance with milliseconds since 1970
        Time specifiedTime = outer.new Time(5, 23, 55); // Creating an instance with specific hour, minute, and second

        // Displays all the different times
        System.out.println("The current time is: " + timenow.getHr() + ":" + timenow.getMin() + ":" + timenow.getSec());
        System.out.println("The Elapsed time is: " + elapsedTime.getHr() + ":" + elapsedTime.getMin() + ":" + elapsedTime.getSec());
        System.out.println("The Specified time is: " + specifiedTime.getHr() + ":" + specifiedTime.getMin() + ":" + specifiedTime.getSec());
    }
}
