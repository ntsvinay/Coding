package sixPlusYrExp.streamApi;

import java.util.ArrayList;
import java.util.List;

public class StreamFun {

    public List<?> getEmpList()
    {
        Emp empDetails= new Emp();
        empDetails.setEmpAge(15);
        empDetails.setEmpId(1);
        empDetails.setEmpName("Vinay1");
        empDetails.setEmpPost("Doctor");
        empDetails.setEmpSalary(10000);
        empDetails.setEmpMobileNumber("9719161268");

        Emp empDetails1= new Emp();

        empDetails1.setEmpAge(30);
        empDetails1.setEmpId(2);
        empDetails1.setEmpName("Vinay2");
        empDetails1.setEmpPost("Doctor");
        empDetails1.setEmpSalary(20000);
        empDetails1.setEmpMobileNumber("9719161268");

        Emp empDetails2= new Emp();

        empDetails2.setEmpAge(27);
        empDetails2.setEmpId(3);
        empDetails2.setEmpName("Vinay3");
        empDetails2.setEmpPost("Doctor");
        empDetails2.setEmpSalary(60000);
        empDetails2.setEmpMobileNumber("9719161268");

        List<Emp> empDetailsList=new ArrayList<>();

        empDetailsList.add(empDetails);
        empDetailsList.add(empDetails1);
        empDetailsList.add(empDetails2);

        return empDetailsList;
    }
    public static void main(String[] args) {

        List<Emp> empDetailsList= (List<Emp>) new StreamFun().getEmpList();
        List<Emp> filtered= empDetailsList.stream().
                filter(emp->emp.empAge>25 && emp.empSalary>=10000).toList();

       for(Emp emp:filtered) {
           System.out.println(emp.empId);
       }
    }
}
