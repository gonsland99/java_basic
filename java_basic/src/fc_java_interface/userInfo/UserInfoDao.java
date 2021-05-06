package fc_java_interface.userInfo;

import fc_java_interface.UserInfo;

public interface UserInfoDao {
	//interface: sql종류에 따른 연결을 위한 메뉴얼
	void insertUserInfo(UserInfo userInfo);
	void updateUserInfo(UserInfo userInfo);
	void deleteUserInfo(UserInfo userInfo);

}
