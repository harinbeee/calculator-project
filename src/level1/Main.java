package level1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        [ 구상하기 ]
//         (1) 첫번째 숫자 받기
//         (2) 연산기호 받기
//             - 반복문 : 연산기호 외의 값들 거르기, 거르고 다시 입력
//         (3) 두번째 숫자 받고 연산하기
//             - 반복문 사용, 사칙연산은 switch 사용하기
//         (4) 현재 결과 값 보여주고 계속 연산할지 물어보기 - 연산기호 입력시 로 돌아감 / exit 입력시 반복 종료
//            - 3번 반복문 안에서!! 해야함 초기값 입력 후 연산이 누적해서 한 사이클로 돌아감
//
//        [ 피드백 ]
//        - firstNum이 초기값, 현재 결과값을 의미하기도 하는데 변수이름을 가독성 좋게 바꾸면 좋겠다
//          => firstNum 은 currentNum으로, secondNum은 calNum으로!!


        // 1. 첫번째 숫자 입력
        System.out.println("숫자를 입력하세요.");
        int currentNum = scanner.nextInt();
        scanner.nextLine();

        // 2. 연산기호 입력
        String operator; // 연산기호는 1번째 while, 2번째 while 전부 사용함
        while (true) {
            System.out.println("연산기호를 입력하세요 ( + , - , x , / )");
            operator = scanner.nextLine();

            // 연산자를 잘못 입력했을 때 처음으로 이동 / + 곱셈을 대문자로 입력하면?
            if (!operator.equals("+") && !operator.equals("-") && !operator.equals("x") && !operator.equals("/")) {
                System.out.println("== 연산기호를 다시 입력하세요 ==");
                continue;
            } break;
        }

        // 3. 두번째 숫자 받고 연산시작
        while (true) {

            System.out.println("다음 숫자를 입력하세요.");
            int calNum = scanner.nextInt();
            scanner.nextLine();

            //계산하기
            switch (operator) {
                case "+":
                    currentNum = currentNum + calNum;
                    break;
                case "-":
                    currentNum = currentNum - calNum;
                    break;
                case "x":
                    currentNum = currentNum * calNum;
                    break;
                case "/":
                    if (calNum == 0) {
                        System.out.println("==0으로 나누기는 할 수 없습니다==");
                        continue;
                    } else {
                        currentNum = currentNum / calNum;
                    }
                    break;
            }

            // 4. 종료 or 계속 연산할지 입력
            System.out.println("현재값 = " + currentNum);

            while (true) {
                System.out.println("== 종료하려면 exit , 계속 계산하려면 연산기호를 누르세요 ==");
                String answer = scanner.nextLine();

                if (answer.equals("exit")) {
                    return;
                } else if (answer.equals("+") || answer.equals("-") || answer.equals("x") || answer.equals("/")) {
                    operator = answer;
                    break;
                } else {
                    System.out.println("==잘못된 연산기호입니다. 다시 입력하세요.==");
                }

            }
        }

    }
}