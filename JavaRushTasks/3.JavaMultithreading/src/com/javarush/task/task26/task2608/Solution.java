package com.javarush.task.task26.task2608;

/* 
Мудрый человек думает раз, прежде чем два раза сказать
*/
public class Solution {
    int var1;
    int var2;
    int var3;
    int var4;

    public Solution(int var1, int var2, int var3, int var4) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
        this.var4 = var4;
    }

    Solution solution1 = new Solution(1,2,3,4);
    Solution solution2 = new Solution(5,6,7,8);

    public int getSumOfVar1AndVar2 () {
        synchronized (solution1) {
            return var1 + var2;
        }
    }

    public int getSumOfVar3AndVar4() {
        synchronized (solution2) {
            return var3 + var4;
        }
    }

    public static void main(String[] args) {

    }
}
