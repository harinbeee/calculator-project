package level2;

public class Main {
    public static void main(String[] args) {
//  피드백
//  1차 - 계산 히스토리 볼 수 있게 => 걍 계속 떠있게 만듬
//       ( 이랬더니 곱셈 나눗셈은 보기가 힘들다.. 괄호를 어케 추가하지? ) 하지말자!
//       종료하지 않고 기존 연산결과를 삭제 후 다시 계산 시작하기
//  2차 - allclear,exit 따로 메서드 만들기 / 완료
//        main 에 반복문 추가 해서 allclear가 돌아갈 지점 만들어주기 완료 / 완료
//        calculator에 string append 부분 하나로 합치기
//        (만약 1개이상의 숫자가 있다면 두번째 반복문부터 시작/ 숫자 없다면 처음부터)
//        연산결과마다 list에 저장하기

        // 객체 생성

        Calculator calculator = new Calculator();
        InputCal inputCal = new InputCal(calculator); //<-생성시 전달

        // 1. 첫번째 숫자 받아오기
        while(true) {
            int currentNum = inputCal.number();

            // 2. 연산 반복 시작 ( 연산기호, 두번째 숫자, 종료 여부 )
            while (true) {
                String operator = inputCal.operator();
                if(operator.equals("allclear")) {
                    break;
                }

                int calNum = inputCal.number();


                // 그 다음에 연산을 하세용
                int result = calculator.calculate(currentNum, calNum, operator);
                System.out.println(" = " + result);
                currentNum = result;

                // 계산기 종료 or 계속 연산하기 or 초기화하기
                System.out.print("\n종료하려면 exit, 초기화하려면 ac, 계속 계산하려면 ");


            }
        }
    }
}
