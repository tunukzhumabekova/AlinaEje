package AllPackages.Imp;

import AllPackages.DataBase.DataBase;
import AllPackages.Model.Department;
import AllPackages.ServiceInterface.DepartmentInterface;

import java.util.List;

public class DepartmentImpl implements DepartmentInterface {
    private DataBase dataBase;

    public DepartmentImpl(DataBase dataBase) {
        this.dataBase=dataBase;
    }

    @Override
    public List<Department> getAllDepartmentByHospital(Long id) {
        return null;
    }

    @Override
    public Department findDepartmentByName(String name) {
        return null;
    }
}
