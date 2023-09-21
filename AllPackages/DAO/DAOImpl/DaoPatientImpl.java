package AllPackages.DAO.DAOImpl;

import AllPackages.DAO.DAOInterface.DaoPatientInterface;
import AllPackages.DataBase.DataBase;
import AllPackages.Model.Patient;
import AllPackages.ServiceInterface.PatientInterface;

import java.util.List;
import java.util.Map;

public class DaoPatientImpl implements DaoPatientInterface {
private DataBase dataBase;

    public DaoPatientImpl(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public String addPatientsToHospital(Long id, List<Patient> patients) {
        return null;
    }

    @Override
    public Patient getPatientById(Long id) {
        return null;
    }

    @Override
    public Map<Integer, Patient> getPatientByAge() {
        return null;
    }


}
