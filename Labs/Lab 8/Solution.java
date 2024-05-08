public class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] array = new int[amount + 1];
        array[0] = 0;
        for (int i = 1; i <= amount; i++)
        {
            array[i] = amount + 1;
        }

        for (int i = 0; i < coins.length; i++)
        {
            int coin = coins[i];
            for (int j = coin; j <= amount; j++)
            {
                array[j] = Math.min(array[j], array[j - coin] + 1);
            }
        }

        if (array[amount] > amount)
        {
            return -1;
        }
        else
        {
            return array[amount];
        }
    }

}
