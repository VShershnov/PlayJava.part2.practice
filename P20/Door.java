package part2.practice.P20;

public class Door {
	boolean dIsOpened = false;
		
		public void open(){
			dIsOpened = true;
		}
		
		public void close(){
			dIsOpened = false;
		}
	
		@Override
		public String toString() {
			if (dIsOpened)
				return ("Двері відкриті");
			else 
				return ("Двері закриті");
	}
	
}

