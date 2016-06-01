package part2.practice.wordcount;

public class WordsCollection {
	
	private Word[] wordsCollection = new Word[10];
	private int totalCount =0;
	private int count = 0;
	
	public void addWord(String inputWord){
		totalCount++;
		Word word = findWord(inputWord);
		if (word==null){
			putWord(inputWord);
		}else{
			word.addWord();
		}
	}

	private void putWord(String inputWord) {
		if (count>=wordsCollection.length)
			resizeArray(wordsCollection.length*2);
		wordsCollection[count++]=new Word(inputWord);
	}

	private void resizeArray(int n) {
		Word[] temp = new Word[n];
		for(int i=0;i<wordsCollection.length&&i<n;i++)
			temp[i]=wordsCollection[i];
		wordsCollection=temp;
	}

	private Word findWord(String word) {
		for (int i=0;i<count;i++)
			if (wordsCollection[i].getWord().equals(word))
				return wordsCollection[i];
		return null;
	}
	
	public String toString(){
		StringBuilder res = new StringBuilder();
		res.append("Total words: ").append(totalCount).append("\n");
		for (int i=0;i<count;i++)
			res.append(wordsCollection[i]).append("\n");
		return res.toString();
	}

}
