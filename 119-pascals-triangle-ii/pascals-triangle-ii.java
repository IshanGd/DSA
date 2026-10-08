import java.util.*;
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        for (int col = 0; col <= rowIndex; col++) {
            row.add(0);
        }
        row.set(0, 1);
        for (int level = 1; level <= rowIndex; level++) {
            for (int col = level; col >= 1; col--) {
                row.set(col, row.get(col) + row.get(col - 1));
            }
        }
        return row;
    }
}