import khodro.Motor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MotorCycle {
    @Test
    void AmalkardMotor() {
        Motor motor = new Motor();
        boolean ayaHarekatMikonad = motor.ayaharekatmikonad();
        Assertions.assertFalse(ayaHarekatMikonad);
        motor.markkhodro();
    }
}