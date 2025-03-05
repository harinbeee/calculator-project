package level2;

public class Main {
    public static void main(String[] args) {

        InputCal inputCal = new InputCal();
        Calculator calculator = new Calculator();

        // 1. 첫번째 숫자 받아오기
        int currentNum = inputCal.number();

        // 2. 연산 반복 시작 ( 연산기호, 두번째 숫자, 종료 여부 )
        while(true){
            String operator = inputCal.operator();
            int calNum = inputCal.number();

            // 현재 연산식 보여주기~!~!~!~!
            System.out.printf("\n******* %d %s %d ", currentNum, operator, calNum);

            // 그 다음에 연산을 하세용
            currentNum = calculator.calculate(currentNum, calNum, operator);
            System.out.printf(" = %d ******* \n " , currentNum );

            // 종료 여부
            System.out.print("\n종료하려면 exit,\n계속 계산하려면 ");

            if(operator.equals("exit")) {
                System.out.println("==계산을 종료합니다==");
                break;
            }

        }
    }
}
