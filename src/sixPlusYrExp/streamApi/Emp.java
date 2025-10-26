package sixPlusYrExp.streamApi;

public class Emp {
    String empName;
    int empId;
    String empLastName;
    String gender;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmpName() {
        return empName;
    }

    public Emp(String empName, int empId, String empLastName, String empMobileNumber, int empSalary, int empAge, String empPost,String gender) {
        this.empName = empName;
        this.empId = empId;
        this.empLastName = empLastName;
        this.empMobileNumber = empMobileNumber;
        this.empSalary = empSalary;
        this.empAge = empAge;
        this.empPost = empPost;
        this.gender = gender;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpMobileNumber() {
        return empMobileNumber;
    }

    public void setEmpMobileNumber(String empMobileNumber) {
        this.empMobileNumber = empMobileNumber;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public String getEmpPost() {
        return empPost;
    }

    public String getEmpLastName() {
        return empLastName;
    }

    public void setEmpLastName(String empLastName) {
        this.empLastName = empLastName;
    }

    public void setEmpPost(String empPost) {
        this.empPost = empPost;
    }

    String empMobileNumber;
    int empSalary;
    int empAge;
    String empPost;
}
