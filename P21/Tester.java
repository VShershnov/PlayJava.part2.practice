package part2.practice.P21;

public class Tester {

	public static void main(String[] args) {
		int q = 5;
		
		Student[] s = new Student[q];
		StudGroup sg = new StudGroup(q);
		StudentReader sr = new StudentReader();
		
		for (int i = 0; i < q; i++) {
			s[i] = new Student(sr.readStudent());
		}
		
		sg.setmStudents(s);
		System.out.println(sg.toString());
		
		
	}
	

}
