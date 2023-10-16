package week02;

public class W06 {
  public static void main(String[] args) {

    int a = 10;
    int b = 10;
    int val = ++a + b--;
    System.out.println(a);
    System.out.println(b);
    System.out.println(val);//11+9 = 20
    //++가 앞에 있으면 a 에 1을 더하고
    //연산이 실행이 되는거임
// 그 다음에 val 로 대임
// 만약에 20 이 나오게 하려면
    // int val = ++a  + --b;






  }
}
