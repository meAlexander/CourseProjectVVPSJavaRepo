public class Person {
    private String name;
    protected int age;

    public Person(String name) {
        this.name = name;
    }

    public Person(int age, String name){
        System.out.println("int");
    }
    public Person(long age, String name){
        System.out.println("long");
    }

    public String getName() {
        return name;
    }

    public int doing(int a) throws Exception{
        return 0;
    }
}
