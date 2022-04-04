package Person;

public class Student extends Person {
    private int numCourses = 0;
    private String[] courses;
    private static final int MAX_COURSES = 30;
    private int[] grades;

    public Student(String name, String address) {
        super(name, address);
        courses = new String[MAX_COURSES];
        grades = new int[MAX_COURSES];
    }

    public void addCourseGrade(String course, int grade) {
        if (numCourses >= MAX_COURSES) {
            System.out.println("Cannot exceed 30 courses");
            return;
        }
        courses[numCourses] = course;
        grades[numCourses] = grade;
        numCourses++;
    }

    public void printGrades() {
        System.out.println(toString());
        for (int i = 0; i < numCourses; i++) {
            System.out.print(courses[i]);
            System.out.println(" " + grades[i]);
        }
    }

    public double getAverageGrade() {
        if (numCourses == 0) {
            System.out.println("numCourses is 0");
            return 0;
        }

        double averageGrade = 0.0;
        double totalGrade = 0.0;
        for (int i = 0; i < numCourses; i++) {
            totalGrade += grades[i];
        }
        averageGrade = totalGrade / numCourses;
        return averageGrade;
    }

    public String toString() {
        return "Student: " + super.toString();
    }

}
