package com.company;

import java.util.Scanner;

public class Hire {
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            for(int i=0;i<t;i++){
                int n= sc.nextInt();
                int m= sc.nextInt();
                int x= sc.nextInt();;
                int y= sc.nextInt();
                for(int j=1;j<=n;j++){
                    char[] s=sc.next().toCharArray();
                    int k=0;
                    int full=0,partial=0;
                    while(k<m){
                        if(s[k]=='F')
                            full++;
                        else if(s[k]=='P')
                            partial++;
                        k++;
                    }
                    if(full==x || (full==x-1 && partial==y))
                        System.out.print(1);
                    else
                        System.out.print(0);
                }
                System.out.println("");
            }
        }
        catch(Exception e){
            return;
        }
    }
}
