package vimalProgram;

public class Calculator {

    int getAddNumber(int a,int b ){
        return a+b;
    }
    int getSubtractedNumber(int a,int b ){
        return a-b;
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();

        int result=cal.getAddNumber(11,20);
        int result1=cal.getSubtractedNumber(20,11);
        System.out.println(result);
        System.out.println(result1);


    }
}
