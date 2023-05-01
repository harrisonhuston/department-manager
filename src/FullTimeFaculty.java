/* FullTimeFaculty class implements TeachingLoad and contains, private String firstName, lastName, and
 * List of type course called coursesTaught, List of type Student called advisorToThesis and List of type
 * CourseComponent called concentrationsCoordinated
 */

import java.util.ArrayList;
import java.util.List;

public class FullTimeFaculty implements TeachingLoad{
    private String firstName;
    private String lastName;
    private List<Course> coursesTaught;
    public List<Student> advisorToThesis;
    public List<CourseComponent> concentrationsCoordinated;


    // constructor of FullTimeFaculty takes input parameter firstName and lastName
    public FullTimeFaculty(String firstName, String lastName){
        this.coursesTaught = new ArrayList<>();
        this.advisorToThesis = new ArrayList<>();
        this.concentrationsCoordinated = new ArrayList<>();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // method returns firstName
    public String getFirstName() {
        return firstName;
    }

    // method returns lastName
    public String getLastName() {
        return lastName;
    }

    /* Overridden method from TeachingLoad interface that provides logic to get the courses taught by the instance for
     * a given year and semester and print the course name, the first and last name, and the semester and year. If none
     * prints string and first and last name for semester and year.
     */
    @Override
    public void getCoursesTaughtForSemesterYear(int year, int semester){
        for (Course course : coursesTaught){
            if(course.getYear() == year && course.getSemester() == semester){
                System.out.println(course.getName() + " taught by " + this.firstName + " " + this.lastName +
                        " for Semester = " + semester + ", Year = " + year);
            }
            else{
                System.out.println("No courses taught by " + this.firstName + " " + this.lastName + " for Semester = " +
                        semester + ", Year = " + year);
            }
        }
    }

    /* Overridden method from TeachingLoad interface, teach takes parameter Course course, adds the course to the
     * teaching schedule of the FullTimeFaculty member, provides logic to ensure that the instance does not teach more
     * than three courses in a semester.
     */
    @Override
    public void teach(Course course) {
        List<Course> matchingCourses = new ArrayList<>();
        if (!coursesTaught.contains(course) && !Department.getInstance().coursesWithTeacher.contains(course)){
            if (coursesTaught.size() > 0) {
                for (Course courses : coursesTaught) {
                    if (courses.getSemester() == course.getSemester() && courses.getYear() == course.getYear()) {
                        matchingCourses.add(course);
                    }
                    }
                if (matchingCourses.size() < 3) {
                    coursesTaught.add(course);
                    Department.getInstance().coursesWithTeacher.add(course);
                    System.out.println(course.getName() + " has been added to the teaching schedule for " + firstName + " " + lastName);
                } else {
                    System.out.println("Full Time Faculty are limited to teaching three courses per semester.");
                }
            } else {
                coursesTaught.add(course);
                Department.getInstance().coursesWithTeacher.add(course);
                System.out.println(course.getName() + " has been added to the teaching schedule for " + firstName + " " + lastName);
            }
            }
        else {
            System.out.println(course.getName() + " is already scheduled to be taught.");}
        }



    /* getStudentsAdvisedThesis provides the logic to get the first and last name of the student in which the instance
     * is the thesis advisor for and prints the string with the instance's first and last name. If the
     * instance does not have any students in which they are the advisor for their thesis, prints first and last name
     * of the instance and string
     */
    public void getStudentsAdvisedThesis(){
        if (advisorToThesis.size() > 0) {
            System.out.println(firstName + " " + lastName + " is the thesis advisor for:");
            for (Student student : advisorToThesis) {
                System.out.println(student.getFirstName() + " " +  student.getLastName());
            }
        }
        else{
            System.out.println(firstName + " " +  lastName +
                    " does not have any students in which they are the advisor for their thesis.");
        }
    }

    /* getCoordinatedConcentrations provides the logic to get the first and last name of the instance and the component
     * for which they are the coordinator for (concntrations/subconcentrations) as well as the compponents name and
     * description. If the instance does not coordinate any component, print instance's first and last name and string.
     */
    public void getCoordinatedConcentrations(){
        if (concentrationsCoordinated.size() > 0){
            System.out.println(firstName + " " + lastName + " is the coordinator for:");
            for (CourseComponent component : concentrationsCoordinated) {
                System.out.println(component.getName() + ": " + component.getDescription());
            }
        }
        else{
            System.out.println(firstName + " " +  lastName +
                    " does not have any concentrations in which they are the coordinator for.");
        }
        }
    }

