package sixPlusYrExp.streamApi;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFun {

    public List<?> getEmpList()
    {
        List<Emp> empDetailsList=new ArrayList<>();

        empDetailsList.add(new Emp("Vinay",1,"Baghel","9719161268",10000,27,"Team Lead","Male"));
        empDetailsList.add(new Emp("Vimal",2,"Kumar","97191231221",20000,24,"Student","Male"));
        empDetailsList.add(new Emp("Kiran",3,"Kumari","971912",30000,25,"Nurse","Female"));
        empDetailsList.add(new Emp("Akshay",4,"Khanna","987652121",1000,55,"Actor","Male"));
        empDetailsList.add(new Emp("Neha",5,"Rani","9719161218",2000,30,"Doctor","Female"));
        empDetailsList.add(new Emp("Ivaan",7,"Baghel","9719161228",45000,1,"IPS","Male"));
        empDetailsList.add(new Emp("Love",8,"Singh","9719161262",30000,1,"IPS","Male"));
        empDetailsList.add(new Emp("Raaz",9,"Put","9719161269",2000,15,"Nurse","Male"));
        empDetailsList.add(new Emp("Kunal",10,"Kapoor","9719161868",10000,45,"Team Lead","Male"));

        /*empDetails.setEmpAge(15);
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

        empDetailsList.add(empDetails);
        empDetailsList.add(empDetails1);
        empDetailsList.add(empDetails2);*/

        return empDetailsList;
    }
    public static void main(String[] args) {

        List<Emp> empDetailsList = (List<Emp>) new StreamFun().getEmpList();
        StreamFun obj=new StreamFun();
        //obj.working(empDetailsList);
        obj.practice(empDetailsList);
    }

    public void practice(List<Emp> empDetailsList)
    {
        System.out.println(empDetailsList.stream().collect(Collectors.groupingBy(Emp::getGender,Collectors.averagingInt(Emp::getEmpSalary))));

        int num=12343221;

        Stream.of(String.valueOf(num).split("")).sorted(Comparator.reverseOrder()).limit(1).forEach(System.out::println);
        Stream.of(String.valueOf(num).split("")).collect(Collectors.summingInt(Integer::parseInt));
        Stream.of(String.valueOf(num).split("")).reduce((a,b)->a+b);
    }

    public void working(List<Emp> empDetailsList) {

            empDetailsList.stream().
                    filter(emp -> emp.empAge > 25 && emp.empSalary >= 10000)
                    .forEach(emp -> System.out.println("Name | " + emp.getEmpName() + " || Salary | " + emp.getEmpSalary()));
            System.out.println("---------Checking Male and Female In Organization-----------------------");
            System.out.println(empDetailsList.stream().collect(Collectors.groupingBy(Emp::getGender, Collectors.counting())));

            System.out.println("---------Checking Male and Female In Average Salary-----------------------");
            System.out.println(empDetailsList.stream().collect(Collectors.groupingBy(Emp::getGender, Collectors.averagingInt(Emp::getEmpSalary))));

            System.out.println("--------------Max Salaried Emp Name----------------");
            System.out.println(empDetailsList.stream().collect(Collectors.maxBy(Comparator.comparing(Emp::getEmpSalary))).get().getEmpName());
            System.out.println(empDetailsList.stream().max(Comparator.comparing(Emp::getEmpSalary)).get().getEmpName());
            System.out.println(empDetailsList.stream().sorted(Comparator.comparing(Emp::getEmpSalary).reversed()).skip(1).findFirst().get().getEmpName());

            System.out.println("--------------Department Name----------------");
            empDetailsList.stream().distinct().forEach(emp -> System.out.print(emp.getEmpPost() + " || "));

            System.out.println();
            empDetailsList.stream().map(Emp::getEmpPost).distinct().forEach(System.out::print);

            System.out.println("Number Of Post---" + empDetailsList.stream().collect(Collectors.groupingBy(Emp::getEmpPost, Collectors.counting())));
            System.out.println("Youngest emp ---" + empDetailsList.stream().filter(emp -> emp.getGender() == "Male").min(Comparator.comparing(Emp::getEmpAge)).get().getEmpName());
            System.out.println("oldest Emp ---" + empDetailsList.stream().sorted(Comparator.comparing(Emp::getEmpAge).reversed()).findFirst().get().getEmpName());

            System.out.println("--------------Printing Emp contains char-----------------");
            empDetailsList.stream().filter(a -> a.getEmpName().contains("Vi") || a.getEmpLastName().contains("Bag")).collect(Collectors.toList()).forEach(emp -> System.out.println(emp.getEmpName() + " | " + emp.getEmpLastName()));
        }
}
