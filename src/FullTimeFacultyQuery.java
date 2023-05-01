/* FullTimeFacultyQuery extends QueryDecorator and is a Concrete Decorator in the Decorator Structural pattern.
 * The class contains FullTimeFaculty partTimeFaculty and overridden method send(String message)
 */
public class FullTimeFacultyQuery extends QueryDecorator {
    private FullTimeFaculty fullTimeFaculty;

    // constructor with inherited query
    public FullTimeFacultyQuery(Query query, FullTimeFaculty fullTimeFaculty) {
        super(query);
        this.fullTimeFaculty = fullTimeFaculty;
    }

    // overridden method with string and fullTimeFaculty instance first and last name
    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Forwarding query to full time faculty member " + fullTimeFaculty.getFirstName() +
                " " + fullTimeFaculty.getLastName() + ".");
    }
}
