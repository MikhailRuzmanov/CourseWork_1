package CourseWork_1;
public class Main {
    public static void main(String[] args) {
        int department1 = 1;
        int department2 = 2;
        int department3 = 3;
        int department4 = 4;
        int department5 = 5;

        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Васильев Олег Петрович", department1, 45000);
        employees[1] = new Employee("Воронов Олим Валерьянович", department2, 90000);
        employees[2] = new Employee("Цветкова Анна Олеговна", department3, 96300);
        employees[3] = new Employee("Крылова Анастасия Михайловна", department4, 130000);
        employees[4] = new Employee("Скворцов Антон Матвеевич", department5, 67000);
        employees[5] = new Employee("Репин Демьян Сергеевич", department1, 98000);
        employees[6] = new Employee("Васильева Екатерина Александровна", department2, 112000);
        employees[7] = new Employee("Стружкина Валентина Вячеславовна", department3, 115000);
        employees[8] = new Employee("Крючков Валерьян Олимпович", department4, 120000);
        employees[9] = new Employee("Ильин Роман Робертович", department5, 97000);

        System.out.println("Курсовая работа №1");
        System.out.println(" ");

        for (Employee i : employees) {
            System.out.println(i);
        }

        System.out.println(" ");

        int sumSalary = Employee.sumSalary(employees);
        System.out.println("Сумма всех заплат " + sumSalary);

        System.out.println(" ");
        Employee.minSalary10(employees);

        System.out.println(" ");
        Employee.maxSalary(employees);

        System.out.println(" ");
        Employee.middleSalary(employees);

        System.out.println(" ");
        Employee.showEmployee(employees);




        }





    }




