/* Concentration class implements CourseComponent and acts a Composite within the Structural Composite pattern.
 * Contains private String name and description, private List<CourseComponent> components as an ArrayList, and
 * FullTimeFaculty coordinator
 */

import java.util.ArrayList;
import java.util.List;

public class Concentration implements CourseComponent {
    private String name;
    private String description;
    private List<CourseComponent> components = new ArrayList<>();
    FullTimeFaculty coordinator;

    // Constructor for concentration includes String name and description
    public Concentration(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // method provides logic to setCoordinator and add to list of concentrationsCoordinated
    public void setCoordinator(FullTimeFaculty coordinator){
        this.coordinator = coordinator;
        coordinator.concentrationsCoordinated.add(this);
    }

    // getter for Coordinator
    public FullTimeFaculty getCoordinator(){
        return coordinator;
    }

    // overridden method getName return name
    @Override
    public String getName() { return name; }

    // overridden method getDescription return description
    @Override
    public String getDescription() {
        return description;
    }

    /* overridden method format returns a string formatted in html with the name, description and components
     * for each component in components recursively calls format method on component
     */
    @Override
    public String format() {
        StringBuilder builder = new StringBuilder();
        builder.append("<h1>" + name + "</h1>");
        builder.append("<p>" + description + "</p>");
        for (CourseComponent component : components) {
            builder.append(component.format());
        }
        return builder.toString();
    }

    // overridden method add, adds component to components list
    @Override
    public void add(CourseComponent component) {
        components.add(component);
    }

    // overridden method remove, removes component from components list
    @Override
    public void remove(CourseComponent component) {
        components.remove(component);
    }

    // overridden method getChild returns components at index from input parameter
    @Override
    public CourseComponent getChild(int index) {
        return components.get(index);
    }
}
