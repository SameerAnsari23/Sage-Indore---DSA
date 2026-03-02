class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totlGas = 0, totlCost = 0;

        for (int i = 0; i < cost.length; i++) {
            totlGas += gas[i];
            totlCost += cost[i];
        }

        if (totlCost > totlGas) {
            return -1;
        }

        int curGas = 0, strtIdx = 0;
        for (int i = 0; i < gas.length; i++) {
            curGas = curGas + (gas[i] - cost[i]);

            if (curGas < 0) {
                strtIdx = i + 1;
                curGas = 0;
            }
        }

        return strtIdx;
    }
}
