package array;
import java.lang.*;
import java.io.*;
import java.util.*;

public class Main
{   
    public static String modifyString(String S){
        
        //this is default OUTPUT. You can change it.
        String result="";
        
        //write your Logic here:
        char[] vowelArr={'a','e','i','o','u'};
        char[] strArr=S.toCharArray();
        if(S.contains("a"))
        {
            for(int i=0;i<strArr.length;i++)
            {
               if(strArr[i]==vowelArr[0]||strArr[i]==vowelArr[1]||
               strArr[i]==vowelArr[2]||strArr[i]==vowelArr[3]||
               strArr[i]==vowelArr[4])
               {
                   
               }
               else{
                   strArr[i]='a';
               }
                
            }
            
        }
        else if(S.contains("e"))
        {
           for(int i=0;i<strArr.length;i++)
            {
               if(strArr[i]==vowelArr[0]||strArr[i]==vowelArr[1]||
               strArr[i]==vowelArr[2]||strArr[i]==vowelArr[3]||
               strArr[i]==vowelArr[4])
               {
                   
               }
               else{
                   strArr[i]='e';
               }
                
            } 
        }
        else if(S.contains("i"))
        {
            for(int i=0;i<strArr.length;i++)
            {
               if(strArr[i]==vowelArr[0]||strArr[i]==vowelArr[1]||
               strArr[i]==vowelArr[2]||strArr[i]==vowelArr[3]||
               strArr[i]==vowelArr[4])
               {
                   
               }
               else{
                   strArr[i]='i';
               }
                
            }
        }
        else if(S.contains("o"))
        {
            for(int i=0;i<strArr.length;i++)
            {
               if(strArr[i]==vowelArr[0]||strArr[i]==vowelArr[1]||
               strArr[i]==vowelArr[2]||strArr[i]==vowelArr[3]||
               strArr[i]==vowelArr[4])
               {
                   
               }
               else{
                   strArr[i]='o';
               }
                
            }
        }
        else if(S.contains("u"))
        {
          for(int i=0;i<strArr.length;i++)
            {
               if(strArr[i]==vowelArr[0]||strArr[i]==vowelArr[1]||
               strArr[i]==vowelArr[2]||strArr[i]==vowelArr[3]||
               strArr[i]==vowelArr[4])
               {
                   
               }
               else{
                   strArr[i]='u';
               }
                
            }  
        }
        else{
            for(int i=0;i<strArr.length;i++)
            {
               if(strArr[i]==vowelArr[0]||strArr[i]==vowelArr[1]||
               strArr[i]==vowelArr[2]||strArr[i]==vowelArr[3]||
               strArr[i]==vowelArr[4])
               {
                   
               }
               else{
                   strArr[i]='a';
               }
                
            }
            
        }
        result=String.valueOf(strArr);
        
        return result;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        String S=sc.nextLine();
        
        //OUTPUT [uncomment & modify if required]
        System.out.println(modifyString(S));
    
    }
}