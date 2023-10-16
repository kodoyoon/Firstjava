package week02;

public class W12 {
  public static void main(String[] args) {


    boolean flag = true;
    int number = 2;

    if (flag) {
      System.out.println("flag 가 true 입니다.");
      if(number ==1) {
        System.out.println("flag 값은 true고 number 값은 1입니다.");
      }else if(number ==2){
        System.out.println("flag 값은 true고 number 값은 2입니다.");
      }else{
        System.out.println("flag 값은 true고 number 값은 모르겠입니다.");
      }
    }else{
      if(number ==1) {
        System.out.println("flag 값은 true고 number 값은 1입니다.");
      }else if(number ==2){
        System.out.println("flag 값은 true고 number 값은 2입니다.");
      }else{
        System.out.println("flag 값은 true고 number 값은 모르겠입니다.");
      }
    }
   }
}


