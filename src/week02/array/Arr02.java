package week02.array;

import java.util.Arrays;
import java.util.concurrent.ThreadFactory;

public class Arr02 {
  public static void main(String[] args) {
    //초기화


    //1. 배열에 특정값 대입해서 선언
    int[] intArr = {10,20,30,40,50};
    String[] stringArray = {"a", "b", "c", "d"};

    //2. for 문을 통해서 대입
    for(int i=0; i<intArr.length; i++) {
      intArr[i] = i;
    }
    System.out.println("---");
    //다건출력
   // for(int i =0; i<intArr.length; i++){
     // System.out.println(intArr[i]);
    //}

    for(int i: intArr) {
      System.out.println(i);
    }
    //배열의 주소를 모두 같은 값으로 초기화

  }
}
