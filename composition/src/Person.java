public class Person {
    private String name;
    private Dimension dim;

    public Person(String name, Dimension dim) {
        this.name = name;
        this.dim = dim;
    }

    public String getName() {
        return name;
    }

    public Dimension getDim() {
        return dim;
    }
}
