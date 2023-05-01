/* Class UndergraduateThesis extends Thesis and is a Concrete class within the Behavioral pattern, Template Method.
 * The class includes two overridden methods, completeCourses(Student student) and getAdvisor(Student student,
 * FullTimeFaculty advisor)
 */
class UndergraduateThesis extends Thesis{

    // method includes logic to ensure student has completed the required amount of courses to be eligible for thesis
    @Override
    public void completeCourses(Student student) {
        if (student.getProgramEnrolled().getDegreeLevel() == "Undergraduate/Bachelors"){
            if (student.getCoursesCompleted().size() >= 14){
                System.out.println(student.getFirstName() + " " + student.getLastName() +
                        " has completed the appropriate amount of courses and is eligible to register for their thesis.");
                System.out.println(student.getFirstName() + " " + student.getLastName() +
                        "has been registered for their thesis topic " + topic + ".");
                student.setRegisteredThesis(true);
            }
        }
        else{
            System.out.println(student.getFirstName() + " " + student.getLastName() +
                    " is not eligible to enroll in their thesis at this time.");
            System.out.println("Please ensure " + student.getFirstName() + " " + student.getLastName() +
                    " is registering for the right Degree Level and has completed the appropriate course work.");
        }
    }

    // method includes logic to get Advisor and add student to advisorToThesis list if eligible
    @Override
    public void getAdvisor(Student student, FullTimeFaculty advisor) {
        if(!student.getRegisteredThesis()){
            System.out.println(student.getFirstName() + " " + student.getLastName() +
                    " is not eligible for a thesis advisor.");
        }
        else{
            System.out.println(student.getFirstName() + " " + student.getLastName() + "'s thesis advisor is " +
                    advisor.getFirstName() + " " + advisor.getLastName() + ".");
            advisor.advisorToThesis.add(student);
        }
    }
}