package AssignmentManager;

/**
 * Description: A class representing a schedule of times for each weekday (that
 * is: Monday, Tuesday, Wednesday, Thursday, and Friday).
 *
 * @author Josh Thibeault
 */
public class TimeTable {

    private TimeSpan monday;
    private TimeSpan tuesday;
    private TimeSpan wednesday;
    private TimeSpan thursday;
    private TimeSpan friday;

    /**
     * 
     */
    public TimeTable() {

    }

    /**
     * 
     * @param monday
     * @param tuesday
     * @param wednesday
     * @param thursday
     * @param friday 
     */
    public TimeTable(TimeSpan monday, TimeSpan tuesday, TimeSpan wednesday,
            TimeSpan thursday, TimeSpan friday) {

    }
    
    /**
     * 
     * @return 
     */
    public TimeSpan getMondayTimes() {
        return this.monday;
    }
    
    /**
     * 
     * @return 
     */
    public TimeSpan getTuesdayTimes() {
        return this.tuesday;
    }
    
    /**
     * 
     * @return 
     */
    public TimeSpan getWednesdayTimes() {
        return this.wednesday;
    }
    
    /**
     * 
     * @return 
     */
    public TimeSpan getThursdayTimes() {
        return this.thursday;
    }
    
    /**
     * 
     * @return 
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
