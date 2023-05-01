/* PartTimeFaculty class implements TeachingLoad and contains private String firstName, lastName, and
 * List of type course called coursesTaught
 */

import java.util.ArrayList;
import java.util.List;

public class PartTimeFaculty implements TeachingLoad{
    private String firstName;
    private String lastName;
    private List<Course> coursesTaught;

    // constructor with input parameter firstName and lastName
    public PartTimeFaculty(String firstName, String lastName) {
        this.coursesTaught = new ArrayList<>();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // method returns firstName
    public String getFirstName(){ return firstName; }

    // method returns lastName
    public String getLastName(){
        return lastName;
    }

    /* Overridden method from TeachingLoad interface, teach takes parameter Course course, adds the course to the
     * teaching schedule of the PartTimeFaculty member, provides logic to ensure that the instance does not teach more
     * than one course in a semester.
     */
    @Override
    public void teach(Course course) {
        List<Course> matchingCourses = new ArrayList<>();
        if (!coursesTaught.contains(course) && !Department.getInstance().coursesWithTeacher.contains(course)) {
            if (coursesTaught.size() > 0) {
                for (Course courses : coursesTaught) {
                    if (courses.getSemester() == course.getSemester() && courses.getYear() == course.getYear()) {
                        matchingCourses.add(course);
                    }
                }
                if (matchingCourses.size() < 1) {
                    coursesTaught.add(course);
                    Department.getInstance().coursesWithTeacher.add(course);
                    System.out.println(course.getName() + " has been added to the teaching schedule for " + firstName + " " + lastName);
                } else {
                    System.out.println("Part-Time Faculty are limited to teaching one course per semester.");
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

    /* Overridden method from TeachingLoad interface that provides logic to get the course taught by the instance for
     * a given year and semester and print the course name, the first and last name, and the semester and year. If none
     * prints string and first and last name for semester and year.
     */
    @Override
    public void getCoursesTaughtForSemesterYear(int year, int semester) {
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
    }

