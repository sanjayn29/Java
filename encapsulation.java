class Student {

    private int age;   // hidden data

    // setter (write)
    public void setAge(int age) {
        this.age = age;
    }

    // getter (read)
    public int getAge() {
        return age;
    }
}

class Main {
    public static void main(String[] args) {

        Student s = new Student();

        s.setAge(21);           // controlled access
        System.out.println(s.getAge());
    }
}