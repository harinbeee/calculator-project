package level2;

public class Main {
    public static void main(String[] args) {


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

            // 누적계산 - result를 재할당
            currentNum = result;

            // 계산기 종료 or 계속 연산하기 or 초기화하기
            System.out.print("🔹최근 연산 삭제 : ce  초기화 : ac  종료 : exit🔹\n\n     계속하려면 \n");
        }
    }
}
