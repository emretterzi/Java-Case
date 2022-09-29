public class Employee {

    private final String name;
    private  int salary;
    private  int workHours;
    private  int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }



    public int tax(){
        int tax=0;

        if(this.salary>1000){

            tax=(this.salary/100)*3;

        }
        return tax;


    }

    public int bonus(){
        int bonus = 0;

        if (this.workHours>40){
            bonus=(this.workHours-40)*30;

        }
        return bonus;
    }


    public int raiseSalary(){
        int addSalary=0;

        int workYear=2021-this.hireYear;

        if (workYear<10){

            addSalary=(this.salary/100)*5;
        }
        if (workYear>9 && workYear<20){

            addSalary=(this.salary/100)*10;
        }
        if (workYear>19){

            addSalary=(this.salary/100)*15;

        }
        return addSalary;


    }

    @Override
    public String toString() {
        return
                " name=" + name  +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                ", bonus=" +bonus()+
                ", tax="+tax()+
                ", raiseSalary="+raiseSalary()+
                ", bonus+salary-tax="+(salary-tax()+bonus())+
                ", total salary="+(salary+raiseSalary()+bonus()-tax())

                ;
    }
}
