package level2;

public class Calculator {

    // StringBuilder는 문자열 이어붙일수 있는 메서드 -> 객체 생성
    StringBuilder calRecord = new StringBuilder();

    // 사칙연산 메서드
    int calculate(int currentNum, int calNum, String operator) {
        int result = currentNum;
        switch (operator) {
            case "+":
                result = currentNum + calNum;
                break;
            case "-":
                result = currentNum - calNum;
                break;
            case "x":
                result = currentNum * calNum;
                break;
            case "/":
                if (calNum == 0) { // calNum(두번째 숫자)가 0인 경우, 예외처리
                    System.out.print("0으로 나눌 수 없습니다. \n다시 ");
                    return currentNum; // 예외처리 - 처음값 반환
                } else {
                    result = currentNum / calNum;
                }
                break;
            default:
                return currentNum; // 예외처리 - 연산기호 아닐 때 처음값 반환
        }
        calRecord.append(operator).append(calNum);
        System.out.print(currentNum + calRecord());
        return result;
    }

    public String calRecord(){
        return calRecord.toString();
    }

    public void allClear() {
        calRecord.setLength(0);
    }




}







