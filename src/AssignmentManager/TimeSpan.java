package AssignmentManager;

/**
 * Description: A class representing a span of time from a start time to an end
 * time. This class supports hours-only usage or hours-minutes usage.
 *
 * @author Josh Thibeault
 */
public final class TimeSpan implements Comparable<TimeSpan> {

    private final int startHour;
    private final int startMinute;

    private final int endHour;
    private final int endMinute;

    /**
     * Description: Default constructor for TimeSpan. The default start time for
     * the span is 00:00, and the default end time is 23:59.
     */
    public TimeSpan() {
        this(0, 0, 23, 59);
    }

    /**
     * Description: Constructor for TimeSpan taking startHour and endHour as
     * parameters. Performs validation on inputs to ensure that hours are within
     * a valid range. Hours less than zero are set to zero, and hours greater
     * than 23 are set to 23. Minutes are set to 0.
     *
     * @param startHour the starting hour of the time span
     * @param endHour the ending hour of the time span
     */
    public TimeSpan(int startHour, int endHour) {
        this(startHour, 0, endHour, 0);
    }

    /**
     * Description: Constructor for TimeSpan taking startHour, startMinute,
     * endHour, and endMinute as parameters. Performs validation on inputs to
     * ensure that hours and minutes are within valid ranges. Hours less than
     * zero are set to zero, hours greater than 23 are set to 23, minutes less
     * than zero are set to zero, and minutes greater than 59 are set to 59.
     *
     * @param startHour the starting hour of the time span
     * @param startMinute the starting minute of the time span
     * @param endHour the ending hour of the time span
     * @param endMinute the ending minute of the time span
     */
    public TimeSpan(int startHour, int startMinute, int endHour, int endMinute) {
        this.startHour = this.validateHour(startHour);
        this.startMinute = this.validateMinute(startMinute);

        this.endHour = this.validateHour(endHour);
        this.endMinute = this.validateMinute(endMinute);
    }

    /**
     * Description: Private method for validating hour input. Hours less than
     * zero are returned as zero. Hours greater than 23 are returned as 23.
     * Otherwise, the hour passed in is returned without mutation.
     *
     * @param hour the hour to validate
     * @return the validated version of the hour
     */
    private int validateHour(int hour) {
        if (hour < 0) {
            return 0;
        } else if (hour > 23) {
            return 23;
        } else {
            return hour;
        }
    }

    /**
     * Description: Private method for validating minute input. Minutes less
     * than zero are returned as zero. Minutes greater than 59 are returned as
     * 59. Otherwise, the minute passed in is returned without mutation.
     *
     * @param minute the minute to validate
     * @return the validated version of the minute
     */
    private int validateMinute(int minute) {
        if (minute < 0) {
            return 0;
        } else if (minute > 59) {
            return 59;
        } else {
            return minute;
        }
    }

    /**
     * Description: Returns the length of time elapsed between the start and end
     * times, in minutes.
     *
     * @return the number of minutes elapsed from start time to end time
     */
    public int calcSpanLength() {
        final int hourDiff, minuteDiff, elapsedTime;

        hourDiff = this.endHour - this.startHour;
        minuteDiff = this.endMinute - this.startMinute;
        elapsedTime = (60 * hourDiff) + minuteDiff;

        return elapsedTime;
    }

    /**
     * Description: String representation of the start time in the form HH:MM.
     *
     * @return a string representation of the start time
     */
    public String startTimeString() {
        StringBuilder builder = new StringBuilder();

        builder.append(String.format("%02d", this.startHour));
        builder.append(":");
        builder.append(String.format("%02d", this.startMinute));

        return builder.toString();
    }

    /**
     * Description: String representation of the end time in the form HH:MM.
     *
     * @return a string representation of the end time
     */
    public String endTimeString() {
        StringBuilder builder = new StringBuilder();

        builder.append(String.format("%02d", this.endHour));
        builder.append(":");
        builder.append(String.format("%02d", this.endMinute));

        return builder.toString();
    }

    /**
     * Description: Gets and returns the start hour.
     *
     * @return the start hour of the span
     */
    public int getStartHour() {
        return this.startHour;
    }

    /**
     * Description: Gets and returns the start minute.
     *
     * @return the start minute of the span
     */
    public int getStartMinute() {
        return this.startMinute;
    }

    /**
     * Description: Gets and returns the end hour.
     *
     * @return the end hour of the span
     */
    public int getEndHour() {
        return this.endHour;
    }

    /**
     * Description: Gets and returns the end minute.
     *
     * @return the end minute of the span
     */
    public int getEndMinute() {
        return this.endMinute;
    }

    /**
     * Description: Compares this TimeSpan object with the specified TimeSpan
     * object for order. Returns a negative integer, zero, or a positive integer
     * as this TimeSpan is before, the same as, or after the specified TimeSpan
     * within an arbitrary 24-hour period.
     *
     * @param that the TimeSpan to compare this TimeSpan to
     * @return negative integer, zero, or positive integer
     */
    @Override
    public int compareTo(TimeSpan that) {
        if(that == null) {
            return 1;
        }
        
        if (this.getStartHour() < that.getStartHour()) {
            return -1;
        } else if (this.getStartHour() > that.getStartHour()) {
            return 1;
        } else {
            if (this.getStartMinute() < that.getStartMinute()) {
                return -1;
            } else if (this.getStartMinute() > that.getStartMinute()) {
                return 1;
            } else {
                return 0;
            }
        }
    }
    
    /**
     * Description: Checks if this TimeSpan object is equal to the specified
     * TimeSpan object by comparing all properties of the two. The two objects
     * are equal if, and only if, all of their properties are identical.
     * 
     * @param that the TimeSpan to compare this TimeSpan against
     * @return true if this is equal to that, otherwise false
     */
    public boolean equals(TimeSpan that) {
        return (this.compareTo(that) == 0);
    }

    /**
     * Description: String representation of the TimeSpan object. The returned
     * String is of the form HH:MM - HH:MM, representing start time to end time.
     *
     * @return a string representation of the TimeSpan object
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append(this.startTimeString());
        builder.append("-");
        builder.append(this.endTimeString());

        return builder.toString();
    }

    /**
     * Description: Unit tests for the TimeSpan class.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TimeSpan defaultSpan = new TimeSpan();
        TimeSpan hoursSpan = new TimeSpan(-3, 50);
        TimeSpan minutesSpan = new TimeSpan(13, -2, 16, 50);

        System.out.println(defaultSpan.toString());
        System.out.println(hoursSpan.toString());
        System.out.println(minutesSpan.toString());
        
        System.out.println(defaultSpan.compareTo(hoursSpan));
        System.out.println(defaultSpan.compareTo(minutesSpan));
        System.out.println(minutesSpan.compareTo(defaultSpan));

        System.out.println(defaultSpan.calcSpanLength());
        System.out.println(hoursSpan.calcSpanLength());
        System.out.println(minutesSpan.calcSpanLength());
    }

}
