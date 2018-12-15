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
     * memory. Note that Instructor is an immutable class, and using the default
     * constructor serves no purpose beyond memory allocation.
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
     * Description: Gets and returns the instructor's name.
     *
     * @return the name of the instructor
     */
    public String getName() {
        return this.name;
    }

    /**
     * Description: Gets and returns the instructor's email.
     *
     * @return email address of the instructor
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Description: Gets and returns the instructor's phone number.
     *
     * @return phone number of the instructor
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * Description: Gets and returns the instructor's office hours.
     *
     * @return time table of the instructor's office hours
     */
    public TimeTable getOfficeHours() {
        return this.officeHours;
    }

    /**
     * Description: Compares this Instructor object with the specified
     * Instructor object for order. Returns a negative integer, zero, or a
     * positive integer as this Instructor's name is before, the same as, or
     * after the specified Instructor's name, alphabetically. Casing of names is
     * ignored when making these comparisons.
     *
     * @param that the Instructor to compare this Instructor to
     * @return negative integer, zero, or positive integer
     */
    @Override
    public int compareTo(Instructor that) {
        String thatName = that.getName().toLowerCase();
        String thisName = this.name.toLowerCase();

        int shorterNameLength;

        if (thatName.length() < thisName.length()) {
            shorterNameLength = thatName.length();
        } else {
            shorterNameLength = thisName.length();
        }

        for (int i = 0; i < shorterNameLength; i++) {
            if (thisName.toCharArray()[i] < thatName.toCharArray()[i]) {
                return -1;
            } else if (thisName.toCharArray()[i]
                    > thatName.toCharArray()[i]) {
                return 1;
            }
        }

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
        
        Instructor testOne = new Instructor("John Smith");
        Instructor testTwo = new Instructor("John Smath");
        Instructor testThree = new Instructor("Jon Smith");
        Instructor testFour = new Instructor("John Smith");
        
        System.out.println(testOne.compareTo(testTwo));
        System.out.println(testOne.compareTo(testThree));
        System.out.println(testOne.compareTo(testFour));

    }

}
