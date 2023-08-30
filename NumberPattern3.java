// n=4
// output: 1
//         1 1
//         1 2 1
//         1 2 2 1


import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main"
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int r=1; r<=n; r++) {
          for(int c=1; c<=r; c++) {
            if(c==1 || c==r) {
              System.out.print(1);
            }
            else {
              System.out.print(2);
            }
          }
          System.out.println();
        }
    }
}



