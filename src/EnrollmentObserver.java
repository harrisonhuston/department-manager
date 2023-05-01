/* Interface EnrollmentObserver is the Subscriber as a part of the Behavioral pattern, Observer. It contains a single
 * void method updateEnrollment with input parameter Course course
 */
public interface EnrollmentObserver {
    void updateEnrollment(Course course);
}
