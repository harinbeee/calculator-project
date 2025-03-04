package level2;

import java.util.Scanner;

public class InputCal {
     private Scanner scanner = new Scanner(System.in);

     public int getNumber() {
          System.out.println("숫자를 입력하세요.");
          return scanner.nextInt();
     }

     public String getOperator() {
          while (true) {
               System.out.println("연산기호를 입력하세요 ( + , - , x , / )");
               String operator = scanner.next();

               if (operator.equals("+") || operator.equals("-") || operator.equals("x") || operator.equals("/")) {
                    return operator;
               } else {
                    System.out.println("== 잘못된 연산기호입니다. 다시 입력하세요. ==");
               }
          }
     }
}

