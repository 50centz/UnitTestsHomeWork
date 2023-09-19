package user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class UserRepositoryTest {

    User user1;
    User user2;

    @BeforeEach
    void setUp() {
        user1 = new User("Vova", "qwerty", Role.USER);
        user1.authenticate();

        user2 = new User("Vasya", "qwe321", Role.ADMIN);
        user2.authenticate();
    }


    @Test
    void logOutTest() {
        assertTrue(user1.logOut());
        assertFalse(user2.logOut());
    }

}
