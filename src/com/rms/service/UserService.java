/**
 * 
 */
package com.rms.service;

import java.util.List;

import com.rms.dao.UserDao;
import com.rms.domain.User;

/**
 * @author Administrator
 *
 */
public class UserService {
	UserDao dao=new UserDao();
    public User checkLogin(String uname,String upass){
    	return dao.fingByUnameAndUpass(uname, upass);
    }
    
    public List<User> findAllUsers(){
    	return dao.findAllUsers();
    }
    
    public void deleteUser(int uid) {
    	dao.deleteUser(uid);
    }
    public void batchDeleteUser(int[] uids) {
        for (int uid:uids) {
            dao.deleteUser(uid);
        }
    }
    public void addUser(String uname,String upass,String trueName){
	   	dao.addUser(uname, upass, trueName);
    }
    public void updateUser(String uname,String upass,String trueName,int uid) {
    	dao.updateUser(uname, upass, trueName, uid);
    }
}
