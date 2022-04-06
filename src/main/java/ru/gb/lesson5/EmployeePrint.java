package ru.gb.lesson5;

public class EmployeePrint {

    public static void main(String[] args) {

            Employee[] empArray = new Employee[5];

        empArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312",
                30000, 30);
        empArray[1] = new Employee("Smirnov Sergey", "driver", "ivivan@mailbox.com", "892312312",
                20000, 45);
        empArray[2] = new Employee("Petrov Vasiliy", "driver", "ivivan@mailbox.com", "892312312",
                25000, 40);
        empArray[3] = new Employee("Sidorov Evgeniy", "driver", "ivivan@mailbox.com", "892312312",
                30000, 25);
        empArray[4] = new Employee("Petrov Viktor", "driver", "ivivan@mailbox.com", "892312312",
                25000, 30);

        for (Employee employee : empArray) {
            if (employee.getAge() >= 40) {
                employee.printObject();
            }
        }
    }
}
