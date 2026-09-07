public class Employee {
    
      private String name;
      private double salary;
      private boolean isactive;
      
      public Employee(String name, double salary, boolean isactive) {
          this.name = name;
          this.salary = salary;
          this.isactive = isactive;
      }

      public String getName() {
          return name;
      }
      public double getSalary() {
          return salary;
      }
        public boolean isActive() {
            return isactive;
        }

        public void promote(double raise) {
            if (raise > 0) {
                salary += raise;
            }
        }

        public void deactivate() {
            isactive = false;
        }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + ", isactive=" + isactive + "}";
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Alice", 25000.0, true);
        e1.promote(5000.0);
        System.out.println(e1);
        System.out.println("Name: " + e1.getName());
        System.out.println("Salary: " + e1.getSalary());
        System.out.println("Active: " + e1.isActive());

        e1.deactivate();
        System.out.println("After deactivation: " + e1.isActive());
    }
    
}
