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
			System.out.println("�����@��. ����@ֻ����һ��");
			return false;
		}
		if(email.startsWith("@")==true || email.startsWith(".")==true) {
			System.out.println("������@��.��ͷ�Լ���β");
			return false;
		}
		if(email.indexOf("@")>email.indexOf(".")) {
			System.out.println(".@���������.֮ǰ");
			return false;
		}
		else {
			System.out.println("����Ϸ���ע��ɹ�");
			return true;
		}
		
			
	}
}
