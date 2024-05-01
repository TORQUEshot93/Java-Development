package Linear_Search_Algo;

//Q.MaxWealth of the person having certain number of bank accounts
public class MaxWealthinLinearSearch {
    public static void main(String[] args){
           int[][] accounts = {
                   {1,2,3},
                   {3,5,6,5},
                   {2,1,5,3}
           };
           int ans = MaxWealth(accounts);
           System.out.println(ans);
    }
    //
    static int MaxWealth(int[][] accounts){
        int ans = Integer.MIN_VALUE;
        // row = person
        // account = colmun
        for (int person = 0; person < accounts.length; person++) {
            int row_sum = 0;
            // when you start a new column , take a new sum for that row
            for (int account = 0; account < accounts[person].length; account++) {
                row_sum += accounts[person][account];
            }
            //now we have sum of accounts of person
            //check with overall ans
            if (row_sum > ans) {
                ans = row_sum;
            }
        }
        return  ans;
    }
}
