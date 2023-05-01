/* QueryDecorator class implements Query, is abstract, and is the Base Decorator in the Decorator, Structural design
 * pattern. The class contains private Query query and overridden method send(String message)
 */

public abstract class QueryDecorator implements Query{
    private Query query;

    // constructor QueryDecorator
    public QueryDecorator(Query query){
        this.query = query;
    }

    // overridden method send with input parameter String message, calls method send(message) on query
    @Override
    public void send(String message) {
        query.send(message);
    }
}



