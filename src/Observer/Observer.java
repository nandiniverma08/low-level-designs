package Observer;

import com.sun.tools.javac.Main;

import javax.security.auth.Subject;
import java.util.Objects;

//Purpose: Jab ek object mein change ho, toh uske saare subscribed objects ko automatically notify karna.
//Classes ka role
//- Observer (interface): Rule define karta hai ki notification receive karne ke liye update() method hona chahiye.
//        - Subscriber (class): Observer implement karti hai aur notification receive karti hai.
//- YouTubeChannel (Subject): Subscribers ki list maintain karta hai aur new video upload hone par sabko notify karta hai.
//        - Main: Objects banata hai, subscribers register karta hai aur video upload karta hai.
//

public interface Observer {

    void update(String video);
}
