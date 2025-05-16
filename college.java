class College {
    String collegename = "HICET";

    public void displayCollege() {
        System.out.println("College : " + collegename);
    }
}

class Department extends College {
    String deptname = "techquora";

    public void displayDepartment() {
        System.out.println("Deptname: " + deptname);
    }
}

class Student extends Department {
    long regno;

    public Student(long regno) {
        this.regno = regno;
    }

    public void displayStudent() {
        System.out.println("Reg no: " + regno);
    }
}

public class college {
    public static void main(String[] args) {
        Student studentv = new Student(10106);

        studentv.displayCollege();
        studentv.displayDepartment();
        studentv.displayStudent();
    }
}
