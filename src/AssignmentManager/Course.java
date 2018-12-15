package AssignmentManager;

import java.util.TreeMap;

/**
 * Description: A class to represent a Course. A Course acts as a representation
 * of an actual course, as well as acting as a container for related assignments
 * and course info including instructor, meeting times, absences, and other
 * important course information.
 *
 * @author Josh Thibeault
 */
public class Course implements Comparable<Course> {

    private final String courseCode;
    private final String title;
    private final String location;
    private final Instructor instructor;
    private final GradeRubric gradeRubric;
    private final TimeTable schedule;
    private final String additionalInfo;

    private TreeMap<Integer, Assignment> assignments;
    private int absences;

    /**
     * Description: Creates a Course object with a course code and title. Note
     * that all information about the Course except for its assignments and
     * absences is immutable once the constructor has been called.
     *
     * @param courseCode the course code for the course
     * @param title the title of the course
     */
    public Course(String courseCode, String title) {
        this(courseCode, title, null, null, null, null, null, null, 0);
    }

    /**
     * Description: Creates a Course object with a course code, title, location,
     * instructor, set of assignments, grading rubric, schedule, additional
     * information, and absences count. Note that course code, title, location,
     * instructor, grading rubric, schedule, and additional information are
     * immutable properties and cannot be modified once the constructor has been
     * called.
     *
     * @param courseCode the course code for the course
     * @param title the title of the course
     * @param location the meeting location for classes
     * @param instructor the instructor of the course
     * @param assignments set of assignments for the course
     * @param gradeRubric grading rubric used by the course
     * @param schedule schedule of class times for the course
     * @param additionalInfo additional information about the course
     * @param absences count of absences for this course
     */
    public Course(String courseCode, String title, String location,
            Instructor instructor, TreeMap<Integer, Assignment> assignments,
            GradeRubric gradeRubric, TimeTable schedule, String additionalInfo,
            int absences) {
        this.courseCode = courseCode;
        this.title = title;
        this.location = location;
        this.instructor = instructor;
        this.assignments = assignments;
        this.gradeRubric = gradeRubric;
        this.schedule = schedule;
        this.additionalInfo = additionalInfo;
        this.absences = absences;
    }

    /**
     * Description: Adds an assignment to this course's assignment library. If
     * an assignment with the specified ID already exists in this course, then
     * the method returns false. Otherwise, on success, the method returns true.
     *
     * @param assignment assignment to add to this course
     * @return true on success, false if assignment with the same ID already
     * exists
     */
    public boolean addAssignment(Assignment assignment) {
        int id = assignment.getAssignmentID();
        if (this.assignments.containsKey(id)) {
            return false;
        } else {
            this.assignments.put(id, assignment);
            return true;
        }
    }

    /**
     * Description: Increments the number of accrued absences for this course by
     * one, then returns the new absence count.
     *
     * @return number of accrued absences for the course after incrementing the
     * count by one
     */
    public int addAbsence() {
        this.absences++;
        return this.absences;
    }

    /**
     * Description: Gets and returns the assignment with the specified ID. If no
     * assignment with the specified ID is found, a null reference is returned.
     *
     * @param assignmentID ID of the assignment to search for
     * @return the assignment with the specified ID or a null reference
     */
    public Assignment getAssignment(int assignmentID) {
        if (this.assignments.containsKey(assignmentID)) {
            return this.assignments.get(assignmentID);
        } else {
            return null;
        }
    }

    /**
     * Description: Gets and returns the course code of this course.
     *
     * @return course code of the course
     */
    public String getCourseCode() {
        return this.courseCode;
    }

    /**
     * Description: Gets and returns the title of this course.
     *
     * @return title of the course
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Description: Gets and returns the Instructor of this course.
     *
     * @return instructor of the course
     */
    public Instructor getInstructor() {
        return this.instructor;
    }

    /**
     * Description: Gets and returns the GradeRubric of this course.
     *
     * @return grade rubric of the course
     */
    public GradeRubric getGradeRubric() {
        return this.gradeRubric;
    }

    /**
     * Description: Gets and returns the meeting times of classes for this
     * course.
     *
     * @return meeting times of classes for the course
     */
    public TimeTable getSchedule() {
        return this.schedule;
    }

    /**
     * Description: Gets and returns any additional information about this
     * course.
     *
     * @return any additional information for the course
     */
    public String getAdditionalInfo() {
        return this.additionalInfo;
    }

    /**
     * Description: Gets and returns the number of accrued absences for this
     * course.
     *
     * @return number of accrued absences for the course
     */
    public int getAbsences() {
        return this.absences;
    }

    /**
     * Description: Compares this Course object with the specified
     * Course object for order. Returns a negative integer, zero, or a
     * positive integer as this Course's course code is before, the same as, or
     * after the specified Course's course code, alphabetically. Casing of codes is
     * ignored when making these comparisons.
     *
     * @param that the Course to compare this Course to
     * @return negative integer, zero, or positive integer
     */
    @Override
    public int compareTo(Course that) {
        String thatCode = that.getCourseCode().toLowerCase();
        String thisCode = this.courseCode.toLowerCase();

        int shorterNameLength;

        if (thatCode.length() < thisCode.length()) {
            shorterNameLength = thatCode.length();
        } else {
            shorterNameLength = thisCode.length();
        }

        for (int i = 0; i < shorterNameLength; i++) {
            if (thisCode.toCharArray()[i] < thatCode.toCharArray()[i]) {
                return -1;
            } else if (thisCode.toCharArray()[i]
                    > thatCode.toCharArray()[i]) {
                return 1;
            }
        }

        return 0;

    }

    /**
     * Description: Generates and returns a String representation of this Course
     * object. The returned String includes the course code, course title,
     * meeting location and times, and instructor information. The returned
     * String consumes three lines of output.
     *
     * @return a string representation of this Course object
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append(this.courseCode).append(": ").append(this.title);
        builder.append(System.lineSeparator());
        builder.append(this.location).append(", ").append(this.schedule);
        builder.append(System.lineSeparator());
        builder.append(this.additionalInfo);

        return builder.toString();
    }

    /**
     * Description: Unit tests for the Course class.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TimeSpan tuesday = new TimeSpan(6, 30, 10, 30);
        TimeSpan wednesday = new TimeSpan(9, 45, 10, 30);
        TimeSpan thursday = new TimeSpan(6, 30, 10, 30);

        TimeTable testTable = new TimeTable(null, tuesday, wednesday,
                thursday, null);

        Course testCourse = new Course("ECON125", "Macroeconomics",
                "Hague 201", null, null, null, testTable,
                "No additional info", 0);
        
        System.out.println(testCourse);

    }

}
