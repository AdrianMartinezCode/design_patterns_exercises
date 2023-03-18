package exercise1_strategy;

public class PlainTextDisplayerStrategy implements DisplayerStrategy {
    @Override
    public void displayObject(ExampleObject obj) {
        System.out.println("ExampleObject:\n");
        System.out.println("Field1: " + obj.getField1() + "\n");
        System.out.println("Field2: " + obj.getField2() + "\n");
    }
}
