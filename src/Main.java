public class Main {
    public static void main(String[] args) {
        // Instance of Chairperson chairperson and instance of Department department
        Chairperson chairperson = Chairperson.getInstance();
        Department department = Department.getInstance();

        // department method calls createCourses() and createConcentrations
        department.createCourses();
        department.createConcentrations();

        // create programs (not all will be used in demonstration)
        ProgramFactory factory = new ProgramFactory();
        ProgramCreator store = new ProgramCreator(factory);
        Program undergradCS = store.orderProgram("UndergraduateCS");
        Program underGraduateCIS = store.orderProgram("UndergraduateCIS");
        Program graduateCS = store.orderProgram("GraduateCS");
        Program graduateDA = store.orderProgram("GraduateDA");
        Program graduateCIS = store.orderProgram("GraduateCIS");
        Program certificateSecurity = store.orderProgram("CertificateSecurity");
        Program certificateWebTechnology = store.orderProgram("CertificateWebTechnology");
        Program certificateAnalytics = store.orderProgram("CertificateAnalytics");


        // create full time faculty instances
        FullTimeFaculty joeSmith = new FullTimeFaculty("Joe", "Smith");
        FullTimeFaculty leahJohnson = new FullTimeFaculty("Leah", "Johnson");


        // create part time faculty instances
        PartTimeFaculty sandyElliot = new PartTimeFaculty("Sandy", "Elliott");
        PartTimeFaculty tomPeters = new PartTimeFaculty("Tom", "Peters");

        // create student instances
        Student tedOrange = new Student("Ted", "Orange", graduateCS);
        Student joeBlue = new Student("Joe", "Blue", graduateCIS);
        Student evanBlack = new Student("Evan", "Black", graduateCIS);

        System.out.println("** Testing Chairperson teaching more than one course in a semester. **\n");
        chairperson.teach(department.courseHashMap.get("CS511"));
        chairperson.teach(department.courseHashMap.get("CS512"));

        System.out.println("\n** Testing Part Time teaching more than one course in a semester. **\n");
        sandyElliot.teach(department.courseHashMap.get("CS513"));
        sandyElliot.teach(department.courseHashMap.get("CS514"));
        tomPeters.teach(department.courseHashMap.get("CS513"));

        System.out.println("\n** Testing Full Time teaching more than three courses in a semester and duplicate " +
                "teachers for a single course. **\n");
        joeSmith.teach(department.courseHashMap.get("CS512"));
        leahJohnson.teach(department.courseHashMap.get("CS512"));
        joeSmith.teach(department.courseHashMap.get("CS516"));
        joeSmith.teach(department.courseHashMap.get("CS517"));
        joeSmith.teach(department.courseHashMap.get("CS521"));

        System.out.println("\n** Testing single Graduate Advisor and single Undergraduate Advisor. **\n");
        GraduateAdvisor sallyMae = new GraduateAdvisor("Sally", "Mae", 2024);
        UndergraduateAdvisor fannieMac = new UndergraduateAdvisor("Fanny", "Mac", 2024);
        GraduateAdvisor duplicateForYearGraduate = new GraduateAdvisor("DuplicateGraduate", "ForYear", 2024);
        UndergraduateAdvisor duplicateForYearUndergraduate = new UndergraduateAdvisor("DuplicateUndergraduate", "ForYear", 2024);
        sallyMae.checkGraduateAdvisorYear();
        fannieMac.checkUndergraduateAdvisorYear();
        duplicateForYearGraduate.checkGraduateAdvisorYear();
        duplicateForYearUndergraduate.checkUndergraduateAdvisorYear();



        System.out.println("\n** Testing student sending query to Advisor, Chairperson, and Faculty Member. **\n");
        // advisor query
        Query tedOrangeQuery = new AdvisorQuery(new StudentQuery(tedOrange, "Can I register for " +
                " more than 2 classes this semester?"), tedOrange, 2024, sallyMae, fannieMac);
        tedOrangeQuery.send("Can I register for more than 2 classes this semester?");

        // chairperson query
        Query joeBlueQuery = new ChairpersonQuery(new StudentQuery(joeBlue, "Can I take the semester off?")
                , chairperson);
        joeBlueQuery.send("Can I take the semester off?");

        // full time faculty query
        Query evanBlackQuery = new FullTimeFacultyQuery(new StudentQuery(evanBlack, "I'm excited for class."),
                joeSmith);
        evanBlackQuery.send("I'm excited for class.");


        System.out.println("\n** Testing student completing enough courses to be able to register for thesis, show " +
                "the thesis topic, and the thesis advisor. Calculate the student's GPA and show the completed courses "
                + "and their grades.\n");

        tedOrange.completedCourse(department.courseHashMap.get("CS511"), 3);
        tedOrange.completedCourse(department.courseHashMap.get("CS512"), 4);
        tedOrange.completedCourse(department.courseHashMap.get("CS513"), 4);
        tedOrange.completedCourse(department.courseHashMap.get("CS514"), 3);
        tedOrange.completedCourse(department.courseHashMap.get("CS515"), 3);
        tedOrange.completedCourse(department.courseHashMap.get("CS520"), 3);
        tedOrange.completedCourse(department.courseHashMap.get("CS525"), 3);
        Thesis tedOrangeThesis = new GraduateThesis();
        tedOrangeThesis.registerForThesis("Software Design Patterns", tedOrange, joeSmith);
        tedOrange.gpa();
        tedOrange.viewCompletedCourses();

        System.out.println("\n** Testing student program information, enrolling in courses, viewing courses scheduled.");
        System.out.println(evanBlack.getProgramEnrolled());
        evanBlack.enrollInCourse(department.courseHashMap.get("CS516"));
        evanBlack.enrollInCourse(department.courseHashMap.get("CS517"));
        evanBlack.enrollInCourse(department.courseHashMap.get("CS518"));
        evanBlack.viewCoursesScheduled();

        System.out.println("\n** Testing ability to see students advised, courses taught for a specific semester, " +
                "and concentrations coordinated by a faculty member.");
        joeSmith.getStudentsAdvisedThesis();
        System.out.println();
        joeSmith.getCoursesTaughtForSemesterYear(2024, 1);
        department.softwareEngineeringConcentration.setCoordinator(joeSmith);
        department.pythonSubConcentration.setCoordinator(joeSmith);
        joeSmith.getCoordinatedConcentrations();

        System.out.println("\n** Testing format method to get course HTML output and also get concentration HTML " +
                "output.\n");
        // testing course
        System.out.println(department.courseHashMap.get("CS516").format());
        // testing concentration w/ subconcentration
        System.out.println(department.softwareEngineeringConcentration.format());

        System.out.println("\n** Testing enrollment in courses. This includes student enrolling in a course they " +
                "already have registered for, student being wait listed, student dropping course, and wait listed "
                + "student being added. This will also include the notifications to the chairperson and students, " +
                "as well as auto enrollment.\n");

        System.out.println("** For test purposes course will allow only one student to take the class. **");
        System.out.println("\n** Evan Black tries to enroll even though he is already registered.... **");
        // student registering for class they already registered for
        evanBlack.enrollInCourse(department.courseHashMap.get("CS516"));
        System.out.println("\n** Joe Blue tries to enroll.... **");
        joeBlue.enrollInCourse(department.courseHashMap.get("CS516"));
        System.out.println("\n** Evan Black drops the class.... **");
        evanBlack.dropCourse(department.courseHashMap.get("CS516"));

        System.out.println("\n** Testing department's ability to view courses offered in a specific semester. **\n");
        department.getCoursesBySemesterAndYear(2024, 1);
        System.out.println("\n");
        department.getCoursesBySemesterAndYear(2024, 2);
        System.out.println("\n");
        department.getCoursesBySemesterAndYear(2025, 2);

    }
}