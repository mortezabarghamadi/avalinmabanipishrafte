package compare;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Objects;

public class Compareobjecttest {
    @Test
    void bayad_moghayese_konad() {
        String ronaldo= new String("right") ;
        String neymar =new String("right");
        String messi = new String("left");
        Assertions.assertThat(Objects.equals(ronaldo,neymar)).isTrue();
        Assertions.assertThat(Objects.equals(ronaldo,messi)).isFalse();

//        int s1= 2;
//        int s2=2;
//        Assertions.assertThat(s1).isEqualTo(s2);

    }
}
