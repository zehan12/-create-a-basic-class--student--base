public class Student {
    // write the code of student class here
    int age;
    String name;

    public Student (int userAge, String userName) {
        age = userAge;
        name = userName;
    }

    public void display () {
        System.out.println("My name is "+ name +". I am " + age + " years old");
    }

    public void sayHello () {
        System.out.println("hello "+name);
    }

    public  static void  main(String[] args) {
        Student zehan = new Student(23,"zehan");
        zehan.display();
        zehan.sayHello();
    }
}
