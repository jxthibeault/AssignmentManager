package AssignmentManager;

/**
 * Description: A class to represent a specific date as a day, month, and year.
 *
 * @author Josh Thibeault
 */
public class Date implements Comparable<Date> {

    private int month;
    private int day;
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
    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
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
     * Description: Builds and returns a String representation of the Date
     * object. The returned String is of the form mm-dd-yyyy.
     *
     * @return a String representation of the Date object
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append(String.format("%02d", this.month)).append("-");
        builder.append(String.format("%02d", this.day)).append("-");
        builder.append(String.format("%04d", this.year));

        return builder.toString();
    }

    /**
     * Description: Unit tests for the Date class.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date defaultDate = new Date();
        Date paramDate = new Date(3, 5, 2000);
        
        System.out.println(defaultDate);
        System.out.println(paramDate);
    }
}
