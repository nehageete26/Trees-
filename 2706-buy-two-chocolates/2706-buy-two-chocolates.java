class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int remain = 0;
            if(prices[0]+prices[1] == money) remain = 0;
            else if (prices[0]+prices[1] < money) remain = money - (prices[0]+prices[1]);
            else remain =  money;
        return remain;
    }
}