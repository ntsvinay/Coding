package vimalProgram;

public class CommonProgramForJob {

    static String color;
    int numberOfLight;

    void getColor (){
        color= "red";
    }

   int getLights()
    {
       return 1;
    }

    public static void main (String[] args){

        CommonProgramForJob racket = new CommonProgramForJob();

        //String clr = racket.getColor();
        racket.getColor();

        int lights = racket.getLights();

        System.out.println(color);
        System.out.println(lights);
    }
}
