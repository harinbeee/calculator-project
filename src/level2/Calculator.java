package level2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    // 1. 속성
    private List<String> calRecord = new ArrayList<>(); // 연산 내역 저장 (숫자 + 연산기호)
    private boolean firstCal = true; // 첫 연산 여부를 가려준다

    // 2. 생성자
    public Calculator() {
        this.calRecord = new ArrayList<>();
        this.firstCal = true;
    }

    // 3. 기능
    // 사칙연산 메서드
    public int calculate(int currentNum, int calNum, String operator) {
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
                    System.out.print("\n  ❌ 0으로 나눌 수 없습니다. ");
                    return currentNum; // 예외처리 - 처음값 반환
                } else {
                    result = currentNum / calNum;
                }
                break;
            default:
                return currentNum; // 예외처리 - 연산기호 잘못입력시 처음값 반환
        }

        // 연산 마친 후 현재까지 계산 히스토리 보여주기
        if (firstCal) { // 첫연산
            calRecord.add(String.valueOf(currentNum));
            calRecord.add(operator);
            calRecord.add(String.valueOf(calNum));
            firstCal = false;
        } else { // n번째 연산
            calRecord.add(operator);
            calRecord.add(String.valueOf(calNum));
        }

        System.out.println("\n----------------------------------------");
        System.out.println("  📜 현재 수식 : " + calRecord());
        return result;
    }

    // 첫 연산 여부 확인 메서드
    public boolean firstCal() {
        return firstCal;
    }

    // 연산기록 형변환 메서드
    public String calRecord() {
        return String.join(" ", calRecord);
    }

    // 최근 연산 삭제 메서드
    public void clearEntry() {
        if (calRecord.size() < 3) { // 최소 3개(숫자, 연산자, 숫자) 없으면 삭제 불가
            System.out.println("\n  ✔️ 삭제할 연산이 없습니다.");
            return;
        }

        calRecord.remove(calRecord.size() - 1); // 마지막 숫자 삭제
        calRecord.remove(calRecord.size() - 1); // 마지막 연산자 삭제

        System.out.println("\n  ✔️ 최근 연산이 삭제되었습니다.");
    }

    // 계산 히스토리 초기화 메서드
    public void recordClear() {
        calRecord.clear(); // 전체 기록 (list) 비우기
        firstCal = true; // 초기화시 첫연산은 true로.. 당연한,,
    }
}
