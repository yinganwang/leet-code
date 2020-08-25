class Solution {
    public int heightChecker(int[] heights) {
        HashMap<Integer, Integer> heightFreqMap = new HashMap<Integer, Integer>();
        for (int h : heights) {
            int count = heightFreqMap.containsKey(h) ? heightFreqMap.get(h) : 0;
            heightFreqMap.put(h, ++count);
        }

        int result = 0, currHeight = 0;
        for (int i = 0; i < heights.length; i++) {
            while (!heightFreqMap.containsKey(currHeight) || heightFreqMap.get(currHeight) == 0) currHeight++;
            if (currHeight != heights[i]) result++;
            int count = heightFreqMap.containsKey(currHeight) ? heightFreqMap.get(currHeight) : 0;
            if (--count == 0) heightFreqMap.remove(currHeight);
            else heightFreqMap.put(currHeight, count);
        }
        return result;
    }
}
