/**
 * 
 */
package com.rms.dao;

import java.util.List;

import com.rms.domain.User;
import com.util.jdbc.BaseDao;

/**
 * @author Administrator
 *
 */
public class UserDao extends BaseDao{
   public User fingByUnameAndUpass(String uname,String upass) {
     List<User> list=super.select("select * from t_User where uname=? and upass=?",
    		               User.class, uname,upass);
     return list.get(0);  
   }
   public List<User> findAllUsers(){
   	return super.select("select * from t_User",User.class);
   }
  
   public void deleteUser(int uid){
	   	super.delete("delete from t_User where uid=?", uid);;
   }
   
   public void addUser(String uname,String upass,String trueName){
	   	super.insert("insert into t_User (uname,upass,truename) values(?,?,?)", uname,upass,trueName);;
  }
  
   public void updateUser(String uname,String upass,String trueName,int uid)
   {
	   super.update("update t_User set uname=?,upass=?,trueName=? where uid=?", uname,upass,trueName,uid);
   }
}
