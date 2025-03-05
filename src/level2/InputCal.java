package level2;

import java.util.Scanner;

public class InputCal {
     private Scanner scanner = new Scanner(System.in);
     private Manager manager; // Manager를 통해 Calculator 관리

     public InputCal(Calculator calculator) {
          this.manager = new Manager(calculator);
     }

     public int number() {
          System.out.print("     숫자를 입력하세요 → ");
          return scanner.nextInt();
     }

     public String operator() {
          while (true) {
               System.out.print("     연산기호를 입력하세요  → ");
               String operator = scanner.next();

               if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
                    return operator;
               }

               if (operator.equals("ce")) { // 최근 연산 삭제 (Manager 통해 호출)
                    manager.clearEntry();
                    return "clear";
               }

               if (operator.equals("ac")) { // 초기화 단어
                    manager.allClear();
                    return "allclear";
               }

               if (operator.equals("exit")) { // 종료 단어
                    manager.exitCal();
               }

               System.out.println("  ❌ 잘못된 연산 기호입니다 ! \n");
          }
     }
}
