package nit.v;

public class User {
	public String userName, mailId;
	public long phoneNo;

	public User(String userName, String mailId, long phoneNo) {
		this.userName = userName;
		this.mailId = mailId;
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "UserName:" + userName + "\nMailId:" + mailId + "\nphoneNo:" + phoneNo;

	}
}
