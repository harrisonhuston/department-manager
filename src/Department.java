/* Department class is the Singleton piece of the Singleton Creational pattern. The pattern contains a public
 * HashMap<String, Course> called courseHashMap, a List<Course> coursesWithTeacher, a List<GraduateAdvisor>
 * graduateAdvisors and List<UndergraduateAdvisor> undergraduateAdvisors. It also contains various Concentrations.
 * The class also contains the methods that create the concentrations and courses.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Department {
    public HashMap<String, Course> courseHashMap = new HashMap<String, Course>();
    public List<Course> coursesWithTeacher = new ArrayList<>();
    public List<GraduateAdvisor> graduateAdvisors = new ArrayList<>();
    public List<UndergraduateAdvisor> undergraduateAdvisors = new ArrayList<>();
    public Concentration allConcentrations;
    public Concentration softwareEngineeringConcentration;
    public Concentration databasesConcentration;
    public Concentration systemsConcentration;
    public Concentration programmingLanguagesConcentration;
    public Concentration securityConcentration;
    public Concentration webTechnologyConcentration;
    public Concentration analyticsConcentration;
    public SubConcentration pythonSubConcentration;
    public SubConcentration javaSubConcentration;
    public SubConcentration sqlSubConcentration;
    public SubConcentration diagrammingSubConcentration;
    private static Department instance;

    private Department() {}

    // returns the same instance of the Department
    public static Department getInstance() {
        if (instance == null) {
            instance = new Department();
        }
        return instance;
    }


    // createCourses creates courses and adds them to the courseHashMap
    public void createCourses() {
        // undergrad comp sci core courses
        Course cs101 = new Course("Introduction to Computer Science 1",
                "Introductory Computer Science Topics. Level 1",
                "OOP, Computer Theory, & Calculus", 5, false, 2024, 1);
        courseHashMap.put("CS101", cs101);

        Course cs102 = new Course("Introduction to Computer Science 2",
                "Introductory Computer Science Topics. Level 2",
                "Python, SQL, Advanced Calculus", 5, false, 2024, 1);
        courseHashMap.put("CS102", cs102);

        Course cs103 = new Course("Combinatoric Structures",
                "Study of Combinatoric Structures",
                "All aspects of Combinatoric Structures", 5, false, 2024, 2);
        courseHashMap.put("CS103", cs103);

        Course cs104 = new Course("Computer Systems",
                "Study of Computer Systems",
                "Covers various aspects of Computer Systems.", 5, false, 2024, 2);
        courseHashMap.put("CS104", cs104);

        Course cs105 = new Course("Geometrical Algorithms",
                "Study of Geometrical Algorithms",
                "Covers aspects of Geometrical Algorithms", 5, false, 2025, 1);
        courseHashMap.put("CS105", cs105);

        Course cs111 = new Course("Intro to Complexity",
                "Study of Introductory Complexity",
                "Covers aspects of Introductory Complexity", 5, false, 2025, 1);
        courseHashMap.put("CS111", cs111);

        Course cs112 = new Course("Intro to Formal Methods", "Study of Introductory Formal Methods",
                "Covers aspects of Introductory Formal Methods", 5, false, 2025,
                2);
        courseHashMap.put("CS112", cs112);

        Course cs113 = new Course("Intro to Compiler Design", "Study of Introductory Compiler Design",
                "Covers aspects of Introductory Compiler Design", 5, false, 2025,
                2);
        courseHashMap.put("CS113", cs113);

        Course cs114 = new Course("Intro to Distributed Systems",
                "Study of Introductory Distributed Systems",
                "Covers aspects of Introductory Distributed Systems", 5, false, 2026,
                1);
        courseHashMap.put("CS114", cs114);

        Course cs115 = new Course("Intro to Formal Language Theory",
                "Study of Introductory Formal Language Theory",
                "Covers aspects of Introductory Formal Language Theory", 5, false, 2026,
                1);
        courseHashMap.put("CS115", cs115);

        Course cs116 = new Course("Intro to Artificial Intelligence",
                "Study of Introductory Artificial Intelligence",
                "Covers aspects of Introductory Artificial Intelligence", 5, false,
                2026, 2);
        courseHashMap.put("CS116", cs116);

        Course cs117 = new Course("Intro to Network Security",
                "Study of Introductory Network Security",
                "Covers aspects of Introductory Network Security", 5, false,
                2026, 2);
        courseHashMap.put("CS117", cs117);


        //undergrad cis core courses
        Course cs106 = new Course("Intro to Data Management",
                "Study of Data Management",
                "Covers aspects of Data Management", 5, false, 2024, 1);
        courseHashMap.put("CS106", cs106);

        Course cs107 = new Course("Programming Fundamentals",
                "Study of Programming Fundamentals",
                "Covers aspects of Programming Fundamentals", 5, false, 2024, 1);
        courseHashMap.put("CS107", cs107);

        Course cs108 = new Course("Business Processing and Communications Infrastructure",
                "Study of Business Processing and Communications Infrastructure",
                "Covers aspects of Business Processing and Communications Infrastructure", 5,
                false, 2024, 2);
        courseHashMap.put("CS108", cs108);

        Course cs109 = new Course("Database Management Systems",
                "Study of Database Management Systems",
                "Covers aspects of Database Management Systems", 5, false, 2024,
                2);
        courseHashMap.put("CS109", cs109);

        Course cs110 = new Course("Business Systems Analysis and Modeling",
                "Study of Business Systems Analysis and Modeling",
                "Covers aspects of Business Systems Analysis and Modeling", 5,
                false, 2025, 1);
        courseHashMap.put("CS110", cs110);

        Course cs118 = new Course("Intro to Multi-Tiered Application Development",
                "Study of Introductory Multi-Tiered Application Development",
                "Covers aspects of Introductory Multi-Tiered Application Development", 5,
                false, 2025, 1);
        courseHashMap.put("CS118", cs118);

        Course cs119 = new Course("Intro to Software Project Management",
                "Study of Introductory Software Project Management",
                "Covers aspects of Introductory Software Project Management", 5,
                false, 2025, 2);
        courseHashMap.put("CS119", cs119);

        Course cs120 = new Course("Intro to Net-Centric Computing",
                "Study of Introductory Net-Centric Computing",
                "Covers aspects of Introductory Net-Centric Computing", 5,
                false, 2025, 2);
        courseHashMap.put("CS120", cs120);

        Course cs121 = new Course("Intro to Application Development Technology",
                "Study of Application Development Technology",
                "Covers aspects of Introductory Application Development Technology", 5,
                false, 2026, 1);
        courseHashMap.put("CS121", cs121);

        Course cs122 = new Course("Intro to Application Development Technology",
                "Study of Application Development Technology",
                "Covers aspects of Introductory Application Development Technology", 5,
                false, 2026, 1);
        courseHashMap.put("CS122", cs122);

        Course cs123 = new Course("Intro to Spreadsheet Applications",
                "Study of Spreadsheet Applications",
                "Covers aspects of Introductory Spreadsheet Applications", 5,
                false, 2026, 2);
        courseHashMap.put("CS123", cs123);

        Course cs124 = new Course("Intro to Data Literacy and Management",
                "Study of Data Literacy and Management",
                "Covers aspects of Introductory Data Literacy and Management", 5,
                false, 2026, 2);
        courseHashMap.put("CS124", cs124);

        //graduate cs core courses
        Course cs511 = new Course("Advanced Algorithms",
                "Study of Advanced Algorithms",
                "Covers aspects of Advanced Algorithms", 5,
                false, 2024, 1);
        courseHashMap.put("CS511", cs511);
        Course cs512 = new Course("Complexity",
                "Study of Complexity",
                "Covers aspects of Complexity in Computer Systems", 5,
                false, 2024, 1);
        courseHashMap.put("CS512", cs512);
        Course cs513 = new Course("Object-Oriented Design and Development in Java",
                "Study of Object-Oriented Design and Development in Java",
                "Covers aspects of Object-Oriented Design and Development in Java", 5,
                false, 2024, 2);
        courseHashMap.put("CS513", cs513);
        Course cs514 = new Course("Distributed Systems",
                "Study of Distributed Systems",
                "Covers aspects of Distributed Systems", 5,
                false, 2024, 2);
        courseHashMap.put("CS514", cs514);


        //core course graduate cis
        Course cs516 = new Course("Advanced Data Management",
                "Study of Advanced Data Management",
                "Covers aspects of Advanced Data Management", 1, false, 2024, 1);
        courseHashMap.put("CS516", cs516);

        Course cs517 = new Course("Advanced Programming Techniques",
                "Study of Advanced Programming Techniques",
                "Covers aspects of Advanced Programming Techniques", 1, false, 2024,
                1);
        courseHashMap.put("CS517", cs517);

        Course cs518 = new Course("Advanced Business Processing and Communications Infrastructure",
                "Study of Advanced Business Processing and Communications Infrastructure",
                "Covers aspects of Advanced Business Processing and Communications Infrastructure", 1,
                false, 2024, 2);
        courseHashMap.put("CS518", cs518);

        Course cs519 = new Course("Advanced Database Management Systems",
                "Study of Advanced Database Management Systems",
                "Covers aspects of Advanced Database Management Systems", 1, false, 2024,
                2);
        courseHashMap.put("CS519", cs519);


        // core courses graduate da and certification in analytics
        Course cs521 = new Course("Advanced to Data Analysis",
                "Study of Advanced Data Analysis",
                "Covers aspects of Advanced Data Analysis", 5, false, 2024, 1);
        courseHashMap.put("CS521", cs521);

        Course cs522 = new Course("Advanced Programming with Python",
                "Study of Advanced Programming with Python",
                "Covers aspects of Advanced Programming with Python", 5, false, 2024,
                1);
        courseHashMap.put("CS522", cs522);

        Course cs523 = new Course("Advanced Programming with R",
                "Study of Advanced Programming with R",
                "Covers aspects of Advanced Programming with R", 5,
                false, 2024, 2);
        courseHashMap.put("CS523", cs523);

        Course cs524 = new Course("Advanced Data Science",
                "Study of Advanced Data Science",
                "Covers aspects of Advanced Data Science", 5, false, 2024,
                2);
        courseHashMap.put("CS524", cs524);


        //core classes security certification
        Course cs526 = new Course("Advanced Software Security",
                "Study of Advanced Software Security",
                "Covers aspects of Advanced Software Security", 5,
                false, 2024, 1);
        courseHashMap.put("CS526", cs526);

        Course cs527 = new Course("Programming for Software Security",
                "Advanced Study of Programming for Software Security",
                "Covers aspects of Programming for Software Security", 5,
                false, 2024, 1);
        courseHashMap.put("CS527", cs527);

        Course cs528 = new Course("Advanced Network Security",
                "Study of Advanced Network Security",
                "Covers aspects of Advanced Network Security", 5,
                false, 2024, 2);
        courseHashMap.put("CS528", cs528);

        Course cs529 = new Course("Secure Mobile Application Development",
                "Study of Secure Mobile Application Development",
                "Covers aspects of Secure Mobile Application Development", 1,
                false, 2024, 2);
        courseHashMap.put("CS529", cs529);

        //courses web tech certification
        Course cs530 = new Course("Advanced HTML and CSS",
                "Study of Advanced HTML and CSS",
                "Covers aspects of Advanced HTML and CSS", 5,
                false, 2024, 1);
        courseHashMap.put("CS530", cs530);

        Course cs531 = new Course("Advanced PHP",
                "Study of Advanced PHP",
                "Covers aspects of Advanced PHP", 5,
                false, 2024, 1);
        courseHashMap.put("CS531", cs531);

        Course cs532 = new Course("Advanced JavaScript",
                "Study of Advanced JavaScript",
                "Covers aspects of Advanced JavaScript", 5,
                false, 2024, 2);
        courseHashMap.put("CS532", cs532);

        Course cs533 = new Course("Advanced Web Development Frameworks",
                "Study of Advanced Web Development Frameworks",
                "Covers aspects of Advanced Vue.js and React", 5,
                false, 2024, 2);
        courseHashMap.put("CS533", cs533);

        // python courses electives
        Course py101 = new Course("Introduction to Python Programming",
                "Introduction to the Python programming language",
                "Covers basic Python programming concepts and syntax", 4,
                true, 2024, 1);
        courseHashMap.put("PY101", py101);

        Course py201 = new Course("Python Data Analysis",
                "Introduction to Data Analysis with Python",
                "Covers data analysis concepts and libraries in Python", 4,
                true, 2024, 2);
        courseHashMap.put("PY201", py201);

        Course py301 = new Course("Python for Machine Learning",
                "Introduction to Machine Learning with Python",
                "Covers machine learning concepts and libraries in Python", 5,
                true, 2025, 1);
        courseHashMap.put("PY301", py301);

        Course py401 = new Course("Web Scraping with Python",
                "Introduction to Web Scraping with Python",
                "Covers web scraping techniques using Python libraries", 3,
                true, 2025, 1);
        courseHashMap.put("PY401", py401);

        Course py501 = new Course("Python for Artificial Intelligence",
                "Introduction to Artificial Intelligence with Python",
                "Covers AI concepts and libraries in Python", 5,
                true, 2025, 2);
        courseHashMap.put("PY501", py501);

        // java courses electives

        Course ja522 = new Course("Advanced Java Programming",
                "Study of Advanced Java Programming",
                "Covers advanced topics like Reflection, Generics, and Multithreading", 5,
                true, 2024, 2);
        courseHashMap.put("JA522", ja522);

        Course ja511 = new Course("Object-Oriented Programming in Java",
                "Study of Object-Oriented Programming in Java",
                "Covers topics like classes, objects, inheritance, and polymorphism", 4,
                true, 2025, 1);
        courseHashMap.put("JA511", ja511);

        Course ja544 = new Course("Java Enterprise Development",
                "Study of Java Enterprise Development",
                "Covers JavaEE technologies such as JPA, Servlets, JSP, and EJB", 5,
                true, 2024, 1);
        courseHashMap.put("JA544", ja544);

        Course ja532 = new Course("Java Network Programming",
                "Study of Java Network Programming",
                "Covers topics like socket programming, network protocols, and distributed computing in Java", 4,
                true, 2024, 2);
        courseHashMap.put("JA532", ja532);

        Course ja577 = new Course("Java Security",
                "Study of Java Security",
                "Covers topics like authentication, authorization, and cryptography in Java", 3,
                false, 2026, 1);
        courseHashMap.put("JA577", ja577);

        Course cis512 = new Course("Systems Analysis and Design",
                "Introduction to systems analysis and design methodologies",
                "Covers requirements gathering, use cases, and UML diagrams", 4,
                true, 2025, 1);
        courseHashMap.put("CIS512", cis512);

        Course cis515 = new Course("Agile Methodologies",
                "Study of Agile software development methodologies",
                "Covers Agile project management, Scrum, and Kanban", 3,
                true, 2025, 2);
        courseHashMap.put("CIS515", cis515);

        Course cis518 = new Course("Business Process Modeling",
                "Introduction to Business Process Modeling",
                "Covers BPMN diagrams and process automation techniques", 3,
                true, 2024, 1);
        courseHashMap.put("CIS518", cis518);

        Course cis520 = new Course("Enterprise Architecture",
                "Study of Enterprise Architecture frameworks",
                "Covers TOGAF, Zachman, and other EA frameworks", 4,
                true, 2024, 2);
        courseHashMap.put("CIS520", cis520);

        Course cis525 = new Course("Data Modeling and Analysis",
                "Introduction to data modeling and analysis techniques",
                "Covers ER diagrams, data normalization, and SQL", 3,
                true, 2026, 1);
        courseHashMap.put("CIS525", cis525);

        Course sql101 = new Course("Introduction to SQL",
                "Introduction to Structured Query Language",
                "Covers basics of SQL syntax, data manipulation and query optimization", 3,
                true, 2024, 1);
        courseHashMap.put("SQL101", sql101);

        Course sql201 = new Course("Advanced SQL Techniques",
                "Study of Advanced SQL Techniques",
                "Covers aspects of Advanced SQL such as sub-queries and joins", 4,
                true, 2024, 2);
        courseHashMap.put("SQL201", sql201);

        Course sql301 = new Course("Database Administration with SQL",
                "Introduction to Database Administration with SQL",
                "Covers concepts of database administration and management using SQL", 3,
                true, 2025, 1);
        courseHashMap.put("SQL301", sql301);

        Course sql401 = new Course("Data Warehousing and Business Intelligence",
                "Study of Data Warehousing and Business Intelligence",
                "Covers advanced topics such as data mining, data modeling and business intelligence using SQL", 5,
                true, 2025, 2);
        courseHashMap.put("SQL401", sql401);

        Course sql501 = new Course("Big Data Analytics with SQL",
                "Study of Big Data Analytics with SQL",
                "Covers aspects of big data analytics and processing using SQL", 1,
                true, 2026, 1);
        courseHashMap.put("SQL501", sql501);

        Course cs515 = new Course("Compiler Design",
                "Study of Compiler Designs",
                "Covers aspects of Compiler Design", 5,
                true, 2025, 1);
        courseHashMap.put("CS515", cs515);

        Course cs520 = new Course("Advanced Business Systems Analysis and Modeling",
                "Advanced Study of Business Systems Analysis and Modeling",
                "Covers aspects of Advanced Business Systems Analysis and Modeling", 5,
                true, 2025, 1);
        courseHashMap.put("CS520", cs520);

        Course cs525 = new Course("Advanced Machine Learning",
                "Study of Advanced Machine Learning",
                "Covers aspects of Advanced Machine Learning", 5,
                true, 2025, 1);
        courseHashMap.put("CS525", cs525);
    }

    /* createConcentrations creates the concentrations, sub concentrations, & adds electives to
     * concentrations/subconcentrations
     */
    public void createConcentrations() {
        // create Concentration instances
        this.allConcentrations = new Concentration("All Concentrations",
                "Contains all concentrations and subconcentrations.");
        this.softwareEngineeringConcentration = new Concentration("Software Engineering",
                "Concentration in Software Engineering");
        this.databasesConcentration = new Concentration("Databases", "Concentration in Databases.");
        this.systemsConcentration = new Concentration("Systems", "Concentration in Systems.");
        this.programmingLanguagesConcentration = new Concentration("Programming Languages",
                "Concentration in Programming Languages.");
        this.securityConcentration = new Concentration("Security", "Concentration in IT Security.");
        this.webTechnologyConcentration = new Concentration("Web Technology",
                "Concentration in Web Technology.");
        this.analyticsConcentration = new Concentration("Analytics", "Concentration in Analytics.");

        //create SubConcentration instances
        this.pythonSubConcentration = new SubConcentration("Python", "SubConcentration in Python.");
        this.javaSubConcentration = new SubConcentration("Java", "SubConcentration in Java.");
        this.sqlSubConcentration = new SubConcentration("SQL", "SubConcentration in SQL.");
        this.diagrammingSubConcentration = new SubConcentration("Diagramming",
                "SubConcentration in Systems Diagramming.");

        //add SubConcentrations to appropriate Concentrations where applicable
        this.allConcentrations.add(softwareEngineeringConcentration);
        this.allConcentrations.add(programmingLanguagesConcentration);
        this.allConcentrations.add(databasesConcentration);
        this.allConcentrations.add(systemsConcentration);

        this.softwareEngineeringConcentration.add(pythonSubConcentration);
        this.softwareEngineeringConcentration.add(javaSubConcentration);
        this.programmingLanguagesConcentration.add(pythonSubConcentration);
        this.programmingLanguagesConcentration.add(javaSubConcentration);
        this.programmingLanguagesConcentration.add(sqlSubConcentration);
        this.databasesConcentration.add(sqlSubConcentration);
        this.databasesConcentration.add(diagrammingSubConcentration);
        this.systemsConcentration.add(sqlSubConcentration);
        this.systemsConcentration.add(diagrammingSubConcentration);

        //add Course to sub concentrations from HashMap

        this.diagrammingSubConcentration.add(courseHashMap.get("CIS512"));
        this.diagrammingSubConcentration.add(courseHashMap.get("CIS525"));
        this.diagrammingSubConcentration.add(courseHashMap.get("CIS520"));

        this.sqlSubConcentration.add(courseHashMap.get("CIS525"));
        this.sqlSubConcentration.add(courseHashMap.get("SQL101"));
        this.sqlSubConcentration.add(courseHashMap.get("SQL201"));
        this.sqlSubConcentration.add(courseHashMap.get("SQL301"));
        this.sqlSubConcentration.add(courseHashMap.get("SQL401"));
        this.sqlSubConcentration.add(courseHashMap.get("SQL501"));

        this.pythonSubConcentration.add(courseHashMap.get("PY101"));
        this.pythonSubConcentration.add(courseHashMap.get("PY201"));
        this.pythonSubConcentration.add(courseHashMap.get("PY301"));
        this.pythonSubConcentration.add(courseHashMap.get("PY501"));
        this.pythonSubConcentration.add(courseHashMap.get("PY501"));
        this.pythonSubConcentration.add(courseHashMap.get("CS525"));

        this.javaSubConcentration.add(courseHashMap.get("JA522"));
        this.javaSubConcentration.add(courseHashMap.get("JA511"));
        this.javaSubConcentration.add(courseHashMap.get("JA544"));
        this.javaSubConcentration.add(courseHashMap.get("JA532"));
        this.javaSubConcentration.add(courseHashMap.get("JA577"));
        this.javaSubConcentration.add(courseHashMap.get("CS515"));
    }

    /* method gets the course name, year & semester, enrollment and the students enrolled by calling methods from
     * course class for the course in the parameter
     */
    public void getCourseEnrollmentDetails(Course course) {
        System.out.println(course.getName());
        System.out.println("Year = " + course.getYear() + " Semester = " + course.getSemester());
        System.out.println("Enrollment Limit = " + course.getEnrollmentLimit());
        System.out.println("Current Enrollment = " + course.getEnrollment());
        System.out.println("Current Students Enrolled:" + course.enrollmentOverview());
    }

    /* provides logic to enroll student in course with appropriate checks to make sure course ia available
     * and that the course is part of the student's core program
     */
    public void enrollStudent(Course course, Student student, int semester, int year) {
        if (student.getProgramEnrolled().coreCourses.contains(course)) {
            if (course.getYear() == year && course.getSemester() == semester) {
                student.enrollInCourse(course);
            } else {
                System.out.println("This course is not available for the given year and semester.");
            }
        } else {
            System.out.println("Course is a core course outside of the student's program.");
        }
    }

    /* method gets the courses that are offered by the department for a specific year and semester and prints string
     * and the course name
     */
    public void getCoursesBySemesterAndYear(int year, int semester) {
        System.out.println("Courses for Semester " + semester + ", Year " + year);
        for (Course course : courseHashMap.values()) {
            if (course.getYear() == year && course.getSemester() == semester) {
                System.out.println(course.getName());
            }

        }
    }
}

