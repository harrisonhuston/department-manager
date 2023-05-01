/* Class StudentQuery implements Query and is the Concrete Component part of the Structural Decorator pattern. It
 * contains Student student and String message, as well as overridden method send(String message)
 */
public class StudentQuery implements Query{
    public Student student;
    private String message;

    // constructor with input parameter Student student and String message
    public StudentQuery(Student student, String message){
        this.student = student;
        this.message = message;
    }

    // overridden message send with String message input parameter, prints string student first and last name + message
    @Override
    public void send(String message) {
        System.out.println("Student: " + student.getFirstName() + " " +  student.getLastName() +
                " has sent a query.\n" + message);
    }
}
