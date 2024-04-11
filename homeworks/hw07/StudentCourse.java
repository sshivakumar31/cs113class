//HW 7.2
//Implement the class Student Course that represents a course in a student's schedule with: name,department, isntructor,grade, semster, year
// StudentCourse.java
public class StudentCourse {
    private String name;
    private String department;
    private Instructor instructor;
    private double grade;
    private char semester;
    private int year;

    public StudentCourse(String name, String department, Instructor instructor, double grade, char semester, int year) {
        this.name = name;
        this.department = department;
        this.instructor = instructor;
        this.grade = grade;
        this.semester = semester;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public char getSemester() {
        return semester;
    }

    public void setSemester(char semester) {
        this.semester = semester;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return "StudentCourse{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", instructor=" + instructor +
                ", grade=" + grade +
                ", semester=" + semester +
                ", year=" + year +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentCourse that = (StudentCourse) o;
        return Double.compare(that.grade, grade) == 0 && semester == that.semester && year == that.year && name.equals(that.name) && department.equals(that.department) && instructor.equals(that.instructor);
    }

    public static void main(String[] args) {
        // Testing the StudentCourse class
        Instructor instructor = new Instructor("John Doe", "Smith Building", 101);
        StudentCourse course = new StudentCourse("CS101", "Computer Science", instructor, 4.0, 'F', 2022);
        System.out.println(course.toString());
    }
}

