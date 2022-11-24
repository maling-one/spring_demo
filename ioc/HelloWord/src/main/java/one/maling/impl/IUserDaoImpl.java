package one.maling.impl;

import one.maling.IUserDao;

public class IUserDaoImpl implements IUserDao {
    @Override
    public void save() {
        System.out.println("调用了UserDao");
    }
}
