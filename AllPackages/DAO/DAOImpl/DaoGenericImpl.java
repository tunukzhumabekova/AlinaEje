package AllPackages.DAO.DAOImpl;

import AllPackages.DAO.DAOInterface.DaoGenericInterface;
import AllPackages.DataBase.DataBase;
import AllPackages.ServiceInterface.GenericInterface;

public class DaoGenericImpl implements DaoGenericInterface {
    private DataBase dataBase;
    @Override
    public String add(Long hospitalId, Object o) {
        return null;
    }

    @Override
    public void removeById(Long id) {

    }

    @Override
    public String updateById(Long id, Object o) {
        return null;
    }
}
