package collection.list.map;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Maptest {
    @Test
    void class_Map_bayad_kamel_shavad() {
        Map<String,String> motorCycle= new HashMap<>();
        motorCycle.put("honda","japan");
        motorCycle.put("vespa","italy");
        motorCycle.put("kavir","iran");
        motorCycle.put("harley davidson","USA");
        motorCycle.put("BMW Motorrad","germany");
       // for( int index=0; index<motorCycle.size();index++){
            Set<Map.Entry<String, String>> entries = motorCycle.entrySet();
            for (Map.Entry<String, String> entry: entries) {
                String key = entry.getKey();
                String value = entry.getValue();
                System.out.println(key +" made in "+ value);
            }
        }
    }
//}
