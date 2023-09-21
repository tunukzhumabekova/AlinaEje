package AllPackages.Model;

import java.util.List;

public class Hospital {
    private long id;
    private String HospitalName;
    private String Address;
    private List<Department> departments;
    private List<Doctor> doctors;
    private List<Patient> patients;
    private static long idd=0;

    public Hospital( String hospitalName, String address, List<Department> departments, List<Doctor> doctors, List<Patient> patients) {
        this.id = idd++;
        HospitalName = hospitalName;
        Address = address;
        this.departments = departments;
        this.doctors = doctors;
        this.patients = patients;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getHospitalName() {
        return HospitalName;
    }

    public void setHospitalName(String hospitalName) {
        HospitalName = hospitalName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    public static long getIdd() {
        return idd;
    }

    public static void setIdd(long idd) {
        Hospital.idd = idd;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "id=" + id +
                ", HospitalName='" + HospitalName + '\'' +
                ", Address='" + Address + '\'' +
                ", departments=" + departments +
                ", doctors=" + doctors +
                ", patients=" + patients +
                '}';
    }
}
