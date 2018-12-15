package AssignmentManager;

/**
 * Description: A class to represent an instructor of a course, including
 * contact information and office hours.
 *
 * @author Josh Thibeault
 */
public final class Instructor implements Comparable<Instructor> {
    
    private final String name;
    private final String email;
    private final String phone;
    private final TimeTable officeHours;
    
    /**
     * Description: Creates an empty Instructor object to use when allocating
     * memory. Note that Instructor is an immutable class, and using the
     * default constructor serves no purpose beyond memory allocation.
     */
    public Instructor() {
        this(null); 
    }
    
    /**
     * Description: Creates an Instructor object that has a name, but no contact
     * information or office hours.
     * 
     * @param name name of the instructor
     */
    public Instructor(String name) {
        this(name, null, null, null);
    }
    
    /**
     * Description: Creates an Instructor object with a name, email address,
     * phone number, and office hours.
     * 
     * @param name name of the instructor
     * @param email instructor email address
     * @param phone instructor office phone number
     * @param officeHours time table of instructor office hours
     */
    public Instructor(String name, String email, String phone,
            TimeTable officeHours) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.officeHours = officeHours;        
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
    public String getEmail() {
        return this.email;
    }
    
    /**
     * 
     * @return 
     */
    public String getPhone() {
        return this.phone;
    }
    
    /**
     * 
     * @return 
     */
    public TimeTable getOfficeHours() {
        return this.officeHours;
    }
    
    /**
     * 
     * @param that
     * @return 
     */
    @Override
    public int compareTo(Instructor that) {
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
