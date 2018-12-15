package AssignmentManager;

/**
 * Description: A class to represent a single assignment with identifying
 * information, due date, associated readings, and completion status.
 *
 * @author Josh Thibeault
 */
public class Assignment implements Comparable<Assignment> {
    
    private final int assignmentID;
    private final String name;
    private final String reading;
    private final Date dueDate;
    private final String gradeCategory;
    private boolean complete;
    
    /**
     * 
     * @param assignmentID
     * @param name
     * @param reading
     * @param dueDate
     * @param gradeCategory
     * @param complete 
     */
    public Assignment(int assignmentID, String name, String reading,
            Date dueDate, String gradeCategory, boolean complete) {
        this.assignmentID = assignmentID;
        this.name = name;
        this.reading = reading;
        this.dueDate = dueDate;
        this.gradeCategory = gradeCategory;
        this.complete = complete;
    }
    
    /**
     * 
     * @return 
     */
    public int getAssignmentID() {
        return this.assignmentID;
    }
    
    /**
     * 
     * @return 
     */
    public String getName() {
        return this.name;
    }
    
    /**
     * 
     * @return 
     */
    public String getReading() {
        return this.reading;
    }
    
    /**
     * 
     * @return 
     */
    public Date getDueDate() {
        return this.dueDate;
    }
    
    /**
     * 
     * @return 
     */
    public String getGradeCategory() {
        return this.gradeCategory;
    }
    
    /**
     * 
     * @return 
     */
    public boolean isComplete() {
        return this.complete;
    }
    
    /**
     * 
     */
    public void markComplete() {
        this.complete = true;
    }
    
    /**
     * 
     * @param that
     * @return 
     */
    @Override
    public int compareTo(Assignment that) {
        return 0;
    }
    
    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        
        
        
        return builder.toString();
    }
    
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        
    }
    
}
