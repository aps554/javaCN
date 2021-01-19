public class start {
    public static void main(String[] args) {
//        int value = 1;
//        switch (value){
//            case 1:
//                System.out.println("Value was 1");
//                break;
//            case 2:
//                System.out.println("Value was 2");
//                break;
//            default:
//                System.out.println("Value was grater than 2");
//                break;
//        }
//        if(value == 1)
//            System.out.println("value equal to 1");
//        else
//            System.out.println("Value is not 1");

        Animal a = new Animal("Animal",1,1,23,45);
        a.eat();
        Dog d = new Dog("redick",1,1,45,25,2,34,1,4);
        d.eat();
        Animal animal = new Dog("default",1,1,45,34,2,45,1,4);
        animal.eat();
    }
}
