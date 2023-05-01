/* Abstract class Thesis is the AbstractClass portion of the Behavioral Template design pattern. It includes String
 * topic and final void method registerForThesis, as well as methods completeCourses and getAdvisor
 */
abstract class Thesis {
    String topic;

    /* registerForThesis takes parameters String topic, Student student and FullTimeFaculty advisor, the method sets
     * this.topic = topic, and runs methods completeCourses(student) and getAdvisor(student, advisor)
     */
    public final void registerForThesis(String topic, Student student, FullTimeFaculty advisor){
        this.topic = topic;
        completeCourses(student);
        getAdvisor(student, advisor);
    }

    // method completeCourses takes input parameter Student student
    public abstract void completeCourses(Student student);
    // method getAdvisor takes input parameter Student student and FullTimeFaculty advisor
    public abstract void getAdvisor(Student student, FullTimeFaculty advisor);

    }





