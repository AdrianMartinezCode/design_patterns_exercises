package exercise3_abstractfactory;

public class WindowsFactory implements UIFactory {
    @Override
    public TextField createTextField() {
        return new WindowsTextField();
    }

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new WindowsCheckbox();
    }
}
