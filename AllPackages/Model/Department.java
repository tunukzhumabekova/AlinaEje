package AllPackages.Model;

import java.util.List;

public class Department {
    private long id;
    private String departmentName;
    private List<Doctor> doctors;
    private static long idd=0;

    public Department( String departmentName, List<Doctor> doctors) {
        this.id = idd++;
        this.departmentName = departmentName;
        this.doctors = doctors;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public static long getIdd() {
        return idd;
    }

    public static void setIdd(int idd) {
        Department.idd = idd;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", departmentName='" + departmentName + '\'' +
                ", doctors=" + doctors +
                '}';
    }
}
