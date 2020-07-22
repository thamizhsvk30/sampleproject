package orgmemp;

public class Employee {
public void empId(int Id) {
	System.out.println(Id);
}
public void empId(long number) {
	System.out.println(number);
}
public void empId(int Id,long number) {
	System.out.println(Id);
	System.out.println(number);
}
public static void main(String[] args) {
	Employee e = new Employee();
	e.empId(78765);
	e.empId(1234567890l);
	e.empId(345,5765874655l);
}
}
