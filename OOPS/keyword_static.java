public class keyword_static {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.schoolName="JMV";

        Student s2 = new Student();
        System.out.println(s2.schoolName);

        Student s3 = new Student();
        s2.schoolName="ABC"; //now saare objects ke liye school name "ABC" ho jaega.
    }
}

class Student{
    String name;
    int roll;

    static String schoolName;

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }
}