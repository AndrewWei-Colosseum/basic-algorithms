public class java_class {
    public static void main(String[] args) {
        // Anonymous function version :)
        System.out.println(new Employee(19, "Andy Wei", "Software engineering", 30000.0, 0.34).getInfo());
        // Applying the stack memory and function has the name :)
        Employee one = new Employee(19, "Andy Wei", "Software engineering", 30000.0, 0.34);
        System.out.print(one.getInfo());
    }
}
class Employee {
    private int empno;
    private String empname;
    private String job;
    private double salary;
    private double comm;
    
    public Employee(int id, String name, String j, double sa, double c) {
        setEmpno(id);
        setName(name);
        setJob(j);
        setSal(sa);
        setComm(c);
    }
    public void setEmpno(int eno) {
        empno = eno;
    }
    public void setName(String ena) {
        empname = ena;
    }
    public void setJob(String j) {
        job = j;
    }
    public void setSal(double s) {
        salary = s;
    }
    public void setComm(double c) {
        comm = c;
    }
    public int getEmpno() {
        return empno;
    }
    public String getEname() {
        return empname;
    }
    public String getJob() {
        return job;
    }
    public double getSal() {
        return salary;
    }
    public double getComm() {
        return comm;
    }
    public String getInfo() {
        return  "empno = " + empno + "\n" + 
                "ename = " + empname + "\n" +
                "job = " + job + "\n" +
                "sal = " + salary + "\n" + 
                "comm = " + comm + "\n";
    }
}

