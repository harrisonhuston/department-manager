/* AdvisorQuery class extends QueryDecorator and is a Concrete Decorator as part of the Decorator Structural pattern.
 * Includes public variables GraduateAdvisor graduateAdvisor, UndergraduateAdvisor, undergraduateAdvisor, Student
 * student, and int year. Includes overridden method send(String message). Constructor includes inherited Query query.
 */

public class AdvisorQuery extends QueryDecorator {
    public GraduateAdvisor graduateAdvisor;

    public UndergraduateAdvisor undergraduateAdvisor;

    public Student student;

    public int year;

    /* Constructor with input parameters Query query, Student student, int year, GraduateAdvisor graduateAdvisor,
     * UndergraduateAdvisor undergraduateAdvisor
     */
    public AdvisorQuery(Query query, Student student, int year, GraduateAdvisor graduateAdvisor,
                        UndergraduateAdvisor undergraduateAdvisor) {
        super(query);
        this.student = student;
        this.graduateAdvisor = graduateAdvisor;
        this.undergraduateAdvisor = undergraduateAdvisor;
        this.year = year;
    }

    /* Overridden method send with input parameter String message, provides the logic for the Advisor query to ensure
     * the student sending the query can do so to their appropriate advisor if applicable.
     */
    @Override
    public void send(String message) {
        super.send(message);
        if (student.getProgramEnrolled().getDegreeLevel() == "Graduate/Masters" && graduateAdvisor.getYear() == year) {
            System.out.println("Forwarding query to graduate advisor " + graduateAdvisor.getFirstName() + " " +
                    graduateAdvisor.getLastName() + ".");
        }
        if (student.getProgramEnrolled().getDegreeLevel() == "Undergraduate/Bachelors" && graduateAdvisor.getYear() == year) {
            System.out.println("Forwarding query to undergraduate advisor " + undergraduateAdvisor.getFirstName()
                    + " " + undergraduateAdvisor.getLastName() + ".");
        }
        if (student.getProgramEnrolled().getDegreeLevel() == "Certificate") {
            System.out.println("Your program does not have an advisor.");
        }
        if (graduateAdvisor.getYear() != year || undergraduateAdvisor.getYear() != year){
            System.out.println("The advisors given are not advising for the given years.");
        }
    }
}
