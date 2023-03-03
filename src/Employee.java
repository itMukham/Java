public class Employee extends Department{
    private String fullName; //фио
    private String jobTitle; //должность
    private double salary; //oклад



    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee() {
    }
    public Employee(String fullName, String jobTitle, double salary) {
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public Employee(String nameDep, int count, String fullName, String jobTitle, double salary) {
        super(nameDep, count);
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public Employee(String nameFirma, String nameDep, int count, String fullName, String jobTitle, double salary) {
        super(nameFirma, nameDep, count);
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
}
