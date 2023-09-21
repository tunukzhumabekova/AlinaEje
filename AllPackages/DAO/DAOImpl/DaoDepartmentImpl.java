package AllPackages.DAO.DAOImpl;

import AllPackages.DAO.DAOInterface.DaoDepartmentInterface;
import AllPackages.DataBase.DataBase;
import AllPackages.Model.Department;
import AllPackages.ServiceInterface.DepartmentInterface;

import java.util.List;

public class DaoDepartmentImpl implements DaoDepartmentInterface {
    private DataBase dataBase;

    public DaoDepartmentImpl(DataBase dataBase) {
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
