package constructordi;

public class Employee {
    private address Address;
    public Employee(address Address){
        this.Address=Address;
    }
    public void getEmpAddress(){
        Address.getaddress();
    }
}
