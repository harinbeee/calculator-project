package level2;

public class Calculator {

    // StringBuilder 는 문자열 이어붙일수 있는 메서드
    StringBuilder calRecord = new StringBuilder();
    // 첫연산이세요 아니세요??
    boolean firstCal = true;

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
            case "*":
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
                return currentNum; // 예외처리 - 연산기호 잘못입력시 처음값 반환
        }

        // 현재까지 계산 히스토리 보여주기
        // 첫연산
        if(firstCal){
            calRecord.append(" ").append(currentNum).append(" ").append(operator).append(" ").append(calNum);
            firstCal = false; // 첫연산이 종료되었으니 false로 바꾸깅
        // n번째 연산
        } else {
            calRecord.append(" ").append(operator).append(" ").append(calNum);
        }
        System.out.println("\n" + calRecord());
        return result;
    }

    // 첫 연산 여부 확인 메서드
    public boolean firstCal() {
        return firstCal;
    }

    // 연산기록 형변환 메서드
    public String calRecord(){
        return calRecord.toString(); //형변환이 필요하다!
    }

    // 계산 히스토리 초기화 메서드
    public void recordClear() {
        calRecord.setLength(0);
        firstCal = true; // 초기화시 첫연산은 true로.. 당연한,,
    }
}

