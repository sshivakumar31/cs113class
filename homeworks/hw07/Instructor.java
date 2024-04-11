//HW 7.1
// Instructor Class creates instructor name, building where the office is, and office number 
// Instructor.java

public class Instructor {
    private String name;
    private String officeBuilding;
    private int officeNumber;

    public Instructor(String name, String officeBuilding, int officeNumber) {
        this.name = name;
        this.officeBuilding = officeBuilding;
        this.officeNumber = officeNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOfficeBuilding() {
        return officeBuilding;
    }

    public void setOfficeBuilding(String officeBuilding) {
        this.officeBuilding = officeBuilding;
    }

    public int getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(int officeNumber) {
        this.officeNumber = officeNumber;
    }

    public String toString() {
        return "Instructor{name='" + name + "', officeBuilding='" + officeBuilding + "', officeNumber=" + officeNumber + "}";
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Instructor)) return false;
        Instructor other = (Instructor) obj;
        return name.equals(other.name) && officeBuilding.equals(other.officeBuilding) && officeNumber == other.officeNumber;
    }
    public static void main(String[] args) {
        // Testing the Instructor class
        Instructor instructor = new Instructor("John Doe", "Science Building", 101);
        System.out.println(instructor);
    }
}

