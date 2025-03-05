package level2;

public class Manager {
    private Calculator calculator;

    public Manager(Calculator calculator) {
        this.calculator = calculator;
    }
//  계산기 초기화
    public void allClear() {
        System.out.println("========= 계산기 초기화 =========");
        calculator.recordClear();
    }

// 계산기 종료
    public void exitCal(){
        System.out.println("======= 계산기를 종료합니다 =======");
        System.exit(0); //-> 콘솔을 강제종료하는 메서드
    }
}
