package fc_java_interface;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import fc_java_interface.dao.mysql.MySqlDao;
import fc_java_interface.dao.oracle.OracleSqlDao;
import fc_java_interface.userInfo.UserInfoDao;

public class Client {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("db.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		String dbType = prop.getProperty("DBTYPE");
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId("son");
		userInfo.setUserPassword("1234");
		
		UserInfoDao userInfoDao = null;
		if(dbType.equals("oracle")) {
			userInfoDao = new OracleSqlDao();
		}else if(dbType.equals("mysql")) {
			userInfoDao = new MySqlDao();
		}else {
			System.out.println("db error!");
		}
		userInfoDao.insertUserInfo(userInfo);
		userInfoDao.updateUserInfo(userInfo);
		userInfoDao.deleteUserInfo(userInfo);
	}
	
}
