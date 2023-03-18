package exercise1_strategy;

public class XMLDisplayerStrategy implements DisplayerStrategy {
    @Override
    public void displayObject(ExampleObject obj) {
        String message = "<exampleObject>" +
                "<field1>" + obj.getField1() + "</field1>" +
                "<field2>" + obj.getField2() + "</field2>" +
                "</exampleObject>";
        System.out.println(message);
    }
}
