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
     * 
     * @param courseCode
     * @param title 
     */
    public Course(String courseCode, String title) {
        this(courseCode, title, null, null, null, null, null, null, 0);
    }
    
    /**
     * 
     * @param courseCode
     * @param title
     * @param location
     * @param instructor
     * @param assignments
     * @param gradeRubric
     * @param schedule
     * @param additionalInfo
     * @param absences 
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
     * 
     * @return 
     */
    public Assignment getAssignment() {
        return null;
    }
    
    /**
     * 
     * @return 
     */
    public String getCourseCode() {
        return null;
    }
    
    /**
     * 
     * @return 
     */
    public String getTitle() {
        return null;
    }
    
    /**
     * 
     * @return 
     */
    public Instructor getInstructor() {
        return null;
    }
    
    /**
     * 
     * @return 
     */
    public GradeRubric getGradeRubric() {
        return null;
    }
    
    /**
     * 
     * @return 
     */
    public TimeTable getSchedule() {
        return null;
    }
    
    /**
     * 
     * @return 
     */
    public String getAdditionalInfo() {
        return null;
    }
    
    /**
     * 
     * @return 
     */
    public int getAbsences() {
        return 0;
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
