package SoloProject;

import java.util.Scanner;

public class Purchase {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Hamburger  |W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
    System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
    System.out.println("1. 확인     2. 취소");

  int choice = scanner.nextInt();

    System.out.println("Hamburger 가 장바구니에 추가되었습니다.");
    System.out.println("SHAKESHACK BURGER 에 오신걸 환영합니다.");
    System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");

    System.out.println("[SHAKESHACK MENU]");
    System.out.println("1.Burgers           | 앵거스 비프 통살을 다녀만든 버거");
    System.out.println("2.Forzen Custard    | 매장에서 신선하게 만드는 아이스크림");
    System.out.println("3.Drinks            | 매장에서 직접 만드는 음료");
    System.out.println("4.Beer              | 뉴욕 브루쿨린 브루어리에서 양조한 맥주");

    System.out.println("[ORDER MENU]");
    System.out.println("5.Order  | 장바구니를 확인 후 주문합니다.");
    System.out.println("6.Cancel | 진행중인 주문을 취소합니다.");


  }
}
