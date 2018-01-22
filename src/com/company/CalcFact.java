package com.company;

/**
 * Created by je565 on 1/22/18.
 */

public class CalcFact {

    static int factorialCalculator(int x)
    {
        if(x == 1)
        {
            return 1;
        }
        else
        {
            return x * factorialCalculator(x - 1);
        }
    }
}
