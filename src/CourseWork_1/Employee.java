package CourseWork_1;

public class Employee {
    private static int count;
    private int id;
    private String nameEmloyee;
    private int department;
    private int salary;

    public Employee(String nameEmployee, int department, int salary) {
        count++;
        this.setId(count);
        this.nameEmloyee = nameEmployee;
        this.department = department;
        this.salary = salary;

    }


    public String getNameEmloyee() {
        return this.nameEmloyee;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {

        return "Имя работника: " + nameEmloyee + ", " + "Департамент №" + department + ", " + "Зарплата " + salary + ", " + "id = " + id;
    }

    public static int sumSalary(Employee[] employees) { // Сумма всех зарплат
        int sumSalary1 = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sumSalary1 = sumSalary1 + employee.getSalary();
            }


        }
        return sumSalary1;

    }

    public static void minSalary10(Employee[] employees) {
        int id = 0;
        int minSalary1 = Integer.MAX_VALUE; //employees[0].getSalary()
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null&&minSalary1 > employees[i].getSalary()) {
                minSalary1 = employees[i].getSalary();
                id = employees[i].getId();
            }

        }
        System.out.println("Сотрудник c id " + id + " имеет минимальную зарплату " + minSalary1);
    }

    public static void maxSalary(Employee[] employees) { // Максимальная зарплата
        int id = 0;
        int maxSalary1 = 0;
        for (int i = 0; i < employees.length; i++ ) {
            if (employees[i]!=null) {
                if (maxSalary1<employees[i].getSalary()){
                    maxSalary1 = employees[i].getSalary();
                    id = employees[i].getId();
                }

            }
        }
        System.out.println("Сотрудник c id " + id + " имеет масисмальную зарплату " + maxSalary1);


    }


    public static float middleSalary(Employee[] employees){
        int k=0;
        float sumSalary2=sumSalary(employees);
        for (int i = 0; i < employees.length; i++ ){
            if (employees[i]!=null){
                k++;
            }
        }
        float middleSalary=sumSalary2/k;
        System.out.println("Средняя зарплата сотрудников = " + middleSalary);

        return middleSalary;

    }
    public static void showEmployee(Employee[]employees){
        for (int i = 0; i < employees.length; i++ ){
            if (employees[i]!=null){
                System.out.println("ФИО сотрудника: "  + employees[i].getNameEmloyee());
            }

        }
    }


}




