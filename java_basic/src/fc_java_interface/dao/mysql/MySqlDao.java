package fc_java_interface.dao.mysql;

import fc_java_interface.UserInfo;
import fc_java_interface.userInfo.UserInfoDao;

public class MySqlDao implements UserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("insert into Mysql "+userInfo.getUserId());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("update into Mysql");
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("delete into Mysql");
	}
	public void showInfo(UserInfo userInfo) {
		System.out.println("id:"+userInfo.getUserId()+" pass:"+userInfo.getUserPassword());
	}
}
