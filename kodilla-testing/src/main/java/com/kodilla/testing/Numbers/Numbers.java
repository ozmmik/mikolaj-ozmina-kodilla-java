package com.kodilla.testing.Numbers;

import java.util.List;

public class Numbers {
    public int numberCheck(List<Integer> digits) {
        for (int n = 0; n < digits.size(); n++) {
            int i = n;
            int digitGet = digits.get(i);
            int digitGetNext = digits.get(++i);
            int digitsSum =+ digitGet;

            if (digitGet > digitGetNext)
                return digitsSum + digitGetNext - digitsSum;
        }
        return 0;
    }
}