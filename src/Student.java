/* Student class contains private Strings firstName and lastName, Program programEnrolled, List of type Course called
 * coursesScheduled, List of type Course called coursesCompleted, List of type Integer called coursesCompletedGrades,
 * and a private Boolean called registeredThesis. The class also contains 12 methods.
 */

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private Program programEnrolled;
    private List<Course> coursesScheduled;
    private List<Course> coursesCompleted;
    private List<Integer> coursesCompletedGrades;
    private Boolean registeredThesis;



    // Student constructor takes firstName, lastName, and programEnrolled as input parameters
    public Student(String firstName, String lastName, Program programEnrolled) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.programEnrolled = programEnrolled;
        this.coursesScheduled = new ArrayList<>();
        this.coursesCompleted = new ArrayList<>();
        this.coursesCompletedGrades = new ArrayList<>();
        this.registeredThesis = false;

    }

    // method returns firstName
    public String getFirstName() { return firstName; }

    // method returns lastName
    public String getLastName() { return lastName; }

    // method sets thesis registration with boolean registeredThesis as input parameter
    public void setRegisteredThesis(boolean registeredThesis) {
        this.registeredThesis = registeredThesis;
    }

    /* boolean getRegisteredThesis, if not registered prints first name last name and string. Else prints first name,
     * last name and string
     */
    public boolean getRegisteredThesis() {
        if (!registeredThesis) {
            System.out.println(firstName + " " + lastName + " is not registered for their thesis.");
        } else {
            System.out.println(firstName + " " + lastName + " is now fully registered for their thesis.");
        }
        return registeredThesis;
    }

    // method returns programEnrolled
    public Program getProgramEnrolled() {
        return programEnrolled;
    }

    // method returns coursesCompleted
    public List<Course> getCoursesCompleted() {
        return coursesCompleted;
    }

    /* enrollInCourse takes input parameter Course course and provides the logic to consider the degree level, courses
     * completed, courses scheduled, enrollment limits, and enrolled students to decide if student can successfully
     * enroll in a course and have the course be added to their schedule.
     */
    public void enrollInCourse(Course course) {
        if (course.getElective()) {
            if (programEnrolled.getDegreeLevel() == "Undergraduate/Bachelors") {
                if (coursesCompleted.size() >= 12) {
                    if (course.getEnrolledStudents().size() < course.getEnrollmentLimit()) {
                        if (!coursesScheduled.contains(course)) {
                            if (!coursesCompleted.contains(course)) {
                                course.addStudent(this);
                                coursesScheduled.add(course);
                            } else {
                                System.out.println(firstName + " " + lastName + " has already completed this course.");
                            }
                        } else {
                            System.out.println(firstName + " " + lastName +  " is already scheduled to take this course.");
                        }
                    } else {
                        System.out.println(firstName + " " + lastName +  " this course is full.");
                    }
                } else {
                    System.out.println(firstName + " " + lastName +  " electives are only eligible in the last year of study.");
                }
            }
            if (programEnrolled.getDegreeLevel() == "Graduate/Masters") {
                if (coursesCompleted.size() >= 6) {
                    if (course.getEnrolledStudents().size() < course.getEnrollmentLimit()) {
                        if (!coursesScheduled.contains(course)) {
                            if (!coursesCompleted.contains(course)) {
                                course.addStudent(this);
                                coursesScheduled.add(course);
                            } else {
                                System.out.println(firstName + " " + lastName +  " has already completed this course.");
                            }
                        } else {
                            System.out.println(firstName + " " + lastName +  " is already scheduled to take this course.");
                        }
                    } else {
                        System.out.println(firstName + " " + lastName +  " this course is full.");
                    }
                } else {
                    System.out.println(firstName + " " + lastName +  " electives are only eligible in the last year of study.");
                }
            }
            if (programEnrolled.getDegreeLevel() == "Certificate") {
                   System.out.println(firstName + " " + lastName +  " your program does not allow for elective courses.");
            }
        }
        // if course is not an elective
        else {
            if (coursesCompleted.contains(course)) {
                System.out.println(firstName + " " + lastName +  " has already completed this course.");
            }
            if (coursesScheduled.contains(course)) {
                System.out.println(firstName + " " + lastName +  " has already registered for this course.");
            } else {
                course.addStudent(this);
                if (course.getWaitList().size() == 0){
                    coursesScheduled.add(course);
                }
            }
        }
    }

    /* method allows for course to be marked as completed, takes input Course course and int grade and adds the course
     * and grade to appropriate lists
     */
    public void completedCourse(Course course, int grade) {
        coursesCompleted.add(course);
        coursesCompletedGrades.add(grade);

    }

    // method allows to view completed courses, printing course name and letter grade depending on the number grade
    public void viewCompletedCourses() {
        if (coursesCompleted.size() > 0) {
            for (Course course : coursesCompleted) {
                int index = coursesCompleted.indexOf(course);
                int gradeForCourse = coursesCompletedGrades.get(index);
                if (gradeForCourse == 4) {
                    System.out.println(course.getName() + ": Grade =  A");
                }
                if (gradeForCourse == 3) {
                    System.out.println(course.getName() + ": Grade =  B");
                }
                if (gradeForCourse == 2) {
                    System.out.println(course.getName() + ": Grade =  C");
                }
                if (gradeForCourse == 1) {
                    System.out.println(course.getName() + ": Grade =  D");
                }
                if (gradeForCourse == 0) {
                    System.out.println(course.getName() + ": Grade =  F");
                }
            }
        }
        else{
            System.out.println(firstName + " " + lastName + " has not completed any courses.");
        }
    }

    // dropCourse runs removeStudent(this) method on course input parameter and removes course from coursesScheduled
    public void dropCourse(Course course) {
        course.removeStudent(this);
        coursesScheduled.remove(course);
    }

    // method iterates coursesCompleted grads and calculates and prints the GPA of the student
    public void gpa() {
        double sum = 0;
        for (int grade : coursesCompletedGrades)
            sum = sum + grade;
        double gradePointAverage = sum / coursesCompletedGrades.size();
        System.out.println(firstName + " " + lastName + " GPA = " + gradePointAverage);
    }

    // method iterates coursesScheduled and prints the Student's scheduled course name, semester and year
    public void viewCoursesScheduled() {
        if (coursesScheduled.size() > 0){
            System.out.println("\n" + firstName + " " + lastName + " Scheduled Courses:\n");
            for (Course course : coursesScheduled){
                System.out.println(course.getName() + " scheduled for Semester = " + course.getSemester() +
                        " Year = " + course.getYear());
            }
        }
        else{
            System.out.println(firstName + " " + lastName + " has no courses scheduled.");
        }
    }
}



