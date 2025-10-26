package sixPlusYrExp.interviewQuestions;

public class InterviewQuestionOutputChecks {

    public static void main(String[] args) {
        int y=10,x=20;
        int result=(y++*++x%y==3)?(x*x*x):(y*y*y);
        System.out.println(result+"-"+y+"-"+x);

    }
}
