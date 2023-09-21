package AllPackages.DAO.DAOInterface;

import AllPackages.Model.Patient;

import java.util.List;
import java.util.Map;

public interface DaoPatientInterface {
    String addPatientsToHospital(Long id,List<Patient> patients);
    Patient getPatientById(Long id);
    Map<Integer, Patient> getPatientByAge();
    //List<Patient> sortPatientsByAge(String ascOrDesc);
}
