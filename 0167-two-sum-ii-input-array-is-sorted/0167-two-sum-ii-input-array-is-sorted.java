class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int need;
        int[] blank={-1,-1};
        for(int i=0;i<numbers.length;i++){
            need=target-numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[j]==need)
                    return new int[] {i+1,j+1};
            }
        }
        return blank;
    }
}