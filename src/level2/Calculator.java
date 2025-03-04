package level2;

public class Calculator {


    int calculate (int currentNum, int calNum, String operator) {
        switch (operator) {
            case "+":
                return currentNum + calNum;
            case "-":
                return currentNum - calNum;
            case "x":
                return currentNum * calNum;
            case "/":
                if (calNum == 0) {
                    System.out.println("==0으로 나누기는 할 수 없습니다==");
                    return currentNum;
                }
            default:
                System.out.println();
                return currentNum;

        }
    }
}
