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
     * Description: Compares this Assignment object with the specified
     * Assignment object for order. Returns a negative integer, zero, or a
     * positive integer as this Assignment's ID is before, the same as, or after
     * the specified Assignment's ID, based on natural numeric ordering. Leading
     * zeroes, if any, are omitted from comparison.
     *
     * @param that the Assignment to compare this Assignment to
     * @return negative integer, zero, or positive integer
     */
    @Override
    public int compareTo(Assignment that) {
        if (this.assignmentID < that.getAssignmentID()) {
            return -1;
        } else if (this.assignmentID > that.getAssignmentID()) {
            return 1;
        } else {
            return 0;
        }
    }

    /**
     * Description: Generates and returns a String representation of this
     * Assignment object. The returned string contains the assignment name,
     * its unique ID, its due date, and any associated or required reading.
     * The returned string consumes three lines of output.
     *
     * @return a string representation of this Assignment object
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        String formatString = "%-10s%s";

        builder.append(this.name).append("  (ID: ")
                .append(String.format("%04d", this.assignmentID)).append(")");
        builder.append(System.lineSeparator());
        builder.append(String.format(formatString, "Due:", this.dueDate));
        builder.append(System.lineSeparator());
        builder.append(String.format(formatString, "Reading:", this.reading));

        return builder.toString();
    }

    /**
     * Description: Unit tests for the Assignment class.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date paramDate = new Date(3, 5, 2000);
        Assignment testAssignment = new Assignment(3, "Test Assignment",
                "Chapter 7, Pages 200-217", paramDate, "Homework", false);
        System.out.println(testAssignment);
    }

}
