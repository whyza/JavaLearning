package JA06;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestB2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("D:\\3.txt");
		FileOutputStream fo = null;
		try {
			System.out.println(f.createNewFile());
			fo = new FileOutputStream(f, true);
			fo.write("��ҹ˼\r\n".getBytes());
			fo.write("���".getBytes());
			fo.write("��ǰ���¹⣬���Ƶ��Ϲ⣻\r\n".getBytes());
			fo.write("��ͷ�����£���ͷ˼���硣\r\n".getBytes());
			fo.write("Oh Yh Come On����������".getBytes());
			System.out.println("done");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fo.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
