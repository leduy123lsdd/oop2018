package week1;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    public static int amountStudents = 100;
    public static Student[] students = new Student[amountStudents];

    public static boolean sameGroup(Student s1, Student s2) {
        // TODO:
        return s1.getGroup() == s2.getGroup();
    }

    static void studentsByGroup() {
        // TODO:
        for (int i = 0; i < 100; i++) {
            Student currentStudent = students[i];
            if( currentStudent.getGroup() == "INT22042") {
                currentStudent.getInfo();
                System.out.println("\n");
            }
        }
    }

    void removeStudent(String id) {
        // TODO:
        for(int i = 0; i < 100; i++) {
            if ( students[i].getId() == id ) {
                amountStudents -= 1;
                for(int j = 0;j < amountStudents; j++) {
                    students[j] = students[j+1];
                }
            }
        }
    }

    public static void main(String[] args) {
        // TODO:

        //Student studen_A = new Student();
        // a: Tao ra mot sinh vien.
        Student newStudent = new Student();

        // b : thiet lap cac thong tin ve sinh vien.
        newStudent.setEmail("lecanhduy@gmail.com");
        newStudent.setGroup("INT2204_4");
        newStudent.setId("17020647");
        newStudent.setName("LeCanhDuy");

        // c: in ra ten cua sinh vien.
        System.out.println(newStudent.getName());

        // d: in ra toan bo thong tin cua sinh vien.
        newStudent.getInfo();

        // Constructor 1
        Student checkConstructor1 = new Student();
        checkConstructor1.getInfo();

        // Constructor 2
        Student checkConstructor2 = new Student("le canh duy","17020647","lecanhduylsdd@gmail.com");
        checkConstructor2.getInfo();

        // Constructor 3
        Student checkConstructor3 = new Student(checkConstructor2);
        System.out.println("This is Constructor3 test:");
        checkConstructor3.getInfo();

        // Test sameGroup method
        Student a = new Student();
        a.setGroup("INT22041");

        Student b = new Student();
        b.setGroup("INT22041");

        Student c= new Student();
        c.setGroup("INT22042");

        System.out.print(sameGroup(a,b));
        System.out.println("\n");
        System.out.print(sameGroup(a,c));
        System.out.println("\n");


        // test method StudentsByGroup
        for(int i = 0; i < 100; i++) {
            students[i] = new Student();
        }

        students[0].setGroup("INT22042");
        students[0].setName("hoc sinh 0");

        students[1].setGroup("INT22042");
        students[1].setName("hoc sinh 1");

        students[2].setGroup("INT22041");
        students[2].setName("hoc sinh 2");

        students[3].setGroup("INT22042");
        students[3].setName("hoc sinh 3");

        studentsByGroup();
    }
}
