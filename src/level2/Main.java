package level2;

public class Main {
    public static void main(String[] args) {

//      피드백 - 계산 히스토리 볼 수 있게 => 걍 계속 떠있게 만듬
//        이랬더니 곱셈 나눗셈은 보기가 힘들다.. 괄호를 어케 추가하지
//      종료하지 않고 기존 연산결과를 삭제 후 다시 계산 시작하기

        InputCal inputCal = new InputCal();
        Calculator calculator = new Calculator();


        // 1. 첫번째 숫자 받아오기
        int currentNum = inputCal.number();

        // 2. 연산 반복 시작 ( 연산기호, 두번째 숫자, 종료 여부 )
        while(true){
            String operator = inputCal.operator();


            int calNum = inputCal.number();


            // 그 다음에 연산을 하세용
            int result = calculator.calculate(currentNum, calNum, operator);
            System.out.println( " = " + result );
            currentNum = result;

            // 계산기 종료 or 계속 연산하기 or 초기화하기
            System.out.print("\n종료하려면 exit, 초기화하려면 ac, 계속 계산하려면 ");


        }
    }
}
