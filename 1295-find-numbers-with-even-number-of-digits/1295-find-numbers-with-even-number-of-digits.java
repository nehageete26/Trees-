class Solution {
    int evencount(int num, int count){
        int integer = 0;
        while(num != 0){
            int lastdigit = num%10;
            count++;
            num /= 10;
        }
        if(count%2 == 0) integer++;
        return integer;
    }
    public int findNumbers(int[] nums) {
        int integer = 0;
        for(int i=0;i<nums.length;i++){
           int count = 0;
           integer += evencount(nums[i],count);
        }
        return integer;
    }
}