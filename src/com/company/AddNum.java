package com.company;
import java.util.Scanner;
public class AddNum {
    public static void main(String[] args) throws java.lang.Exception {
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                long ans = 0;
                long m = 0;
                if (n == 1)
                    System.out.println("20");
                else if (n == 2)
                    System.out.println("36");
                else if (n == 3)
                    System.out.println("51");
                if (n % 4 == 0) {
                    m = n / 4;
                    ans = (m - 1) * 44 + (60);
                    System.out.println(ans);
                } else {
                    m = n / 4;
                    ans = (m) * 44;
                    n = n % 4;
                    if (n == 1)
                        ans += 32;
                    else if (n == 2)
                        ans += 44;
                    else if (n == 3)
                        ans += 55;
                    else if (n == 0)
                        ans += 60;
                    System.out.println(ans);
                }
            }
        }
        catch(Exception e) {
            return;
        }
    }
}