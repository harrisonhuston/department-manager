/* CourseComponent interface is the Component piece of the Structural design pattern Composite. The class contains
 * methods getDescription(), getName(), format(), add(CourseComponent component), remove(CourseComponent component), and
 * getChild(int index)
 */

public interface CourseComponent {
    String getDescription();
    String getName();
    String format();
    void add(CourseComponent component);
    void remove(CourseComponent component);
    CourseComponent getChild(int index);
}




