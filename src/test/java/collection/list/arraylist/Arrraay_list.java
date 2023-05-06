package collection.list.arraylist;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class Arrraay_list {
    @Test
    void arraye() {
        int[] number=new int[3];
         number[0]=2;
        // number[1]=2;
         number[1]=3;
         number[2]=4;
        
        Covertor covertor = new Covertor();
       List<Integer> arraylistnumber=covertor.coverstory(number);
       Set<Integer> expected=new HashSet<>();
        expected.add(2);
        expected.add(3);
        expected.add(3);
        expected.add(3);
        expected.add(3);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        //expected.remove(2);

       // Collections.sort(expected);
  Set<Integer> sortexpected = new HashSet<>();
  sortexpected.add(2);
        sortexpected.add(3);
        sortexpected.add(4);
        sortexpected.add(5);
        sortexpected.add(6);
      //  sortexpected.add(7);

  Assertions.assertThat(expected).isEqualTo(sortexpected);
       for(int expectedd : expected){
           System.out.println(expectedd);
  }


        //        Assertions.assertThat(arraylistnumber).isEqualTo(expected);
//       //
//       Assertions.assertThat(number.length).isEqualTo(3);
    }

    private class Covertor {
        public List<Integer> coverstory(int[] number) {
           List<Integer> numbers= new LinkedList<>();
            for (int numberss : number)
                numbers.add(numberss);
            return numbers;

        }
    }
}

