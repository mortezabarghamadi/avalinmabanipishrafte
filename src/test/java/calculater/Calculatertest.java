package calculater;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Calculatertest {
    @Test
    void bayad_hasel_jam_ra_be_dast_avarad() {
    Calculator calculater= new Calculator();

        String haseljam=calculater.add("5.3","-2");
        Assertions.assertEquals("3.3",haseljam);
        String haseltafrigh=calculater.subt("3.1","1");
        Assertions.assertEquals("2.1",haseltafrigh);
        String haselzarb =calculater.multi("1.2","2");
    }
}
