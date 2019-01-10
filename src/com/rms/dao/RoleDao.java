/**
 * 
 */
package com.rms.dao;

import java.util.List;

import com.rms.domain.Role;
import com.rms.domain.User;
import com.util.jdbc.BaseDao;

/**
 * @author Administrator
 *
 */
public class RoleDao extends BaseDao {
	public List<Role> findAllRoles(){
	   	return super.select("select * from t_role",Role.class);
	   }
	  
	   public void deleteRole(int rid){
		   	super.delete("delete from t_role where rid=?", rid);;
	   }
	   
	   public void addRole(String rname,String des){
		   	super.insert("insert into t_role (rname,des) values(?,?)", rname,des);;
	  }
	  
	   public void updateRole(String rname,String des,int rid)
	   {
		   super.update("update t_role set rname=?,des=? where rid=?", rname,des,rid);
	   }
}
