package AssignmentManager;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
 * Description: A class representing a rubric used to weight assignments based
 * on assignment type for a course when determining a final grade.
 *
 * @author Josh Thibeault
 */
public final class GradeRubric {

    private final TreeMap<String, Double> categories;

    /**
     * Description: Default constructor for GradeRubric. Initializes an empty
     * TreeMap internally, containing no categories or weights.
     */
    public GradeRubric() {
        this.categories = new TreeMap<>();
    }

    /**
     * Description: Constructor for GradeRubric accepting a pre-populated
     * TreeMap containing categories and weights.
     *
     * @param categories map with category names as keys and weights as values
     */
    public GradeRubric(TreeMap<String, Double> categories) {
        this.categories = categories;
    }

    /**
     * Description: Gets and returns the weight associated with a specific
     * category, or returns a negative value if the category does not exist. The
     * category lookup is case-sensitive.
     *
     * @param category the category to look up the weight for
     * @return the weight associated with the category, or a negative number if
     * the category does not exist
     */
    public double getWeight(String category) {
        if (this.categories.containsKey(category)) {
            return this.categories.get(category);
        } else {
            return -1;
        }
    }

    /**
     * Description: Gets and returns an array of the names of all the categories
     * contained within this GradeRubric.
     *
     * @return an array of the names of all categories in this rubric
     */
    public Set<String> getCategories() {
        return this.categories.keySet();
    }

    /**
     * Description: Gets and returns the TreeMap of categories and weights of
     * which this GradeRubric is composed.
     *
     * @return a reference to the TreeMap containing this rubric's categories
     * and their weights
     */
    public TreeMap<String, Double> getRubric() {
        return this.categories;
    }

    /**
     * Description: Generates and returns a String representation of this
     * GradeRubric object. The returned String is a table containing each
     * category and its associated weight. The category column is 20 characters
     * wide, and the weight column is 6 characters wide.
     *
     * @return a string representation of the GradeRubric object
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        if (this.categories.isEmpty()) {
            builder.append("No categories in this rubric.");
        } else {
            boolean printPercentSign = true;
            for (Entry<String, Double> entry : this.categories.entrySet()) {
                builder.append(String.format("%-20s%5.2f",
                        entry.getKey(), entry.getValue()));
                if(printPercentSign) {
                    builder.append("%");
                    printPercentSign = false;
                }
                builder.append(System.lineSeparator());
            }
            builder.deleteCharAt(builder.length() - 1);
        }

        return builder.toString();
    }

    /**
     * Description: Unit tests for the GradeRubric class.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TreeMap<String, Double> testMap = new TreeMap<>();
        testMap.put("Exam 1", 20.00);
        testMap.put("Exam 2", 20.00);
        testMap.put("Exam 3", 20.00);
        testMap.put("Homework", 25.00);
        testMap.put("Quizzes", 15.00);

        GradeRubric testRubric = new GradeRubric(testMap);
        
        System.out.println(testRubric.toString());
        System.out.println(testRubric.getCategories());
        System.out.println(testRubric.getWeight("Homework"));
        System.out.println(testRubric.getWeight("Attendance"));

    }

}
