package fc_java_interface.dao.oracle;

import fc_java_interface.UserInfo;
import fc_java_interface.userInfo.UserInfoDao;

public class OracleSqlDao implements UserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("insert into Oracle "+userInfo.getUserId());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("update into Oracle "+userInfo.getUserPassword());
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("delete into Oracle");
	}
}
