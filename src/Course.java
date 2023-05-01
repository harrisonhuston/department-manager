/* Course is a Leaf in regard to the Structural pattern Composite and the Publisher as it pertains to the Behavioral
 * pattern, Observer.
 * The class implements CourseComponent and contains private String name, description, and syllabus, private int
 * enrollmentLimit, enrollment, year, and semester. It also contains private boolean elective, List of Student objects
 * called enrolledStudents, List of EnrollmentObserver objects called observers and a Queue of Student objects called
 * waitList.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Leaf class
public class Course implements CourseComponent {
    private String name;
    private String description;
    private String syllabus;
    private int enrollmentLimit;
    private int enrollment;
    private int year;
    private int semester;
    private Queue<Student> waitList;
    private List<Student> enrolledStudents;
    private List<EnrollmentObserver> observers;
    private boolean elective;




    // constructor includes parameters name, description, syllabus, enrollmentLimite, elective, year, and semester
    public Course(String name, String description, String syllabus, int enrollmentLimit, boolean elective, int year,
                  int semester) {

        this.name = name;
        this.description = description;
        this.syllabus = syllabus;
        this.enrollment = 0;
        this.enrollmentLimit = enrollmentLimit;
        enrolledStudents = new ArrayList<>();
        this.waitList = new LinkedList<>();
        observers = new ArrayList<>();
        this.elective = elective;
        this.year = year;
        this.semester = semester;

    }

    // method returns description
    public String getDescription() {
        return description;
    }

    // method returns year
    public int getYear() {
        return year;
    }

    // method returns waitlist
    public Queue getWaitList() { return  waitList; }

    // method returns semester
    public int getSemester() {
        return semester;
    }

    // method returns name
    public String getName(){ return name;}

    // method returns syllabus
    public String getSyllabus(){ return syllabus;}

    // method returns enrolledStudents
    public List getEnrolledStudents(){ return enrolledStudents;}

    // method returns enrollment
    public int getEnrollment() { return enrollment; }

    // method returns enrollmentLimit
    public int getEnrollmentLimit() { return enrollmentLimit; }

    // method returns elective
    public boolean getElective(){ return elective; }

    // format returns string in html format for course
    public String format() {
        return "<h2>Course Name: " + name + "</h2>" + "<p>Description: " + description + "</p>" + "<p>Syllabus: " +
                syllabus + "</p>" + "<p>Enrollment Limit: " + enrollment + "</p>" + "<p>Elective: " + elective + "</p>"
                +  "<p>Year Offered: " + year + "</p>" + "<p>Semester Offered: " + semester + "</p>";
    }

    // add throws new UnsupportedOperationException();
    public void add(CourseComponent component) {
        // Leaf node cannot have children
        throw new UnsupportedOperationException();
    }

    // remove throws new UnsupportedOperationException();
    public void remove(CourseComponent component) {
        // Leaf node cannot have children
        throw new UnsupportedOperationException();
    }

    // getChild throws new UnsupportedOperationException();
    public CourseComponent getChild(int index) {
        // Leaf node cannot have children
        throw new UnsupportedOperationException();
    }

    /* toString provides logic to get each student in enrolled students list and print their first and last name
     * and their program enrolled with toString call from Program class
     */
    public String toString(){
        StringBuffer display = new StringBuffer();
        for (Student student : enrolledStudents){
            display.append(student.getFirstName() + " " + student.getLastName() + " " +
                    student.getProgramEnrolled().toString());
        }
        return display.toString();
    }

    // enrollmentOverview method to get first and last name of student in enrolledStudents
    public String enrollmentOverview(){
        StringBuffer display = new StringBuffer();
        for (Student student : enrolledStudents){
            display.append("\n" + student.getFirstName() + " " + student.getLastName());
        }
        return display.toString();
    }

    // method adds observer to observers list
    public void addEnrollmentObserver(EnrollmentObserver observer) {
        observers.add(observer);
    }

    // method removes observer to observers list
    public void removeEnrollmentObserver(EnrollmentObserver observer) {
        observers.remove(observer);
    }

    /* add student provides logic to enroll student if enrollment size allows, increments where needed and adds
     * student to waitList if class is full
     */
    public void addStudent(Student student) {
        if (enrolledStudents.size() < enrollmentLimit) {
            enrolledStudents.add(student);
            enrollment++;
            System.out.println(student.getFirstName() + " " + student.getLastName() + " has been enrolled in " + name);
        } else {
            waitList.add(student);

            for (EnrollmentObserver observer : observers) {
                observer.updateEnrollment(this);
            }
            System.out.println(student.getFirstName() + " " + student.getLastName() +
                    " has been added to the waitlist for " + name);
        }
    }

    /* remove student provides logic to remove student from a class and increment size of enrollment when removed,
     * if there are students on the waitlist (ie not empty), removes student from waitlist and calls enrollInCourse
     * method from student class to enroll in the course
     */
    public void removeStudent(Student student) {
        enrolledStudents.remove(student);
        System.out.println(student.getFirstName() + " " + student.getLastName() + " has been removed from " + name);
        enrollment--;
        if (!waitList.isEmpty()) {
            Student nextStudent = waitList.remove();
            nextStudent.enrollInCourse(this);
        }
    }

}

