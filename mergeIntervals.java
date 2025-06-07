class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]); 

        List<List<Integer>> li = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= end) {
                end = Math.max(end, intervals[i][1]);
            } else {
                List<Integer> res = new ArrayList<>();
                res.add(start);
                res.add(end);
                li.add(res);

                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        List<Integer> res = new ArrayList<>();
        res.add(start);
        res.add(end);
        li.add(res);

        int[][] result = new int[li.size()][2];
        for (int i = 0; i < li.size(); i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = li.get(i).get(j);
            }
        }

        return result;
    }
}
