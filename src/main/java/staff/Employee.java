package staff;

public abstract class Employee {
    private String name;
    private String niNumber;
    private int salary;

    public Employee(String name, String niNumber, int salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNiNumber() {
        return niNumber;
    }

    public int getSalary() {
        return salary;
    }

    public double raiseSalary(double amount) {
        if (amount < 0) {
            return amount;
        } else {
            return salary + amount;
        }
    }

    public double payBonus() {
        return salary += 0.01 * salary;
    }

    public void setName(String name) {
        if (name == null) {
        } else {
            this.name = name;
        }
    }
}
