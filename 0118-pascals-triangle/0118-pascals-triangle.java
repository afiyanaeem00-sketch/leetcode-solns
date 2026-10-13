
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> row = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            for (int j = row.size() - 1; j >= 1; j--) {
                int val = row.get(j) + row.get(j - 1);
                row.set(j, val);
            }

            row.add(1);
            ans.add(new ArrayList<>(row));
        }

        return ans;
    }
}
