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
        return "Not yet implemented.";
    }

    /**
     * Description: Generates and returns a string representation of this
     * TimeTable. The returned string is of the basic form:
     *    M TIME-TIME | T TIME-TIME | W TIME-TIME | R TIME-TIME | F TIME-TIME
     * With a few exceptions. Days on which there is no scheduled time are
     * omitted. Days with identical times are collapsed. In this example, there
     * is no scheduled time for Thursday, Monday and Tuesday have the same
     * scheduled time, and Wednesday and Friday have the same scheduled time:
     *    MT TIME-TIME | WF TIME-TIME
     * Note lastly that the pipe is omitted if there is only one block in the
     * string, for example:
     *    MTR TIME-TIME
     *
     * @return a string representation of the TimeTable object
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        if (this.monday == null && this.tuesday == null && this.wednesday == null
                && this.thursday == null && this.friday == null) {
            builder.append("No scheduled times in this time table.");
        } else {
            if (this.monday != null) {
                builder.append("M");
                if (this.monday.equals(this.tuesday)) {
                    builder.append("T");
                }
                if (this.monday.equals(this.wednesday)) {
                    builder.append("W");
                }
                if (this.monday.equals(this.thursday)) {
                    builder.append("R");
                }
                if (this.monday.equals(this.friday)) {
                    builder.append("F");
                }
                builder.append(" ").append(this.monday.toString()).append(" | ");
            }
            if (this.tuesday != null && !this.tuesday.equals(this.monday)) {
                builder.append("T");
                if (this.tuesday.equals(this.wednesday)) {
                    builder.append("W");
                }
                if (this.tuesday.equals(this.thursday)) {
                    builder.append("R");
                }
                if (this.tuesday.equals(this.friday)) {
                    builder.append("F");
                }
                builder.append(" ").append(this.tuesday.toString()).append(" | ");
            }
            if (this.wednesday != null && !this.wednesday.equals(this.tuesday)
                    && !this.wednesday.equals(this.monday)) {
                builder.append("W");
                if (this.wednesday.equals(this.thursday)) {
                    builder.append("R");
                }
                if (this.wednesday.equals(this.friday)) {
                    builder.append("F");
                }
                builder.append(" ").append(this.wednesday.toString()).append(" | ");
            }
            if (this.thursday != null && !this.thursday.equals(this.wednesday)
                    && !this.thursday.equals(this.tuesday)
                    && !this.thursday.equals(this.monday)) {
                builder.append("R");
                if (this.thursday.equals(this.friday)) {
                    builder.append("F");
                }
                builder.append(" ").append(this.thursday.toString()).append(" | ");
            }
            if (this.friday != null && !this.friday.equals(this.thursday)
                    && !this.friday.equals(this.wednesday)
                    && !this.friday.equals(this.tuesday)
                    && !this.friday.equals(this.monday)) {
                builder.append("F");
                builder.append(" ").append(this.friday.toString()).append(" | ");
            }
        }

        builder.delete(builder.length() - 3, builder.length());

        return builder.toString();
    }

    /**
     * Description: Unit tests for the TimeTable class.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TimeSpan monday = new TimeSpan(9, 30, 10, 30);
        TimeSpan tuesday = new TimeSpan(6, 30, 10, 30);
        TimeSpan wednesday = new TimeSpan(9, 45, 10, 30);
        TimeSpan thursday = new TimeSpan(6, 30, 10, 30);

        TimeTable testTable = new TimeTable(null, tuesday, wednesday,
                thursday, null);
        
        System.out.println(testTable.toString());

    }

}
