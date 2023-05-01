/* PartTimeFacultyQuery extends QueryDecorator and is a Concrete Decorator in the Decorator Structural pattern.
 * The class contains PartTimeFaculty partTimeFaculty and overridden method send(String message)
 */
public class PartTimeFacultyQuery extends QueryDecorator {
    private PartTimeFaculty partTimeFaculty;

    // constructor with inherited query
    public PartTimeFacultyQuery(Query query, PartTimeFaculty partTimeFaculty) {
        super(query);
        this.partTimeFaculty = partTimeFaculty;
    }

    // overridden method with string and partTimeFaculty instance first and last name
    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Forwarding query to full time faculty member  " + partTimeFaculty.getFirstName() +
                " " + partTimeFaculty.getLastName() + ".");
    }
}