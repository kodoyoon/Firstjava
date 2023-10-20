import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int choice;

    System.out.println("SHAKESHACK BURGER 에 오신걸 환영합니다.");

    while (true) {
      System.out.println("[ SHAKESHACK MENU ]");
      System.out.println("1. Burgers         | 앵거스 비프 통살을 다져만든 버거");
      System.out.println("2. Forzen Custard  | 매장에서 신선하게 만드는 아이스크림");
      System.out.println("3. Drinks          | 매장에서 직접 만드는 음료");
      System.out.println("4. Beer            | 뉴욕 브루클린 브루어리에서 양조한 맥주");
      System.out.println("5. Order           | 장바구니를 확인 후 주문합니다.");
      System.out.println("6. Cancel          | 진행중인 주문을 취소합니다.");

      System.out.print("메뉴를 선택해주세요: ");
      choice = scanner.nextInt();

      switch (choice) {
        case 1:
          System.out.println("Burgers를 선택하셨습니다.");
          // 여기에 버거 주문 로직을 추가하세요.
          break;
        case 2:
          System.out.println("Forzen Custard를 선택하셨습니다.");
          // 여기에 아이스크림 주문 로직을 추가하세요.
          break;
        case 3:
          System.out.println("Drinks를 선택하셨습니다.");
          // 여기에 음료 주문 로직을 추가하세요.
          break;
        case 4:
          System.out.println("Beer를 선택하셨습니다.");
          // 여기에 맥주 주문 로직을 추가하세요.
          break;
        case 5:
          System.out.println("Order를 선택하셨습니다.");
          // 여기에 주문 확인 및 완료 로직을 추가하세요.
          break;
        case 6:
          System.out.println("Cancel를 선택하셨습니다.");
          // 여기에 주문 취소 로직을 추가하세요.
          break;
        default:
          System.out.println("올바른 메뉴를 선택해주세요.");
      }
    }
  }
}
