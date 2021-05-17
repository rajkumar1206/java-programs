package Lab3;

class AgeException extends Exception {
    AgeException(String txt) {
        super(txt);
    }
}

class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeException {
        if (age <= 0 || age >= 110) throw new AgeException("Invalid Age of Person");
        this.age = age;
    }
}

public class Program13 {
    public static void main(String[] args) {
        Person ps = new Person();
        try {
            ps.setAge(120);
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
