package tests;

import manager.Configuration;
import models.User;
import org.testng.annotations.Test;
import screens.LoginScreen;

public class DeleteEventTest extends Configuration {
    @Test
    public void deleteEventSuccess(){
        new LoginScreen(driver)
                .complexLogin(User.builder().email("noa@gmail.com").password("Nnoa12345$").build())
                .selectFirstEvent()
                .deleteEvent()
                .checkFabButtonPresentAssert()
                .openMenu()
                .logout();

    }
}
