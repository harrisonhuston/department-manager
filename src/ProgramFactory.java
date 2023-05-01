/* ProgramFactory is the Concrete Creator in the Factory Method, Creational design pattern. It contains a single method
 * createProgram(String type).
 */

public class ProgramFactory {

    /* createProgram(String type) creates the type of programs based on the String type. Each time the program is
     * defined as an instance of the specified program by the type. The core courses are also added to the program
     * within each if statement and a for loop calls method addEnrollmentObserver on the course with input param of
     * the Chairperson instance and then calls the addEnrollmentSubject() method on the Chairperson with input parameter
     * course. The method ultimately returns the specified program.
     */
    public Program createProgram(String type) {
        Program program = null;

        if (type.equals("UndergraduateCS")) {
            program = new UndergraduateCS();
            program.coreCourses.add(Department.getInstance().courseHashMap.get("CS101"));
            program.coreCourses.add(Department.getInstance().courseHashMap.get("CS102"));
            program.coreCourses.add(Department.getInstance().courseHashMap.get("CS103"));
            program.coreCourses.add(Department.getInstance().courseHashMap.get("CS104"));
            program.coreCourses.add(Department.getInstance().courseHashMap.get("CS105"));
            program.coreCourses.add(Department.getInstance().courseHashMap.get("CS111"));
            program.coreCourses.add(Department.getInstance().courseHashMap.get("CS112"));
            program.coreCourses.add(Department.getInstance().courseHashMap.get("CS113"));
            program.coreCourses.add(Department.getInstance().courseHashMap.get("CS114"));
            program.coreCourses.add(Department.getInstance().courseHashMap.get("CS115"));
            program.coreCourses.add(Department.getInstance().courseHashMap.get("CS116"));
            program.coreCourses.add(Department.getInstance().courseHashMap.get("CS117"));

            // add chairperson observer and

            for (Course course : program.coreCourses) {
                course.addEnrollmentObserver(Chairperson.getInstance());
                Chairperson.getInstance().addEnrollmentSubject(course);
            }
        }
        if (type.equals("UndergraduateCIS")) {
            program = new UndergraduateCIS();
            program.coreCourses.add(Department.getInstance().courseHashMap.get("CS106"));
            program.coreCourses.add(Department.getInstance().courseHashMap.get("CS107"));
            program.coreCourses.add(Department.getInstance().courseHashMap.get("CS108"));
            program.coreCourses.add(Department.getInstance().courseHashMap.get("CS109"));
            program.coreCourses.add(Department.getInstance().courseHashMap.get("CS110"));
            program.coreCourses.add(Department.getInstance().courseHashMap.get("CS118"));
            program.coreCourses.add(Department.getInstance().courseHashMap.get("CS119"));
            program.coreCourses.add(Department.getInstance().courseHashMap.get("CS120"));
            program.coreCourses.add(Department.getInstance().courseHashMap.get("CS121"));
            program.coreCourses.add(Department.getInstance().courseHashMap.get("CS122"));
            program.coreCourses.add(Department.getInstance().courseHashMap.get("CS123"));
            program.coreCourses.add(Department.getInstance().courseHashMap.get("CS124"));


            // add chairperson observer and
            for (Course course : program.coreCourses) {
                course.addEnrollmentObserver(Chairperson.getInstance());
                Chairperson.getInstance().addEnrollmentSubject(course);
            }
        }
        if (type.equals("GraduateCS")) {
            program = new GraduateCS();
            program.coreCourses.add(Department.getInstance().courseHashMap.get("CS511"));
            program.coreCourses.add(Department.getInstance().courseHashMap.get("CS512"));
            program.coreCourses.add(Department.getInstance().courseHashMap.get("CS513"));
            program.coreCourses.add(Department.getInstance().courseHashMap.get("CS514"));
            program.coreCourses.add(Department.getInstance().courseHashMap.get("CS515"));

            // add chairperson observer and
            for (Course course : program.coreCourses) {
                course.addEnrollmentObserver(Chairperson.getInstance());
                Chairperson.getInstance().addEnrollmentSubject(course);
            }
        }
        if (type.equals("GraduateCIS")) {
            program = new GraduateCIS();
            program.coreCourses.add(Department.getInstance().courseHashMap.get("CS516"));
            program.coreCourses.add(Department.getInstance().courseHashMap.get("CS517"));
            program.coreCourses.add(Department.getInstance().courseHashMap.get("CS518"));
            program.coreCourses.add(Department.getInstance().courseHashMap.get("CS519"));
            program.coreCourses.add(Department.getInstance().courseHashMap.get("CS520"));

            // add chairperson observer and
            for (Course course : program.coreCourses) {
                course.addEnrollmentObserver(Chairperson.getInstance());
                Chairperson.getInstance().addEnrollmentSubject(course);
            }
        }
        if (type.equals("GraduateDA")) {
            program = new GraduateDA();
            program.coreCourses.add(Department.getInstance().courseHashMap.get("CS521"));
            program.coreCourses.add(Department.getInstance().courseHashMap.get("CS522"));
            program.coreCourses.add(Department.getInstance().courseHashMap.get("CS523"));
            program.coreCourses.add(Department.getInstance().courseHashMap.get("CS524"));
            program.coreCourses.add(Department.getInstance().courseHashMap.get("CS525"));

            // add chairperson observer and
            for (Course course : program.coreCourses) {
                course.addEnrollmentObserver(Chairperson.getInstance());
                Chairperson.getInstance().addEnrollmentSubject(course);
            }
        }
        if (type.equals("CertificateSecurity")) {
            program = new CertificateSecurity();
            program.coreCourses.add(Department.getInstance().courseHashMap.get("CS526"));
            program.coreCourses.add(Department.getInstance().courseHashMap.get("CS527"));
            program.coreCourses.add(Department.getInstance().courseHashMap.get("CS528"));
            program.coreCourses.add(Department.getInstance().courseHashMap.get("CS529"));

            // add chairperson observer and
            for (Course course : program.coreCourses) {
                course.addEnrollmentObserver(Chairperson.getInstance());
                Chairperson.getInstance().addEnrollmentSubject(course);
            }
        }
        if (type.equals("CertificateWebTechnology")) {
            program = new CertificateWebTechnology();
            program.coreCourses.add(Department.getInstance().courseHashMap.get("CS530"));
            program.coreCourses.add(Department.getInstance().courseHashMap.get("CS531"));
            program.coreCourses.add(Department.getInstance().courseHashMap.get("CS532"));
            program.coreCourses.add(Department.getInstance().courseHashMap.get("CS533"));

            // add chairperson observer and
            for (Course course : program.coreCourses) {
                course.addEnrollmentObserver(Chairperson.getInstance());
                Chairperson.getInstance().addEnrollmentSubject(course);
            }
        }
        if (type.equals("CertificateAnalytics")) {
            program = new CertificateAnalytics();
            program.coreCourses.add(Department.getInstance().courseHashMap.get("CS521"));
            program.coreCourses.add(Department.getInstance().courseHashMap.get("CS522"));
            program.coreCourses.add(Department.getInstance().courseHashMap.get("CS523"));
            program.coreCourses.add(Department.getInstance().courseHashMap.get("CS524"));

            // add chairperson observer and
            for (Course course : program.coreCourses) {
                course.addEnrollmentObserver(Chairperson.getInstance());
                Chairperson.getInstance().addEnrollmentSubject(course);
            }
        }
        return program;
    }

}



