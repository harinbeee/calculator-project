package level2;

public class Manager {
    private Calculator calculator;

    public Manager(Calculator calculator) {
        this.calculator = calculator; // calculator를 관리
    }

    //  최근 연산 삭제 기능
    public void clearEntry() {
        calculator.clearEntry();
    }

    // 계산기 초기화
    public void allClear() {
        System.out.println("\n  ✔️ 계산기가 초기화 되었습니다. ");
        System.out.println("========================================");
        calculator.recordClear();
    }

    //  계산기 종료
    public void exitCal() {
        System.out.println("\n  ✔️ 계산기를 종료합니다. ");
        System.out.println("========================================");
        System.exit(0); // -> 콘솔을 강제 종료하는 메서드
    }
}
