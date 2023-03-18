package exercise1_strategy;

public class JSONDisplayerStrategy implements DisplayerStrategy {
    @Override
    public void displayObject(ExampleObject obj) {
        String json = "{exampleObject: {field1: " + obj.getField1() + ",field2:" + obj.getField2() + "}}";
        System.out.println(json);
    }
}
