package AllPackages.Imp;

import AllPackages.DataBase.DataBase;
import AllPackages.Model.Doctor;
import AllPackages.ServiceInterface.DoctorInterface;

import java.util.List;

public class DoctorImpl implements DoctorInterface {
    private DataBase dataBase;

    public DoctorImpl(DataBase dataBase) {
        this.dataBase=dataBase;
    }

    @Override
    public Doctor findDoctorById(Long id) {
        return null;
    }

    @Override
    public String assignDoctorToDepartment(Long departmentId, List<Long> doctorsId) {
        return null;
    }

    @Override
    public List<Doctor> getAllDoctorsByHospitalId(Long id) {
        return null;
    }

    @Override
    public List<Doctor> getAllDoctorsByDepartmentId(Long id) {
        return null;
    }
}
