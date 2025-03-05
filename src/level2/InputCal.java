package level2;

import java.util.Scanner;

public class InputCal {
     // 필요한 객체들 생성 + 연결
     private Scanner scanner = new Scanner(System.in);
     private Manager manager;// 캡슐화하기
     public InputCal (Calculator calculator) {
          this.manager = new Manager(calculator); // 여기서 manager로 넘겨줘야함
     }

     // 숫자 입력
     public int number() {
          System.out.println("숫자를 입력하세요.");
          return scanner.nextInt();
     }

     // 연산기호 입력 (+ exit, ac )
     public String operator() { // 잘못 입력시 반복, 맞게 입력하면 -> main으로
          while (true) {
               System.out.println("사칙연산 기호를 입력하세요");
               String operator = scanner.next();

               if(operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
                    return operator;

               } if(operator.equals("ac")) {
                    manager.allClear();
                    return "allclear"; // 반복 스킵할 수 있게 메인에 넘겨주기

               }if(operator.equals("exit")) {
                    manager.exitCal();

               }else {
                    System.out.print("잘못된 연산기호입니다. \n다시 ");
               }
          }
     }
}

