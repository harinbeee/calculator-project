package level2;

import java.util.Scanner;

public class InputCal {
     // 콘솔에서 입력 받기

     private Scanner scanner = new Scanner(System.in);
     Calculator calculator = new Calculator();// 캡슐화하기

     // 숫자
     public int number() {
          System.out.println("숫자를 입력하세요.");
          return scanner.nextInt();
     }

     // 연산기호
     public String operator() { // 잘못 입력시 반복, 맞게 입력하면 -> main으로
          while (true) {
               System.out.println("사칙연산 기호를 입력하세요");
               String operator = scanner.next();

               if(operator.equals("+") || operator.equals("-") || operator.equals("x") || operator.equals("/")) {
                    return operator;
               } if(operator.equals("exit")) {
                    System.out.println("==계산을 종료합니다==");
                    System.exit(0);
               } if(operator.equals("ac")) {
                    calculator.allClear();
               } else {
                    System.out.print("잘못된 연산기호입니다. \n다시 ");
               }
          }
     }
}

