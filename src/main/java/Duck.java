public class Duck extends Animal implements Flying{
    @Override
    void say() {
        System.out.println("кря");

    }

    @Override
    public void fly() {
        System.out.println("Я лечу");

    }
}
