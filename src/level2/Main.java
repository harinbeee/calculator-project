package level2;

public class Main {
    public static void main(String[] args) {
//  <피드백>
//  1차 - 계산 히스토리 볼 수 있게 => 걍 계속 떠있게 만듬
//       ( 이랬더니 곱셈 나눗셈은 보기가 힘들다.. 괄호를 어케 추가하지? ) 하지말자!^^
//       종료하지 않고 기존 연산결과를 삭제 후 다시 계산 시작하기
//  2차 - allclear,exit 따로 메서드 만들기 / 완료
//        main 에 ~반복문 추가~ 해서 allclear가 돌아갈 지점 만들어주기 / 기존처럼 반복분 하나만 씀
//        calculator에 string append 부분 하나로 합치기
//        (만약 1개이상의 숫자가 있다면 두번째 반복문부터 시작/ 숫자 없다면 처음부터)
//        연산결과마다 list에 저장하기 no,,,,,,,,,

        Calculator calculator = new Calculator();
        InputCal inputCal = new InputCal(calculator);

        int currentNum = 0; // 첫 연산 초기값 0으로

        System.out.println("========================================");
        System.out.println("           📝 사칙연산 계산기 📝            ");
        System.out.println("========================================\n");

        while (true) {
            // 첫번째 숫자 받기 (첫 연산이 맞다면 !)
            if (calculator.firstCal()) {
                currentNum = inputCal.number();
            }

            // 연산기호 받을때 allclear가 넘어오면 반복 스킵
            String operator = inputCal.operator();

            //  최근 연산 삭제
            if (operator.equals("clear")) {
                System.out.println("  📜 현재 수식  :  " + calculator.calRecord());
                System.out.println("----------------------------------------\n");
                continue;
            }

            //  초기화
            if (operator.equals("allclear")) {
                currentNum = 0; // 다시 currentNum 0으로 재할당
                continue;
            }

            // 두번째 숫자 받기
            int calNum = inputCal.number();

            // 연산 후 출력
            int result = calculator.calculate(currentNum, calNum, operator);
            System.out.println("  ✅ 현재 값  =  " + result );
            System.out.println("----------------------------------------");

            // 누적해서 계산할거니까 result를 currentNum으로!
            currentNum = result;

            // 계산기 종료 or 계속 연산하기 or 초기화하기
            System.out.print("🔹최근 연산 삭제 : ce  초기화 : ac  종료 : exit🔹\n\n     계속하려면 \n");
        }
    }
}
