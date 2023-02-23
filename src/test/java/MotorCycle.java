import khodro.Khodro;
import khodro.Mashin;
import khodro.Motor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MotorCycle {
    @Test
    void AmalkardMotor() {
        Khodro motor = new Motor("honda",180,"scooter");
        boolean ayaHarekatMikonad = motor.ayaharekatmikonad();
        Assertions.assertFalse(ayaHarekatMikonad);
    }
}