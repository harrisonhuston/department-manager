/* GraduateAdvisor extends FullTimeFaculty and includes int year, inherits String firstName and lastName. The class
 * contains the method checkGraduateAdvisorYear, which when run ensures only one GraduateAdvisor instance for a
 * given year is included in graduateAdvisors list.
 */
public class GraduateAdvisor extends FullTimeFaculty{
    int year;
    public GraduateAdvisor(String firstName, String lastName, int year) {
        super(firstName, lastName);
        this.year = year;
    }

    // method returns year
    public Integer getYear(){
        return year;
    }

    // provides logic to ensure a single GraduateAdvisor for a given year and adds to graduateAdvisors list.
    public void checkGraduateAdvisorYear(){
        if (Department.getInstance().graduateAdvisors.size() > 0) {
            for (GraduateAdvisor advisor : Department.getInstance().graduateAdvisors) {
                if (advisor.getYear()== this.year) {
                    System.out.println("Graduate Advisor for given year already exists");
                }
                else {
                    Department.getInstance().graduateAdvisors.add(this);
                    System.out.println(getFirstName() + " " + getLastName() + " is the Graduate Advisor for " + year);
                }
            }
        } else {
            Department.getInstance().graduateAdvisors.add(this);
            System.out.println(getFirstName() + " " + getLastName() + " is the Graduate Advisor for " + year);
        }
    }


}
