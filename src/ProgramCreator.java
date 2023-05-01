/* Class ProgramCreator is the Creator as a part of the Factory Method, Cretional design pattern. The class contains
 * ProgramFactory factory and method orderProgram(String type)
 */
public class ProgramCreator {
    ProgramFactory factory;

    // constructor for ProgramCreator
    public ProgramCreator(ProgramFactory factory){ this.factory = factory; }

    /* orderProgram method takes parameter String type and defines Program program, calls createProgram method on
     * factory with type parameter and returns program
     */
    public Program orderProgram(String type){
        Program program;

        program = factory.createProgram(type);
        return program;
    }
}
