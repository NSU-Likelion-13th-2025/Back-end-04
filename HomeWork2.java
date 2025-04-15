
class Student {
    String name;
    int age;
    int studentID;

    public Student() {
        this.name ="홍길동";
        this.age = 20;
        this.studentID = 25123456;
    }
    public Student(String name, int age, int studentID) {
        this.name = name;
        this.age = age;
        this.studentID = studentID;
    }

    public void introduce(){
        System.out.println("학생 이름: "+name);
        System.out.println("학생 나이: "+age);
        System.out.println("학생 학번: "+studentID);
    }
}

public class HomeWork2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.introduce();

        Student s2 = new Student("이준섭",25,21101848);
        s2.introduce();
    }

}
