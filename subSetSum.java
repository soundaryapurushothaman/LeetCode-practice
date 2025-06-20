import java.util.*;

public class Subsetsum {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 1));
        int target = 3;
        sub(arr, target, new ArrayList<>(), 0);
    }

    static void sub(ArrayList<Integer> arr, int target, ArrayList<Integer> res, int index) {
        if (target == 0) {
            System.out.println(res);
            return;
        }

        if (index >= arr.size()) {
            return;
        }

        // Include current element
        res.add(arr.get(index));
        sub(arr, target - arr.get(index), res, index + 1);
        res.remove(res.size() - 1); // backtrack

        // Exclude current element
        sub(arr, target, res, index + 1);
    }
}
