public class Employee21 extends Person2 {
   public long Emp_id;
   public long salary;
   public Employee21(String name,int age,long Emp_id,long salary)

   {
        super(name,age);
       this.Emp_id=Emp_id;
       this.salary=salary;
       System.out.println(Emp_id);
       System.out.println(salary);
    }

}
