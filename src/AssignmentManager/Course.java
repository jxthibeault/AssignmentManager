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
     *
     * @param id
     * @param assignment
     * @return
     */
    public boolean addAssignment(Integer id, Assignment assignment) {
        return false;
    }

    /**
     *
     * @return
     */
    public int addAbsence() {
        return 0;
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
     *
     * @param that
     * @return
     */
    @Override
    public int compareTo(Course that) {
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
