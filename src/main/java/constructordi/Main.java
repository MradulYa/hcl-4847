package constructordi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

    ApplicationContext ctx=new AnnotationConfigApplicationContext(Appconfig.class);
    Employee emp=ctx.getBean(Employee.class);
    emp.getEmpAddress();
}}
