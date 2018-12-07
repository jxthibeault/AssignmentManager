package AssignmentManager;

/**
 * Description: A class representing a schedule of times for each weekday (that
 * is: Monday, Tuesday, Wednesday, Thursday, and Friday).
 *
 * @author Josh Thibeault
 */
public final class TimeTable {

    private final TimeSpan monday;
    private final TimeSpan tuesday;
    private final TimeSpan wednesday;
    private final TimeSpan thursday;
    private final TimeSpan friday;

    /**
     * Description: Default constructor for TimeTable. The default TimeTable
     * contains no scheduled times for any days of the week.
     */
    public TimeTable() {
        this(null, null, null, null, null);
    }

    /**
     * Description: Constructor for TimeTable accepting a scheduled time for
     * each day of the week. If a particular day of the week has no scheduled
     * time, pass in a null reference.
     *
     * @param monday time span for Monday
     * @param tuesday time span for Tuesday
     * @param wednesday time span for Wednesday
     * @param thursday time span for Thursday
     * @param friday time span for Friday
     */
    public TimeTable(TimeSpan monday, TimeSpan tuesday, TimeSpan wednesday,
            TimeSpan thursday, TimeSpan friday) {
        this.monday = monday;
        this.tuesday = tuesday;
        this.wednesday = wednesday;
        this.thursday = thursday;
        this.friday = friday;
    }

    /**
     * Description: Gets and returns the TimeSpan object for Monday.
     *
     * @return a reference to the TimeSpan object for Monday
     */
    public TimeSpan getMondayTimes() {
        return this.monday;
    }

    /**
     * Description: Gets and returns the TimeSpan object for Tuesday.
     *
     * @return a reference to the TimeSpan object for Tuesday
     */
    public TimeSpan getTuesdayTimes() {
        return this.tuesday;
    }

    /**
     * Description: Gets and returns the TimeSpan object for Wednesday.
     *
     * @return a reference to the TimeSpan object for Wednesday
     */
    public TimeSpan getWednesdayTimes() {
        return this.wednesday;
    }

    /**
     * Description: Gets and returns the TimeSpan object for Thursday.
     *
     * @return a reference to the TimeSpan object for Thursday
     */
    public TimeSpan getThursdayTimes() {
        return this.thursday;
    }

    /**
     * Description: Gets and returns the TimeSpan object for Friday.
     *
     * @return a reference to the TimeSpan object for Friday
     */
    public TimeSpan getFridayTimes() {
        return this.friday;
    }

    /**
     *
     * @return
     */
    public String fullTimeTableString() {
        return null;
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
