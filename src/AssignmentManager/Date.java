package AssignmentManager;

/**
 * Description: A class to represent a specific date as a day, month, and year.
 *
 * @author Josh Thibeault
 */
public final class Date implements Comparable<Date> {

    private final int month;
    private final int day;
    private final int year;

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
     * Description: Compares this Date object with the specified Date object for
     * order. Returns a negative integer, zero, or a positive integer as this
     * Date is before, the same as, or after the specified Date.
     *
     * @param that Date to compare this Date to.
     * @return negative integer, zero, or positive integer
     */
    @Override
    public int compareTo(Date that) {
        if (this.getYear() < that.getYear()) {
            return -1;
        } else if (this.getYear() > that.getYear()) {
            return 1;
        } else {
            if (this.getMonth() < that.getMonth()) {
                return -1;
            } else if (this.getMonth() > that.getMonth()) {
                return 1;
            } else {
                if (this.getDay() < that.getDay()) {
                    return -1;
                } else if (this.getDay() > that.getDay()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }
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
        
        System.out.println(defaultDate.compareTo(paramDate));
        System.out.println(paramDate.compareTo(defaultDate));
        System.out.println(paramDate.compareTo(paramDate));
    }
}
