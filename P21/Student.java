package part2.practice.P21;

public class Student {
	private String name;
	private String address;
	private double avrGrade;
	
	Student() {
		name = "";
		address = "";
		avrGrade = 0;
	}
	
	Student (String _name, String _address, double _avrGrade){
		name = "";
		name = name.concat(_name);
		address = "";
		address = address.concat(_address);
		avrGrade = _avrGrade;
	}
	
	Student (Student _stud){
		name = "";
		name = name.concat(_stud.getName());
		address = "";
		address = address.concat(_stud.getAddress());
		avrGrade = _stud.getAvrGrade();
	}
	

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public double getAvrGrade() {
		return avrGrade;
	}

	@Override
	public String toString() {
		return name + "; " + address + "; " + avrGrade;
	}
	
}
