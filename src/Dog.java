
public class Dog extends Animal{
    private int eyes;
    private int teeth;
    private int tail;
    private int legs;

    public Dog(String name, int brain, int body, int size, int weight, int eyes, int teeth, int tail, int legs) {
        super(name, brain, body, size, weight);
        this.eyes = eyes;
        this.teeth = teeth;
        this.tail = tail;
        this.legs = legs;
    }

//    public Dog(String name, int brain, int body, int size, int weight) {
//        super(name, brain, body, size, weight);
//    }

    @Override
    public void eat() {
        System.out.println("Dog eat() function called");
        chew();
        super.eat();
    }

    private void chew() {
        System.out.println("Chew() called");
    }
}
