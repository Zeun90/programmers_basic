package part3;

public class LogicalOperatorExam1 {
    public boolean isAgeDiscountable(int age) {
        boolean isDiscount = false;
        // 아래 빈칸을 채워 코드를 완성하세요.
        if(19 >= age || age >= 60) {
            isDiscount = true;
        }
        else {
            isDiscount = false;
        }
        return isDiscount;
    }

    public static void main(String[]args) {
        LogicalOperatorExam1 exam = new LogicalOperatorExam1();
        exam.isAgeDiscountable(15);
        exam.isAgeDiscountable(27);
    }
}
