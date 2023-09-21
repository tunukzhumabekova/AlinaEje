package AllPackages.DAO.DAOInterface;

import AllPackages.Model.Doctor;

import java.util.List;

public interface DaoDoctorInterface {

    Doctor findDoctorById(Long id);

    // Department‘ти id менен табып, анан Doctor‘лорду листтеги айдилери менен табып анан ошол табылган Department'ге табылган Doctor'лорду кошуп коюнунуз
    //String assignDoctorToDepartment(Long departmentId, List<Long> doctorsId);
    List<Doctor> getAllDoctorsByHospitalId(Long id);
    List<Doctor> getAllDoctorsByDepartmentId(Long id);
}
