// Definition for a pair
// class Pair {
//     int key;
//     String value;
//
//     Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
public class Solution {
    public List<List<Pair>> insertionSort(List<Pair> pairs) {
        if (pairs.isEmpty())
            return new ArrayList<>();

        List<List<Pair>> result = new ArrayList<>();
        result.add(copy(pairs));

        for (int i = 1; i < pairs.size(); ++i) {
            int j = i-1;
            while (j >=0 && pairs.get(j).key > pairs.get(j+1).key) {
                Pair temp = pairs.get(j);
                pairs.set(j, pairs.get(j+1));
                pairs.set(j+1, temp);
                --j;
            }
            result.add(copy(pairs));
        }

        return result;
    }

    private List<Pair> copy(List<Pair> pairs) {
        List<Pair> result = new ArrayList<>(pairs.size());
        for (Pair pair : pairs)
            result.add(pair);

        return result;
    }
}
