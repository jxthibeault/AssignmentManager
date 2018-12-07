package AssignmentManager;

/**
 * Description: A class representing a span of time from a start hour to an end
 * hour.
 *
 * @author Josh Thibeault
 */
public class TimeSpan implements Comparable<TimeSpan> {

    private int startHour;
    private int startMinute;

    private int endHour;
    private int endMinute;

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
     *
     * @return
     */
    public int calcSpanLength() {

        return 0;
    }
    
    public String startTimeString() {
        return null;
    }
    
    public String endTimeString() {
        return null;
    }

    /**
     *
     * @return
     */
    public int getStartHour() {
        return this.startHour;
    }
    
    /**
     * 
     * @return 
     */
    public int getStartMinute() {
        return this.startMinute;
    }

    /**
     *
     * @return
     */
    public int getEndHour() {
        return this.endHour;
    }
    
    /**
     * 
     * @return 
     */
    public int getEndMinute() {
        return this.endMinute;
    }

    /**
     *
     * @param that
     * @return
     */
    @Override
    public int compareTo(TimeSpan that) {
        return 0;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return null;
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

    }

}
