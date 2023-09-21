package AllPackages.Imp;

import AllPackages.DataBase.DataBase;
import AllPackages.ServiceInterface.GenericInterface;

public class GenericImpl implements GenericInterface {
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
