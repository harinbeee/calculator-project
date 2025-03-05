package level2;

public class Calculator {

    // 사칙연산 메서드
    int calculate (int currentNum, int calNum, String operator) {
        switch (operator) {
            case "+":
                return currentNum + calNum;
            case "-":
                return currentNum - calNum;
            case "x":
                return currentNum * calNum;
            case "/":
                if (calNum == 0) { // calNum(두번째 숫자)가 0인 경우, 예외처리
                    System.out.print("0으로 나눌 수 없습니다. \n다시 ");
                    return currentNum;
                } else {
                return currentNum / calNum;
                }
        } return currentNum;
    }
}
