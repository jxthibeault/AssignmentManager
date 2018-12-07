package AssignmentManager;

/**
 * Description: A class representing a span of time from a start hour to an end
 * hour.
 *
 * @author Josh Thibeault
 */
public class TimeSpan implements Comparable<TimeSpan> {
    
    private int startHour;
    private int endHour;
    
    /**
     * 
     */
    public TimeSpan() {
        
    }
    
    /**
     * 
     * @param startHour
     * @param endHour 
     */
    public TimeSpan(int startHour, int endHour) {
        
    }
    
    /**
     * 
     * @return 
     */
    public int getSpanLength() {
        
        return 0;
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
    public int getEndHour() {
        return this.endHour;
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
