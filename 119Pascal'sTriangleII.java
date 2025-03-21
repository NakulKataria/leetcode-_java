/*Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.*/
class Solution {
    public List<Integer> getRow(int rowIndex) {
          List<Integer> row = new ArrayList<>(Collections.nCopies(rowIndex + 1, 0));
        row.set(0, 1); // First element is always 1

        for (int i = 1; i <= rowIndex; i++) {
            // Update the row from right to left
            for (int j = i; j > 0; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
        }
        return row;
    }
}