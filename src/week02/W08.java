package week02;

public class W08 {
  public static void main(String[] args) {

    //연산자의 우선순위 산술 > 비교 > 논리 )&&> 대입

    int x = 2;
    int y = 9;
    int z = 10;

    boolean result = x < y && y < z ;
    System.out.println(result);
    System.out.println("_____");

    result = x + 10 < y && y < z;//false && ~~~~ 하나가 false 기에 무조건  faalse
    System.out.println(result);
    System.out.println("_____");

    result = x + 2*3 > y;
    System.out.println(result);
    System.out.println("_____");

    result = (x + 2)  * 3 > y; //true
    System.out.println(result);


    System.out.println("_____");












  }
}
