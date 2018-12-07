package AssignmentManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeMap;

/**
 * Description: A class representing a rubric used to weight assignments based
 * on assignment type for a course when determining a final grade.
 *
 * @author Josh Thibeault
 */
public class GradeRubric {

    private TreeMap<String, Double> categories;

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
        TreeMap<String, Double> testMap = new TreeMap<>();
        testMap.put("Homework", 45.00);
        testMap.put("Tests", 55.00);
        
        GradeRubric testRubric = new GradeRubric(testMap);
        System.out.println(testRubric.getCategories());
        System.out.println(testRubric.getWeight("Homework"));
        System.out.println(testRubric.getWeight("Attendance"));

    }

}
