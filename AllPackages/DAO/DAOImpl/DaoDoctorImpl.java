package AllPackages.DAO.DAOImpl;

import AllPackages.DAO.DAOInterface.DaoDoctorInterface;
import AllPackages.DataBase.DataBase;
import AllPackages.Model.Doctor;
import AllPackages.ServiceInterface.DoctorInterface;

import java.util.List;

public class DaoDoctorImpl implements DaoDoctorInterface {
    private DataBase dataBase;

    public DaoDoctorImpl(DataBase dataBase) {
        this.dataBase=dataBase;
    }

    @Override
    public Doctor findDoctorById(Long id) {
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
