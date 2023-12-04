package com.epam.rd.autotasks;

public class FunctionsTask3 {
    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     * if set invalid arguments in method, then method must throws
     * IllegalArgumentException
     */
    public static int multiArithmeticElements(int a1, int t, int n) {
        int result;
        if (n==0){
            throw new IllegalArgumentException("n must be greater than 0");
        }
        else if (n<0){
            throw new IllegalArgumentException("n must be greater than 0");
        }
        else if(n>1){
            result=a1 * multiArithmeticElements(a1+t, t, n-1);
        }
        else{
            result=a1;
        }
        return result;
    }
}
