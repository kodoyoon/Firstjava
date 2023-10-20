package SoloProject;

import java.util.Scanner;

public class Menu {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int choice;

    System.out.println("SHAKESHACK BURGER 에 오신걸 환영합니다.");
    System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.");

    System.out.println("[ Burgers MENU ]");
    System.out.println("1. ShackBurger|   W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
    System.out.println("2. SmokeShack | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
    System.out.println("3. Shroom Burgber | W 9.4  | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거");
    System.out.println("4. Cheeseburger |    W 6.9  | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
    System.out.println("5. Hamburger  |   W 5.4   | 비프패티를 기반으로 야채가 들어간 기본버거");

    System.out.print("메뉴를 선택해주세요: ");
    choice = scanner.nextInt();

    if (choice == 1) {
      System.out.println("ShackBurger를 선택하셨습니다.");

    } else if (choice == 2) {
      System.out.println("SmokeShack을 선택하셨습니다.");

    } else if (choice == 3) {
      System.out.println("Shroom Burger를 선택하셨습니다.");

    } else if (choice == 4) {
      System.out.println("Cheeseburger를 선택하셨습니다.");

    } else if (choice == 5) {
      System.out.println("Hamburger를 선택하셨습니다.");

    }
  }
}


