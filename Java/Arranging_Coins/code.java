class Solution {
    public int arrangeCoins(int n) {
        int f = 0;
        int c = 1;
         for(int i = 1 ; i <= n ; i++){
            n = n - i;
            if(n > 0){
                f = n;
            }
             c = i;
         }
         return c;
    }
}
