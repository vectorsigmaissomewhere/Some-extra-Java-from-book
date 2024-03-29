import java.util.Date;
import java.util.GregorianCalendar;
public class Employee implements Cloneable{
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String name,double salary){
        this.name=name;
        this.salary=salary;
        hireDay=new Date();
    }
   //The main theme about the whole program is in this below below
    public Employee clone() throws CloneNotSupportedException{
        Employee cloned=(Employee) super.clone();   //call Object.clone
        cloned.hireDay=(Date) hireDay.clone();  //cloned mutable fields
        return cloned;
    }
    public void setHireDay(int year,int month,int day){
        Date newHireDay=new GregorianCalendar(year,month-1,day).getTime();
        hireDay.setTime(newHireDay.getTime());
    }
    public void raiseSalary(double byPercent){
        double raise=salary*byPercent/100;
        salary+=raise;
    }
    public String toString(){
        return "Employee[name= "+name+",salary="+salary+",hireDay="+hireDay+"]";
    }
}
