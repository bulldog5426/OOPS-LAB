public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    // Constructor to initialize time to zero
    public Time() {
        hours = 0;
        minutes = 0;
        seconds = 0;
    }

    // Constructor to initialize time to a fixed value
    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    // Display time in hh:mm:ss format
    public void displayTime() {
        System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds);
    }

    // Add two Time objects and return a new Time object
    public Time addTime(Time otherTime) {
        int newHours = this.hours + otherTime.hours;
        int newMinutes = this.minutes + otherTime.minutes;
        int newSeconds = this.seconds + otherTime.seconds;

        // Check for carry-over from seconds to minutes and from minutes to hours
        if (newSeconds >= 60) {
            newSeconds -= 60;
            newMinutes++;
        }
        if (newMinutes >= 60) {
            newMinutes -= 60;
            newHours++;
        }

        return new Time(newHours, newMinutes, newSeconds);
    }

    public static void main(String[] args) {
        // Create two Time objects
        Time time1 = new Time(2, 30, 45);
        Time time2 = new Time(1, 45, 15);

        // Display the initial times
        System.out.println("Time 1:");
        time1.displayTime();
        System.out.println("Time 2:");
        time2.displayTime();

        // Add the two times and display the result
        Time sumTime = time1.addTime(time2);
        System.out.println("Sum of Time 1 and Time 2:");
        sumTime.displayTime();
    }
}
