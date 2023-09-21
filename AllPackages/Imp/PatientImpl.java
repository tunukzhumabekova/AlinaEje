package AllPackages.Imp;

import AllPackages.DataBase.DataBase;
import AllPackages.Model.Patient;
import AllPackages.ServiceInterface.PatientInterface;

import java.util.List;
import java.util.Map;

public class PatientImpl implements PatientInterface {
private DataBase dataBase;

    public PatientImpl(DataBase dataBase) {
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

    @Override
    public List<Patient> sortPatientsByAge(String ascOrDesc) {
        return null;
    }
}
