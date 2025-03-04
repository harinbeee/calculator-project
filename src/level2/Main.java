package level2;

public class Main {
    public static void main(String[] args) {

        InputCal inputCal = new InputCal();
        Calculator calculator = new Calculator();

        int currentNum = inputCal.getNumber();
        String operator = inputCal.getOperator();

        while(true){

            int calNum = inputCal.getNumber();

            currentNum = calculator.calculate(currentNum, calNum, operator);

            System.out.println("현재값 = " + currentNum);

            System.out.println("== 종료하려면 exit , 계속 계산하려면 연산기호를 입력하세요 ==");


            if(operator.equals("exit")) {
                System.out.println("==계산을 종료합니다==");
                break;
            }

        }
    }
}
