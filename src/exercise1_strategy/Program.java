package exercise1_strategy;

public class Program {

    private DisplayerStrategy displayerStrategy;
    private ExampleObject exampleObject;

    public void setExampleObject(ExampleObject exampleObject) {
        this.exampleObject = exampleObject;
    }

    public void displayObject() {
        this.displayerStrategy.displayObject(exampleObject);
    }

    public void setDisplayerStrategy(DisplayerStrategy displayerStrategy) {
        this.displayerStrategy = displayerStrategy;
    }

}
