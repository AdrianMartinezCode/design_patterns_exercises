package exercise3_abstractfactory;

public interface UIFactory {

    TextField createTextField();
    Button createButton();
    Checkbox createCheckBox();

}
