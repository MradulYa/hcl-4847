package day5;
//Practice Question
//create an arraylist of employee type and
// apply crud operation on the employee object use iterator and list
// iterator both to traverse the employees apart from these we need
// to iterate these employees on the decreasing and increasing order
import java.util.*;

class Employee implements Comparable<Employee>{
    String name;
    int id;
    double salary;

    Employee(String name,int id,double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String toString(){
        return id + " " + name + " " + salary;
    }

    @Override
    public int compareTo(Employee e1){
        return Double.compare(this.salary,e1.salary);
    }
}

//class Employee {
//    String name;
//    int id;
//    double salary;
//
//    Employee(String name,int id,double salary){
//        this.name = name;
//        this.id = id;
//        this.salary = salary;
//    }
//
//    public String toString(){
//        return id + " " + name + " " + salary;
//    }
//}

//using comparator interface
//class MyComparator implements Comparator<Employee>{
//    @Override
//    public int compare(Employee e1, Employee e2) {
//        return Double.compare(e1.salary,e2.salary);
//    }
//}

public class EmployeeCrud {
//    Practice Question
//    create an arraylist of employee type and apply crud operation on the employee
//    object use iterator and list iterator both to traverse the employees apart from these
//    we need to iterate these employees on the decreasing and increasing order

    public static void main(String[] args) {
        ArrayList<Employee> Li = new ArrayList<>();
        Li.add(new Employee("karan",101,45000));
        Li.add(new Employee("peter",102,20000));
        Li.add(new Employee("ajay",103,23000));
        Li.add(new Employee("rahul",104,42000));
        Li.add(new Employee("prashant",105,78000));

        Iterator<Employee> it = Li.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //update
        ListIterator<Employee> Lit = Li.listIterator();
        while(Lit.hasNext()){
            Employee e = Lit.next();
            if(e.name.equals("peter")){
                e.salary = 50000;
                Lit.set(e);
            }
            //System.out.println(e);
        }

        //using comparable interface
        Collections.sort(Li,Employee::compareTo);
        //using Comparartor interface
        // Li.sort(new MyComparator());

        //using lamda expression

        //Collections.sort(Li,(e1,e2) -> Double.compare(e1.salary,e2.salary));
        it = Li.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }



    }
}