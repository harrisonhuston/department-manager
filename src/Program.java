/* Abstract class Program acts as the Product in the Factory Method, Creational design pattern. The class contains
 * string name and degreeLevel and in durationYears. It also contains a list containing type Course called coreCourses.
 */

import java.util.ArrayList;
import java.util.List;

abstract public class Program {
    String name;
    String degreeLevel;
    int durationYears;
    List<Course> coreCourses = new ArrayList<>();

    // method returns name
    public String getName(){
        return name;
    }

    // method returns degreeLevel
    public String getDegreeLevel(){
        return degreeLevel;
    }


    // method give program overview as string and prints each course in specific program
    public String toString(){
        StringBuffer display = new StringBuffer();
        display.append("\nProgram Overview \n" + "Program Level: " + degreeLevel + "\n");
        display.append("Program Name: " + name + "\n");
        if(durationYears == 0){
            display.append("Program Duration: This program has no time limit.\n");
        }
        else{display.append("Program Duration: " + durationYears + " year degree.\n");}
        display.append("Core Courses:\n");
        for (Course course : coreCourses){
            display.append("Course Name: " + course.getName() + " Course Description: " + course.getDescription() +
                    " Course Syllabus: " + course.getSyllabus() +  "\n");
        }
        return display.toString();
    }


}
