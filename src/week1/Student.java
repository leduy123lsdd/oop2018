package week1;

public class Student {

    // TODO: khai báo các thuộc tính cho Student
    private String name;
    private String id;
    private String group;
    private String email;
    // TODO: khai báo các phương thức getter, setter cho Student

    public void setName(String n) {
        name = n;
    }
    public String getName() {
        return name;
    }

    public void setId(String i) {
        id = i;
    }
    public String getId() {
        return id;
    }

    public void setGroup(String g) {
        group = g;
    }
    public String getGroup() {
        return group;
    }

    public void setEmail(String e) {
        email = e;
    }
    public String getEmail() {
        return email;
    }


    /**
     * Constructor 1
     */
    Student() {
        // TODO:
        name = "Student";
        id = "000";
        group = "INT22041";
        email = "uet@vnu.edu.vn";
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        // TODO:
        name = n;
        id = sid;
        email = em;
        group = "INT22041";
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        // TODO:
        this.group = s.getGroup();
        this.email = s.getEmail();
        this.id = s.getId();
        this.name = s.getName();
    }

    String getInfo() {
        // TODO:
        System.out.println(name);
        System.out.println(id);
        System.out.println(group);
        System.out.println(email);
        return null;
    }
}
