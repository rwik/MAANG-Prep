// Input : n = 4
// Output: 
//     1   2  3 4 
//     12 13 14 5 
//     11 16 15 6 
//     10  9  8 7

package org.example;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    static void printSpiral(int inp){
        int[][] arr = new int[inp][inp];
        char move = 'r';
        int row = 0 , col =0;
        int flag =1;
        int bnd = inp-1;
        int sizeLeft = inp-1;


        for(int i= 1; i< inp *inp +1 ; i++){
            //Update value
            arr[row][col]=i;

            switch(move){
                case 'r':
                    col +=1;
                    break;
                case 'l':
                    col -=1;
                    break;
                case 'd':
                    row +=1;
                    break;
                case 'u':
                    row -=1;
                    break;
            }

            if(i==bnd){
                bnd += sizeLeft;
                if (flag != 2) {

                    flag = 2;
                }
                else {

                    flag = 1;
                    sizeLeft -= 1;
                }
                switch (move) {
                    case 'r':
                        move = 'd';
                        break;
                    case 'd':
                        move = 'l';
                        break;
                    case 'l':
                        move = 'u';
                        break;
                    case 'u':
                        move = 'r';
                        break;
                }

            }




        }
        //print Matrix
        for ( int[] innerArray : arr){
            for ( int d : innerArray){
                System.out.print(d+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int inp =0;
       System.out.println("Enter matrix size :");
       inp = sc.nextInt();
       printSpiral(inp);


    }
}