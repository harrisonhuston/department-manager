/* ChairpersonQuery class extends QueryDecorator and is a Concrete Decorator as a part of the Structural Decorator
 * pattern. Includes variable Chairperson chairperson, and inherits Query query for input parameter. Also includes
 * overridden method send.
 */

public class ChairpersonQuery extends QueryDecorator {

    Chairperson chairperson;

    public ChairpersonQuery(Query query, Chairperson chairperson) {
        super(query);
        this.chairperson = chairperson;
    }

    // overridden method send, provides the logic to send query to chairperson, calling send on super and prints string
    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Forwarding query to chairperson.");
    }
}
