package week02;

import java.util.Scanner;

public class W171 {
  public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int passNum = sc.nextInt();

        for (int j = 2; j<= 9; j++) {
          System.out.println(passNum + "곱하기" + j+ "는" + (passNum * j) + "입니다.");
        }
      }
    }


