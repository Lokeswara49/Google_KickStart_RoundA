//package com.company;
//
//import java.util.Scanner;
//
//public class Ipl {
//    public static void main(String[] args) {
//        try{
//            Scanner sc=new Scanner(System.in);
//            int n= sc.nextInt();
//            int[] arr=new int[n];
//            for(int i=0;i<n;i++)
//                arr[i]=sc.nextInt();
//            int[] a=new int[2];
//            int max=0;
//            int i=0;
//            int[] check=new int[3];
//            int count=0;
//            while (i+3<=n){
//                a=max(arr,i,i+3);
//                i=a[1];
//                check[(count++)%3]=i;
//                if(count%3==0  && check[0]+1==check[1] && check[1]+1==check[2]){
//                        i++;
//                        continue;
//                }
//                else{
//                    max+=a[0];
//                    i++;
//                }
//            }
//            if(a[1]==n-3 && (check[0]==n-4 || check[1]==n-4 || check[2]==n-4)){
//                max+=arr[n-1];
//            }
//            else{
//
//            }
//        }
//    }
//    static int[] max(int[] arr,int x,int y){
//        int[] ans=new int[2];
//        int max=0,index=0;
//        for(int i=x;i<y;i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//                index = i;
//            }
//        }
//        ans[1]=index;
//        ans[0]=max;
//        return ans;
//    }
//}
