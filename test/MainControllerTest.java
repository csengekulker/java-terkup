import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;

import controllers.MainController;

public class MainControllerTest {

    MainController mainController;

    @BeforeEach
    public void initEach() {
        this.mainController = new MainController();
    }

    @Test
    public void testCalcVolume() {
        
        double radius = 30;
        double height = 35;
        double expected = 32986.722862692826;
        double volume = this.mainController.calcVolume(radius, height);

        assertEquals(expected, volume);

    }

    @Test
    public void testCalcVolume2() {
        
        double radius = 40;
        double height = 45;
        double expected = 75398.22368615502;
        double volume = this.mainController.calcVolume(radius, height);

        assertEquals(expected, volume);

    }
}
