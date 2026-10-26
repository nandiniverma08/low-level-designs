package AbstractFactory;

public class WindowsFactory implements UIFactory {

    public InterfaceTypes.Button createButton() {
        return new WindowsButton();
    }

    public InterfaceTypes.Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
