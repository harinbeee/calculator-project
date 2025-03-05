package level2;

public class Manager {
    private Calculator calculator;

    public Manager(Calculator calculator) {
        this.calculator = calculator;
    }

    public void allClear() {
        System.out.println("==계산기 초기화==");
        calculator.recordClear();
    }

    public void exitCal(){
        System.out.println("==계산을 종료합니다==");
        System.exit(0);
    }


}
