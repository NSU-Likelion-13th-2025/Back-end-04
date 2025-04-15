package Session2Homework;

class Student {
    String name;
    int age ;
    int studentId ;


    public Student(String name, int age, int studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    public Student() {
        this.name = "홍길동";
        this.age = 20;
        this.studentId = 25123456;
    }

    void introduce() {
        System.out.println("학생 이름: " + name +"\n학생 나이: " + age + "\n학생 학번: " + +studentId );
    }
    
}

public class session2 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.introduce();

        Student student2 = new Student("한상훈",24,21102088); //다른 생성자 호출
        student2.introduce();
    }
}
