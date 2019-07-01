package com.stackroute.javape2;


public class Studentgrades {
    public int calculateGrades(int number[]) {
//        number.toString().split(",");
        int sum = 0;
        for (int i = 0; i <= number.length; i++) {
            sum += number[i];
        }
        return sum/number.length;
    }

//        public double average( int number[],int sum)
//        {
//            return sum / number.length;
//
//        }

        public int maximum(int number[])
        {
            int large=number[0];
           for(int i=0;i<=number.length;i++)
           {
               if(number[i]>large)
               {
                   large=number[i];
               }

           }
           return large;
        }
    public int minimum(int number[])
    {
        int small=number[0];
        for(int i=0;i<=number.length;i++)
        {
            if(number[i]<small)
            {
                small=number[i];
            }
        }
        return small;
    }
}
