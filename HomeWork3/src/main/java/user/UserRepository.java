package user;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    // Тут можно хранить аутентифицированных пользователей
    List<User> data = new ArrayList<>();



    public void addUser(User user) {
        if (user.isAuthenticate() == true){
            data.add(user);
        }
    }


}