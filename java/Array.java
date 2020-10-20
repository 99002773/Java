package array_list;

	import java.util.List;
	import java.util.*;
	public class Array_list{
	    public static void main(String args[]) {
	        List<Employee> emp=new ArrayList<>();
	        Employee emp1= new Employee(10,"VinayKumar","Telangana");
	        emp.add(emp1);
	        emp.add(new Employee(20,"vamshi","Khammam"));
	        emp.add(new Employee(30,"Lucky","Enkoor"));
	       
	       
	    }
	    Iterator<Employee>Emp= emp.iterator();
	    while(Emp.hasNext()){
	    	Employee obj = iterator.next();
	        System.out.println(obj);
	    }
	    ListIterator<Employee>Emp1= emp.listIterator();
	         emp.listIterator(emp.size());
	    while(Emp1.hasPrevious()){
	    	Employee obj1 =Emp1.Previous();
	        System.out.println(obj1);
	    }

}
