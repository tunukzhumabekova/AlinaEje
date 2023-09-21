package AllPackages.Imp;

import AllPackages.DataBase.DataBase;
import AllPackages.Model.Hospital;
import AllPackages.Model.Patient;
import AllPackages.ServiceInterface.HospitalInterface;

import java.util.List;
import java.util.Map;

public class HospitalImpl implements HospitalInterface {
    private DataBase dataBase;

    public HospitalImpl(DataBase dataBase) {
        this.dataBase=dataBase;
    }

    @Override
    public String addHospital(Hospital hospital) {
        return null;
    }

    @Override
    public Hospital findHospitalById(Long id) {
        return null;
    }

    @Override
    public List<Hospital> getAllHospital() {
        return null;
    }

    @Override
    public List<Patient> getAllPatientFromHospital(Long id) {
        return null;
    }

    @Override
    public String deleteHospitalById(Long id) {
        return null;
    }

    @Override
    public Map<String, Hospital> getAllHospitalByAddress(String address) {
        return null;
    }
}
