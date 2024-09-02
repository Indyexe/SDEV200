public class TheTimeClass {


// Time class 
public class Time {
    private int hr;
    private int min;
    private int sec;
}

// This is the constructor that sets the time to the curent system time
public Time() {
    setTimeToCurrent();
}

// The time constructor that will be used to show the ammount of milliseconds ellapsed from 1970
public Time(long milliseconds) {
    convertFromMilliseconds(milliseconds);
}

public Time(int hour, int, minute, int second) {
    this.hr = hour;
    this.min = minute;
    this.sec = second;
}

//method for getting the hour
public int getHr() {
    return hr;
}


//method for getting second
public int getSec() {
    return sec;
}

private void setTimetoCurrent() {
    long currentMs = System.currentTimeMillis();
    convertFromMilliseconds(currentMs);
}

public Time(int hour, int minute, int second)

public static void main(String[] args) {


}

}