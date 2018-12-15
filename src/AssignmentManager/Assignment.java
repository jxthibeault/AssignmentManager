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
     * Description: Creates a new Assignment object with an assignment ID, name,
     * related readings, due date, grading category, and completion status. Note
     * that under ideal usage, assignment ID should be unique to each Assignment
     * object.
     *
     * @param assignmentID unique identifier for this assignment
     * @param name name or brief description of assignment
     * @param reading associated or required readings for the assignment
     * @param dueDate date by which assignment is due
     * @param gradeCategory category on grading rubric assignment belongs to
     * @param complete whether or not assignment is complete
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
     * Description: Gets and returns this assignment's ID.
     *
     * @return assignment identifier of the assignment
     */
    public int getAssignmentID() {
        return this.assignmentID;
    }

    /**
     * Description: Gets and returns the name or brief description of this
     * assignment.
     *
     * @return name or brief description of the assignment
     */
    public String getName() {
        return this.name;
    }

    /**
     * Description: Gets and returns the associated or required readings for
     * this assignment.
     *
     * @return associated or required readings for the assignment
     */
    public String getReading() {
        return this.reading;
    }

    /**
     * Description: Gets and returns the due date of this assignment.
     *
     * @return due date of the assignment
     */
    public Date getDueDate() {
        return this.dueDate;
    }

    /**
     * Description: Gets and returns the grading category to which this
     * assignment belongs.
     *
     * @return grading category to which this assignment belongs
     */
    public String getGradeCategory() {
        return this.gradeCategory;
    }

    /**
     * Description: Gets and returns the completion status of this assignment.
     *
     * @return true if assignment is complete, otherwise false
     */
    public boolean isComplete() {
        return this.complete;
    }

    /**
     * Description: Marks this assignment as complete, regardless of prior
     * completion status.
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
