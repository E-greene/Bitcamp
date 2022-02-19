package february.week02.hw0221;
//Prob02를 extends 사용해서 해보기

class School{
    ///Field
    private String name;
    private int age;

    ///Constructor
    School(String name, int age){
        this.name = name;
        this.age = age;
    }

    ///Method
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}

class Student1 extends School{
    //멤버변수 private 선언
    private int id;

    //Constructor
    Student1(String name, int age, int id){
        super(name, age);
        this.id = id;
    }

    //getter,setter
    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public void print(){
        System.out.println("이  름 : "+getName()+"   나  이 : "+getAge()+"   학  번 : "+getId());
    }


}

class Teacher1 extends School{
    ///Field
    private String subject;

    //Constructor
    Teacher1(String name, int age, String subject){
        super(name, age);
        this.subject = subject;
    }

    //getter, setter
    public void setSubject(String subject){
        this.subject = subject;
    }

    public String getSubject(){
        return this.subject;
    }

    public void print(){
        System.out.println("이  름 : "+getName()+"   나  이 : "+getAge()+"   학  번 : "+getSubject());
    }
}


class Employee1 extends School{
    /// Field
    private String dept;

    //Constructor
    Employee1(String name, int age, String dept){
        super(name, age);
        this.dept = dept;
    }

    //getter, setter

    public void setDept(String dept){
        this.dept = dept;
    }

    public String getDept(){
        return this.dept;
    }

    public void print(){
        System.out.println("이  름 : "+getName()+"   나  이 : "+getAge()+"   학  번 : "+getDept());
    }
}

public class Prob02_1 {
    public static void main(String[] args) {

        Student1 s = new Student1("홍길동",20,200201);
        Teacher1 t = new Teacher1("이순신",30,"JAVA");
        Employee1 e = new Employee1("유관순", 40, "교무과");

        s.print();
        t.print();
        e.print();
    }
}

