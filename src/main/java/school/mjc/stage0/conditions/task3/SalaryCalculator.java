package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if(0<salary && salary<=10000){System.out.println(salary*(1-0.15));}
        else if (10000<salary && salary<=20000){System.out.println(salary*(1-0.18));}
        else if (salary>20000){System.out.println(salary*(1-0.2));}
        else{System.out.println("wrong input!");}
    }
}
