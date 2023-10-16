package week02;

public class W04 {

  public static void main(String[] args) {

    boolean flag1 = true;
    boolean flag2 = true;
    boolean flag3 = false;

    System.out.println(flag1);
    System.out.println(flag2);
    System.out.println(flag3);

    //피 연산자 중 하나라도 true 이면 treu => 또는(or :||)
    System.out.println("_______");
    System.out.println(flag1 || flag2);
    System.out.println(flag1 || flag2 ||flag3);

    //피 연산자 중 모두 true 이면 true => 그리고 (and :&&)
    System.out.println("_______");
    System.out.println(flag1 && flag2);
    System.out.println(flag1 && flag2 && flag3);

    System.out.println("_______");
    System.out.println((5 > 3) && (3 >1));
    System.out.println((5 > 3) && (3 <1));



   //or 둘중에 하나라도 true 면 true 가 나옴
    System.out.println("_______");
    System.out.println((5 > 3) || (3 >1)); //true || true -> true
    System.out.println((5 > 3) || (3 <1));//true || false -> true
    System.out.println((5 < 3) || (3 <1)); //false || false -> false

    //System.out.println( 1 < 3 < 5); // 불가능

    //논리 부정 연산자(!: NOT)
    System.out.println("_______");
    System.out.println(!flag1);
    System.out.println(!flag3);
    System.out.println(!(5==5)); //먼저 감싸야 돼
    System.out.println(!(5==3));










  }
}
