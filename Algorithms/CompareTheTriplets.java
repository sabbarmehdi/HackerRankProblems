package Algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareTheTriplets {


    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<Integer>(2){{add(0); add(0);}};
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                result.set(0, (result.get(0)+1));
            }else if (a.get(i) < b.get(i)){
                result.set(1, (result.get(1)+1));
            }
        }
        System.out.println("List result: " + result.toString());
        return result;
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();
        Collections.addAll(list1, 5, 6, 7);
        List<Integer> list2 = new ArrayList<Integer>();
        Collections.addAll(list2, 3, 6, 10);

        compareTriplets(list1, list2);
    }
    }
