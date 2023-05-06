package collection.list.arraylist;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class array_list_test {
    @Test
    void bayad_khali_bashad_vaghti_sakhte_mishavad() {
        ArrayList<String> strings = new ArrayList<>();

        Assertions.assertThat(strings).isEmpty();

    }

    @Test
    void arraye() {
        int[] meghdar=new int[3];
        meghdar[0]=0;
        meghdar[1]=1;
        meghdar[2]=2;
        covertor covertor = new covertor();
        List<Integer> arraylistmeghdar=covertor.covertoarray(meghdar);
        List<Integer> expected=new ArrayList<>();
        expected.add(0);
        expected.add(1);
        expected.add(2);

        Assertions.assertThat(arraylistmeghdar).isEqualTo(expected);
    }
    public class covertor{

        public List<Integer> covertoarray(int[] meghdar) {
            List<Integer> numbers=new ArrayList<>();
            for (int number : meghdar) {
               numbers.add(number);
            }
            return numbers;

        }
    }
    }

