import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<int[]> filteredData = new ArrayList<>();
        for (int[] item : data) {
            if (ext.equals("code") && item[0] < val_ext) {
                filteredData.add(item);
            } else if (ext.equals("date") && item[1] < val_ext) {
                filteredData.add(item);
            } else if (ext.equals("maximum") && item[2] < val_ext) {
                filteredData.add(item);
            } else if (ext.equals("remain") && item[3] < val_ext) {
                filteredData.add(item);
            }
        }

        filteredData.sort(Comparator.comparingInt(item -> item[Arrays.asList("code", "date", "maximum", "remain").indexOf(sort_by)]));

        int[][] answer = new int[filteredData.size()][];
        for (int i = 0; i < filteredData.size(); i++) {
            answer[i] = filteredData.get(i);
        }
        return answer;
    }
}
