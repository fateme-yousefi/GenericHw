import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class HW1 {
    public static void main(String[] args) {
        List<Integer> firstList = new ArrayList<>();
        List<Integer> secondList = new ArrayList<>();

        firstList.add(1);
        firstList.add(2);
        firstList.add(3);
        firstList.add(3);

        secondList.add(1);
        secondList.add(2);
        secondList.add(3);
        secondList.add(4);

        List<Boolean> result = isEqualList(firstList, secondList);

        System.out.println(result);
    }

    public static List<Boolean> isEqualList(List<Integer> list1, List<Integer> list2) {
        List<Boolean> result = new ArrayList<>();
        int s = list1.size();
        int j = list2.size();
        if (s == j) {
            for (int i = 0; i <= s-1; i++) {
                if (list1.get(i).equals(list2.get(i))) {
                    result.add(true);
                } else {
                    result.add(false);
                }

            }
        } else {
            System.out.println("Eror");
        }
        return result;
    }
}
