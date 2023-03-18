package exercise3_abstractfactory;

import java.util.ArrayList;
import java.util.List;

public class Application {

    private List<Button> buttons;
    private List<Checkbox> checkboxes;
    private List<TextField> textFields;

    private UIFactory uiFactory;


    public Application(UIFactory uiFactory) {
        this.uiFactory = uiFactory;
        buttons = new ArrayList<>();
        checkboxes = new ArrayList<>();
        textFields = new ArrayList<>();
    }

    public void initialize() {
        buttons.add(uiFactory.createButton());
        buttons.add(uiFactory.createButton());

        checkboxes.add(uiFactory.createCheckBox());

        textFields.add(uiFactory.createTextField());
    }
}
