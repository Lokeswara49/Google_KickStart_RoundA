package com.company;

import java.util.Scanner;
import java.lang.Math;

public class goddnessString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s1=sc.nextLine();
            String s= sc.nextLine();
            int j=0;
            int x= (int) Math.pow(-215,2);
            int goodnessCount=0;
            while(j<s.length()/2){
                if(s.charAt(j)!=s.charAt(s.length()-j-1))
                    goodnessCount++;
                j++;
            }
            int minOperations=Math.abs(k-goodnessCount);
            System.out.println("Case #"+i+": "+minOperations);
        }
    }
}
