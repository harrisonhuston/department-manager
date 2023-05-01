/* Chairperson class implements EnrollmentObserver and TeachingLoad. The class uses the Singleton Creational
 * pattern, acting as the Singleton within the structure. It also is a part of the Behavioral pattern, Observer, acting
 * as the Concrete Subscriber.
 */

import java.util.ArrayList;
import java.util.List;

/* Chairperson has private static Chairperson instance, private List of type Course called coursesTaught, and a private
 * List of type Course called enrollmentCourse
 */
public class Chairperson implements EnrollmentObserver, TeachingLoad {
    private static Chairperson instance;
    private List<Course> coursesTaught;
    private List<Course> enrollmentCourses;

    // creates the lists as new ArrayLists
    private Chairperson() {
        enrollmentCourses = new ArrayList<>();
        this.coursesTaught = new ArrayList<>();
    }

    // getInstance() returns the same instance of the Chairperson class
    public static Chairperson getInstance() {
        if (instance == null) {
            instance = new Chairperson();
        }
        return instance;
    }

    // method takes parameter Course enrollmentCourse and adds enrollmentCourse to enrollmentCourses list
    public void addEnrollmentSubject(Course enrollmentCourse) {
        enrollmentCourses.add(enrollmentCourse);
    }

    // method takes parameter Course enrollmentCourse and removes enrollmentCourse to enrollmentCourses list
    public void removeEnrollmentSubject(Course enrollmentCourse) {
        enrollmentCourses.remove(enrollmentCourse);
    }

    // method takes parameter Course enrollmentCourse and prints strings and the name of the enrollment course
    public void notifyChairperson(Course enrollmentCourse) {
        System.out.println("Dear Chairperson : Enrollment limit reached for course "
                 + enrollmentCourse.getName() +  ".");
        System.out.println("Please take necessary action.");
    }

    /* overridden method updateEnrollment provides logic to determine if the enrollment is greater than or equal
     * to the limit for the given course. If enrollment limit is reached, prints string, course name, and runs method
     * notifyChairperson with the enrollment course as the input parameter
     */
    @Override
    public void updateEnrollment(Course enrollmentCourse) {
        if (enrollmentCourse.getEnrollment() >= enrollmentCourse.getEnrollmentLimit()) {
            System.out.println("Enrollment limit reached for course " + enrollmentCourse.getName() +
                    ". Notify Chairperson.");
            notifyChairperson(enrollmentCourse);
        }
    }

    /* overridden method teach takes input parameter Course course and provides the logic to ensure the Chairperson
     * teaches at max one course per semester for a given year
     */
    @Override
    public void teach(Course course) {
        List<Course> matchingCourses = new ArrayList<>();
        if (coursesTaught.size() > 0) {
            for (Course courses : coursesTaught) {
                if (courses.getSemester() == course.getSemester() && courses.getYear() == course.getYear()) ;
                matchingCourses.add(courses);
                if (matchingCourses.size() < 1) {
                    coursesTaught.add(course);
                    System.out.println(course.getName() + " has been added to the teaching schedule for Chairperson");
                } else {
                    System.out.println("The Chairperson is limited to teaching one course per semester.");
                }
            }
        } else {
            coursesTaught.add(course);
            System.out.println(course.getName() + " has been added to the teaching schedule for Chairperson.");
        }
    }

    /* Overridden method getCoursesTaughtForSemesterYear takes input parameters int year and int semester and provides
     * the logic to print the course name for the course taught by the Chairperson for a given year and semester
     */
    @Override
    public void getCoursesTaughtForSemesterYear(int year, int semester) {
        for (Course course : coursesTaught){
            if(course.getYear() == year && course.getSemester() == semester){
                System.out.println(course.getName() + " taught by Chairperson for Semester = " + semester +
                        ", Year = " + year);
            }
            else{
                System.out.println("No courses taught by Chairperson for Semester = " + semester + ", Year = " + year);
            }
        }
    }
    }


