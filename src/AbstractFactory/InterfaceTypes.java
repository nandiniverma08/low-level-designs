package AbstractFactory;

import javax.crypto.Mac;

public interface InterfaceTypes {
//    Abstract Factory = related objects ki family create karna, without directly depending on their concrete classes.
//
//    Yaad rakhne ka shortcut:
//            - Factory Method → Which object?
//            - Abstract Factory → Which family of related objects?
//    - Button interface: Button ko kya karna hai, define karta hai — render().
//            - Checkbox interface: Checkbox ko kya karna hai, define karta hai — render().
//    Abstract Factory mein: Ye dono product interfaces hain. Ye common contract define karte hain, jise Windows aur Mac ki concrete classes implement karti hain.
//
//            Example: WindowsButton Windows-style button render karega, aur MacButton Mac-style button.
    interface Button {
        void render();
    }

    interface Checkbox {
        void render();
    }
}
