package AssignmentManager;

import java.util.ArrayList;
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
     * 
     */
    public GradeRubric() {
        
    }
    
    /**
     * 
     * @param categories 
     */
    public GradeRubric(TreeMap<String, Double> categories) {
        
    }
    
    /**
     * 
     * @param key
     * @return 
     */
    public double getWeight(String key) {
        return 0;
    }
    
    /**
     * 
     * @return 
     */
    public ArrayList<String> getCategories() {
        return null;
    }
    
    /**
     * 
     * @return 
     */
    public TreeMap<String, Double> getRubric() {
        return null;
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
