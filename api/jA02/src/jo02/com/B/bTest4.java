package jo02.com.B;


public class bTest4 {

	public String Email;
	
	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public boolean checkEmail(String email) {
		if(email.indexOf("@")==-1 || email.indexOf(".")==-1 || email.indexOf("@")!=email.lastIndexOf("@") ) {
			System.out.println("须包含@和. 而且@只能有一个");
			return false;
		}
		if(email.startsWith("@")==true || email.startsWith(".")==true) {
			System.out.println("不能以@或.开头以及结尾");
			return false;
		}
		if(email.indexOf("@")>email.indexOf(".")) {
			System.out.println(".@必须出现在.之前");
			return false;
		}
		else {
			System.out.println("邮箱合法，注册成功");
			return true;
		}
		
			
	}
}
