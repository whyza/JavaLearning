package JA04B;

import java.util.ArrayList;

public class T2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a1 = new Address("David Clarke","10 Downing Street","London","United Kingdom",110022);
		Address a2 = new Address("John Lenon","12 Park Avenue","California","USA",210033);
		Address a3 = new Address("Stefii Graff","14 Maple Lane","Sydney","Australia",412033);	
		ArrayList<Address> list = new ArrayList<>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		for (Address address : list) {
			System.out.println(address);
		}
	}

}
