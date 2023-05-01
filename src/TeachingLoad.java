/* Public interface TeachingLoad contains two methods, teach with parameter Course course and
 * getCoursesTaughtForSemesterYear with parameters int year and int semester
 */
public interface TeachingLoad {
   void teach(Course course);
   void getCoursesTaughtForSemesterYear(int year, int semester);
}
