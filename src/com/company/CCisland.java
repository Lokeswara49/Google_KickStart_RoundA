package com.company;

import java.util.Scanner;

public class CCisland {
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            for(int i=0;i<t;i++) {
                int x=sc.nextInt();
                int y=sc.nextInt();
                int xr= sc.nextInt();
                int yr= sc.nextInt();
                int d=sc.nextInt();
                if((x/d)>=xr && (y/d)>=yr)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
        catch(Exception e){
            return;
        }
    }
}
