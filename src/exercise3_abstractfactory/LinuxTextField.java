package exercise3_abstractfactory;

public class LinuxTextField implements TextField {

    private String input;

    @Override
    public void setInput(String input) {
        this.input = input;
    }
}
