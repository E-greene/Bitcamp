package february.week02.hw0221;


class Student{
    //멤버변수 private 선언
    private String name;
    private int age;
    private int id;

    //Constructor
    Student(String name, int age, int id){
        this.name = name;
        this.age = age;
        this.id = id;
    }

    //getter,setter
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public int getId(){
        return this.id;
    }

    public void print(){
        System.out.println("이  름 : "+getName()+"   나  이 : "+getAge()+"   학  번 : "+getId());
    }


}

class Teacher{
    private String name;
    private int age;
    private String subject;

    //Constructor
    Teacher(String name, int age, String subject){
        this.name = name;
        this.age = age;
        this.subject = subject;
    }

    //getter, setter
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getSubject(){
        return this.subject;
    }

    public void print(){
        System.out.println("이  름 : "+getName()+"   나  이 : "+getAge()+"   학  번 : "+getSubject());
    }
}


class Employee{
    private String name;
    private int age;
    private String dept;

    //Constructor
    Employee(String name, int age, String dept){
        this.name = name;
        this.age = age;
        this.dept = dept;
    }

    //getter, setter
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setDept(String dept){
        this.dept = dept;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getDept(){
        return this.dept;
    }

    public void print(){
        System.out.println("이  름 : "+getName()+"   나  이 : "+getAge()+"   학  번 : "+getDept());
    }
}

public class Prob02 {
    public static void main(String[] args) {

        Student s = new Student("홍길동",20,200201);
        Teacher t = new Teacher("이순신",30,"JAVA");
        Employee e = new Employee("유관순", 40, "교무과");

        s.print();
        t.print();
        e.print();
    }
}
