package AbstractFactory;

public interface UIFactory {
    InterfaceTypes.Button createButton();
    InterfaceTypes.Checkbox createCheckbox();
}
