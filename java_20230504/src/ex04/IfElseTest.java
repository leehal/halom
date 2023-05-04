package ex04;

import java.util.Optional;

class ConInfo{
	private String phone;
	private String address;
	
	public ConInfo(String phone,String adress) {
		this.phone = phone;
		this.address = adress;
	}
	public String getPhone() {
		return phone;
	}
	public String getAdress() {
		return address;
	}
}

public class IfElseTest {

	public static void main(String[] args) {
		
/*		ConInfo c1 = new ConInfo(null, "수원");
		
		String phone;
		String address;
		
		if(c1.getPhone() != null)
			phone = c1.getPhone();
		else
			phone = "no phone";
		
		if(c1.getAdress() != null)
			address = c1.getAdress();
		else
			address= "no Dept";
		System.out.println(phone);
		System.out.println(address);
*/
		Optional<ConInfo> c2= Optional.of(new ConInfo("010", "수원"));
		
		String phone = c2.map(c->c.getPhone()).orElse("no phone");
		String address = c2.map(c-> c.getAdress()).orElse("no address");
		
		System.out.println(phone);
		System.out.println(address);
	}

}
