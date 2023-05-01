/* UndergraduateAdvisor extends FullTimeFaculty and includes int year, inherits String firstName and lastName. The class
 * contains the method checkUndergraduateAdvisorYear, which when run ensures only one UndergraduateAdvisor instance for
 * a given year is included in the Undergraduate Advisor list.
 */

public class UndergraduateAdvisor extends FullTimeFaculty{
    int year;
    public UndergraduateAdvisor(String firstName, String lastName, int year) {
        super(firstName, lastName);
        this.year = year;
    }

    // method returns year
    public Integer getYear(){
        return year;
    }

    // provides logic to ensure a single UndergraduateAdvisor for a given year and adds to undergraduateAdvisors list.
    public void checkUndergraduateAdvisorYear(){
        if (Department.getInstance().undergraduateAdvisors.size() > 0) {
            for (UndergraduateAdvisor advisor : Department.getInstance().undergraduateAdvisors) {
                if (advisor.getYear()== this.year) {
                    System.out.println("Undergraduate Advisor for given year already exists");
                }
                else {
                    Department.getInstance().undergraduateAdvisors.add(this);
                    System.out.println(getFirstName() + " " + getLastName() + " is the Undergraduate Advisor for "
                            + year);
                }
            }
        } else {
            Department.getInstance().undergraduateAdvisors.add(this);
            System.out.println(getFirstName() + " " + getLastName() + " is the Undergraduate Advisor for " + year);
        }
    }
}
