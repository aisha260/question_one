public class Employee {
    private String name;
    private String position;
    private double basicSalary;
    private int experience;
    private String educationalLevel;

    public Employee(String name, String position, double basicSalary, int experience, String educationalLevel) {
        this.name = name;
        this.position = position;
        this.basicSalary = basicSalary;
        this.experience = experience;
        this.educationalLevel = educationalLevel;
    }

    public double calculateSalary() {
        double salary = basicSalary + (basicSalary * 0.05 * experience);

        if (educationalLevel.equals("Bachelor Degree")) {
            salary += 500;
        } else if (educationalLevel.equals("Diploma")) {
            salary += 250;
        }

        return salary;
    }

    public double calculateBonus() {
        if (position.equals("Full Time")) {
            return basicSalary * 0.03;
        } else if (position.equals("Part Time")) {
            return basicSalary * 0.015;
        }

        return 0;
    }

    public static void main(String[] args) {
        Employee fullTimeEmployee = new Employee("John", "Full Time", 5000, 5, "Bachelor Degree");
        Employee partTimeEmployee = new Employee("Jane", "Part Time", 3000, 2, "Diploma");

        System.out.println("Full Time Employee:");
        System.out.println("Salary: " + fullTimeEmployee.calculateSalary());
        System.out.println("Bonus: " + fullTimeEmployee.calculateBonus());

        System.out.println("\nPart Time Employee:");
        System.out.println("Salary: " + partTimeEmployee.calculateSalary());
        System.out.println("Bonus: " + partTimeEmployee.calculateBonus());
    }
}
