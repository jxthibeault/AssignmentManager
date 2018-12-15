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
     * 
     */
    public Instructor() {
        
    }
    
    /**
     * 
     * @param name 
     */
    public Instructor(String name) {
        
    }
    
    /**
     * 
     * @param name
     * @param email
     * @param phone
     * @param officeHours 
     */
    public Instructor(String name, String email, String phone,
            TimeTable officeHours) {
        
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
