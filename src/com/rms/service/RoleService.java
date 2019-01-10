/**
 * 
 */
package com.rms.service;

import java.util.List;

import com.rms.dao.RoleDao;
import com.rms.domain.Role;

/**
 * @author Administrator
 *
 */
public class RoleService {
	RoleDao dao=new RoleDao();
    public List<Role> findAllRoles(){
    	return dao.findAllRoles();
    }
    
    public void deleteRole(int rid) {
    	dao.deleteRole(rid);
    }
    public void addRole(String rname,String des){
	   	dao.addRole(rname, des);
    }
    public void updateRole(String rname,String des,int rid) {
    	dao.updateRole(rname, des, rid);
    }
}
