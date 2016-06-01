package part2.practice.wordcount;

public class Word {
	private String word;
	private int count;
	public Word(String word){
		this.word = word;
		count = 1;
	}
	
	public void addWord(){
		count++;
	}
	
	public String getWord(){
		return word;
	}
	
	public String toString(){
		return word+" - "+count;
	}

}
