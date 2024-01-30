public class EmployeeIncomeTax implements Taxable{
    int emp_id;
    String name;
    float salary;
    float calTax;

    EmployeeIncomeTax(int emp_id, String name, float salary) {
        this.emp_id=emp_id;
        this.name=name;
        this.salary=salary;
    }
    @Override
    public void calTax() {
        calTax=(income_tax*sales)/100;
        System.out.println("IncomeTax for the employee:"+emp_id+calTax);

    }
}
