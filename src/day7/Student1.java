public class Student1 {

    static class main {
        String name;
        int age;

        void deposit(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void display() {
            System.out.println(name);
            System.out.println(age);
        }
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.close();
    }
}
