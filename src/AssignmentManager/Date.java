package AssignmentManager;

/**
 * Description: A class to represent a specific date as a day, month, and year.
 *
 * @author Josh Thibeault
 */
public class Date implements Comparable<Date> {

    private int day;
    private int month;
    private int year;

    /**
     * Description: Default constructor for Date. Default date is 01/01/1970.
     */
    public Date() {
        this(1, 1, 1970);
    }

    /**
     * Description: Constructor for Date taking a day, month, and year. Note
     * that the year number uses 0 A.D. as zero.
     *
     * @param day the day number
     * @param month the month number
     * @param year the year number
     */
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    /**
     * Description: Gets and returns the Date's day field.
     *
     * @return the day number
     */
    public int getDay() {
        return this.day;
    }

    /**
     * Description: Gets and returns the Date's month field.
     *
     * @return the month number
     */
    public int getMonth() {
        return this.month;
    }

    /**
     * Description: Gets and returns the Date's year field.
     *
     * @return the year number
     */
    public int getYear() {
        return this.year;
    }

    /**
     *
     * @param that
     * @return
     */
    @Override
    public int compareTo(Date that) {
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
