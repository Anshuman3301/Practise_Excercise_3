package com.stackroute.pe3;

public class ReducedSubtractFrac
{
    public int rsf(int number)
    {

        String res="";
        String num=Integer.toString(number);
        if(num.length()==1)
        {
            return number;
        }
        for(int i=0;i<num.length()-1;i++)
        {
            res+=Integer.toString(Math.abs(Integer.parseInt(Character.toString(num.charAt(i)))-Integer.parseInt(Character.toString(num.charAt(i+1)))));
        }

        return Integer.parseInt(res);
    }

    public static void main(String[] args)
    {
        ReducedSubtractFrac ob=new ReducedSubtractFrac();
        int num=987652;
        System.out.println(ob.rsf(num));

        int x=15;
        if(x>=21)
        {
            System.out.println("error");
        }

        Long product=1L;
        for(Long i=1L;i<=x;i++)
        {
            product=product*i;
        }
        System.out.println(product);
    }
}
