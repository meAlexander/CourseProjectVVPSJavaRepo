public class Student extends Person{
    public Student(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int doing(int b) throws RuntimeException{
        return 5;
    }
}
