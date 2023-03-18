package exercise3_abstractfactory;

public class LinuxFactory implements UIFactory {
    @Override
    public TextField createTextField() {
        return new LinuxTextField();
    }

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new LinuxCheckbox();
    }
}
