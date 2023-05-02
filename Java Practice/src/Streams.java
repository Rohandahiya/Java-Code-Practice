import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Streams {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(2,9,34,7,89,3,4,1);

        int arr[] = {2,3,4,5,6,7,8,9,10};

        Collections.sort(nums,new Comparator<Integer>(){

            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
//        System.out.println(nums.toString());
//        Arrays.stream(arr).sum();

        Object[] array = nums.toArray();
        for(Object x:array){
            System.out.println(x);
        }


    }
}
