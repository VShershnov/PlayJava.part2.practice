package part2.practice.P21;



public class StudGroup {
	private Student[] mStudents;
	private double mMinGrade = 0, mMaxGrade = 100;
	private double mAvrGrade = 0.0;
	
	StudGroup() {
		mStudents = new Student[10];
	}
	
	StudGroup (int size){
		mStudents = new Student[size];
	}
	
	StudGroup (StudGroup sg){
		int l = sg.mStudents.length;
		
		mStudents = new Student[l];
		
		for (int i = 0; i < l; i++) {
			mStudents[i] = new Student();
			mStudents[i] = sg.mStudents[i];
		}
		
		mMaxGrade = sg.mMaxGrade;
		mMinGrade = sg.mMinGrade;
		mAvrGrade = sg.mAvrGrade;
	
	}

	public Student[] getmStudents() {
		int l = mStudents.length;
		
		Student[] studentsCopy = new Student[l];
		
		for (int i = 0; i < l; i++) {
			studentsCopy[i] = new Student();
			studentsCopy[i] = mStudents[i];
		}
		
		return studentsCopy;
	}

	
	public double getmMinGrade() {
		return mMinGrade;
	}

	public double getmMaxGrade() {
		return mMaxGrade;
	}

	public double getmAvrGrade() {
		return mAvrGrade;
	}
	
	private void computeAvrGrade(){
		for (int i = 0; i < mStudents.length; i++) {
			mAvrGrade += mStudents[i].getAvrGrade();
			mAvrGrade /= mStudents.length;
		}
	}

	public void setmStudents(Student[] input) {
		int l = input.length;
		mStudents = new Student[l];
		
		for (int i = 0; i < input.length; i++) {
			if (input[i].getAvrGrade() >= 0 && input[i].getAvrGrade() <= 100) {
				mStudents[i] = new Student(input[i]);
				if (mStudents[i].getAvrGrade() > mMaxGrade) 
					mMaxGrade = mStudents[i].getAvrGrade();
				if (mStudents[i].getAvrGrade() < mMinGrade) 
					mMinGrade = mStudents[i].getAvrGrade();
			}
			else if (input[i].getAvrGrade()<0) {
				mStudents[i] =	new Student(input[i].getName(), input[i].getAddress(), 0.0);
				mMinGrade = 0.0;
			}
			else if (input[i].getAvrGrade() > 100) {
				mStudents[i] =	new Student(input[i].getName(), input[i].getAddress(), 100.0);
				mMaxGrade = 100.0;
			}
				
			}
		computeAvrGrade();
	}
	
	public void setStudent(Student _stud, int pos) {
		if (pos >= 0 && pos < mStudents.length) {
			mStudents[pos] = new Student(_stud);
			if (mStudents[pos].getAvrGrade() > mMaxGrade)
				mMaxGrade = mStudents[pos].getAvrGrade();
			if (mStudents[pos].getAvrGrade() < mMinGrade) 
				mMinGrade = mStudents[pos].getAvrGrade();
			computeAvrGrade();
		}
		
	}

	@Override
	public String toString() {
		String res = "";
		for (int i = 0; i < mStudents.length; i++)
			res += mStudents[i].toString() + ", ";
		
		res += mStudents.toString();
		
		
		
		return res;
	}
		
		
	
		
	
	
	
}
