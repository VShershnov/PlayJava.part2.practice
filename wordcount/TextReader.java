package part2.practice.wordcount;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;

public class TextReader {
	
	private WordsCollection wordsCollection;
	
	public TextReader(){
		wordsCollection = new WordsCollection();
	}
	
	public void parseFile(String fileName) throws IOException{
		StreamTokenizer st = new StreamTokenizer(new BufferedReader(new FileReader(fileName)));
		while (st.nextToken()!=StreamTokenizer.TT_EOF) {
			switch (st.ttype) {
				case StreamTokenizer.TT_WORD : 
					wordsCollection.addWord(st.sval);
					break ;
			}
		}
	}
	
	public String toString(){
		StringBuilder res = new StringBuilder();
		res.append("Collection statistic:").append("\n");
		res.append(wordsCollection);
		return res.toString();
	}

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		String fileName;
		if (args.length!=1){
			fileName = "test.txt";
		}else{
			fileName = args[0];
		}
		TextReader textReader = new TextReader();
		textReader.parseFile(fileName);
		System.out.println(textReader);
	}

}
