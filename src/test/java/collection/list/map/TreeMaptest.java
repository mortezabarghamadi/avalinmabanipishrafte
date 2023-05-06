package collection.list.map;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMaptest {
    @Test
    void bayad_map_ra_moratab_konad() {
        Map<String,String> motorCycle= new TreeMap<>();
        motorCycle.put("honda","japan");
        motorCycle.put("vespa","italy");
        motorCycle.put("kavir","iran");
        motorCycle.put("harley davidson","USA");
        motorCycle.put("BMW Motorrad","germany");

        Object[] keys = motorCycle.keySet().toArray();
        Assertions.assertThat(keys[0]).isEqualTo("BMW Motorrad");
        Assertions.assertThat(keys[0]).isEqualTo("harley davidson");
        Assertions.assertThat(keys[0]).isEqualTo("honda");
        Assertions.assertThat(keys[0]).isEqualTo("kavir");
        Assertions.assertThat(keys[0]).isEqualTo("vespa");
    }

}
