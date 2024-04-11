//HW 7.3
// Student.java
public class Student {
    private String name;
    private String major;
    private StudentCourse[] courses;

    public Student(String name, String major, StudentCourse[] courses) {
        this.name = name;
        this.major = major;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public StudentCourse[] getCourses() {
        return courses;
    }

    public void setCourses(StudentCourse[] courses) {
        this.courses = courses;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{name='").append(name).append('\'');
        sb.append(", major='").append(major).append('\'');
        sb.append(", courses=[");
        for (int i = 0; i < courses.length; i++) {
            sb.append(courses[i]);
            if (i < courses.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]}");
        return sb.toString();
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        if (!name.equals(student.name)) return false;
        if (!major.equals(student.major)) return false;
        if (courses.length != student.courses.length) return false;
        for (int i = 0; i < courses.length; i++) {
            if (!courses[i].equals(student.courses[i])) {
                return false;
            }
        }
        return true;
    }

    public double computeGPA() {
        double sum = 0;
        for (StudentCourse course : courses) {
            sum += course.getGrade();
        }
        return sum / courses.length;
    }

    public double computeGPA(char semester) {
        double sum = 0;
        int count = 0;
        for (StudentCourse course : courses) {
            if (course.getSemester() == semester) {
                sum += course.getGrade();
                count++;
            }
        }
        return count == 0 ? 0 : sum / count;
    }

    public double computeGPA(int year) {
        double sum = 0;
        int count = 0;
        for (StudentCourse course : courses) {
            if (course.getYear() == year) {
                sum += course.getGrade();
                count++;
            }
        }
        return count == 0 ? 0 : sum / count;
    }

    public double computeGPA(char semester, int year) {
        double sum = 0;
        int count = 0;
        for (StudentCourse course : courses) {
            if (course.getSemester() == semester && course.getYear() == year) {
                sum += course.getGrade();
                count++;
            }
        }
        return count == 0 ? 0 : sum / count;
    }

    public void addCourse(StudentCourse course) {
        StudentCourse[] newCourses = new StudentCourse[courses.length + 1];
        System.arraycopy(courses, 0, newCourses, 0, courses.length);
        newCourses[courses.length] = course;
        courses = newCourses;
    }

    public static void main(String[] args) {
        // Testing the Student class
        Instructor instructor1 = new Instructor("John Doe", "Smith Building", 101);
        Instructor instructor2 = new Instructor("Jane Smith", "Jones Hall", 202);

        StudentCourse course1 = new StudentCourse("CS101", "Computer Science", instructor1, 4.0, 'F', 2022);
        StudentCourse course2 = new StudentCourse("CS102", "Computer Science", instructor2, 3.5, 'S', 2022);

        StudentCourse[] courses = {course1, course2};

        Student student = new Student("Alice", "Computer Science", courses);

        System.out.println(student.toString());
        System.out.println("GPA: " + student.computeGPA());
        System.out.println("GPA in Fall: " + student.computeGPA('F'));
        System.out.println("GPA in Spring: " + student.computeGPA('S'));
        System.out.println("GPA in 2022: " + student.computeGPA(2022));
        System.out.println("GPA in Fall 2022: " + student.computeGPA('F', 2022));
    }
}

