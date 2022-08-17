package tests;

import manager.Configuration;
import models.Event;
import models.User;
import org.testng.annotations.Test;
import screens.LoginScreen;

public class EventCreateTests2  extends Configuration {

    @Test
    public void createNewEvent(){

        new LoginScreen(driver)
                .complexLogin(User.builder().email("noa@gmail.com").password("Nnoa12345$").build())
                .initCreationEvent()
                .dataAction()
                .createNewEvent(Event.builder().title("Me Title").type("My Type").breaks(2).wage(50).build())
                .checkFabButtonPresentAssert()
                .openMenu()
                .logout();


    }
    @Test
    public void createNewEventCheckData(){

        new LoginScreen(driver)
                .complexLogin(User.builder().email("noa@gmail.com").password("Nnoa12345$").build())
                .initCreationEvent()
                .selectDataAction("18/08/2022")
                .createNewEvent(Event.builder().title("Me Title").type("My Type").breaks(2).wage(50).build())
                .checkFabButtonPresentAssert()
                .openMenu()
                .logout();


    }
}
