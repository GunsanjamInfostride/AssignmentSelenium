package CollectionInJava;

public class Replace_WordUsingString
{
	static String Word(String Sentence, String Pattern)
	{
		String[] word_list = Sentence.split("\\s+");
	      String my_result = "";
	      String asterisk_val = "";
	      for (int i = 0; i < Pattern.length(); i++)
	      asterisk_val += '*';
	      int my_index = 0;
	      for (String i : word_list){
	         if (i.compareTo(Pattern) == 0)
	            word_list[my_index] = asterisk_val;
	         my_index++;
	}
	      for (String i : word_list)
	          my_result += i + ' ';
	       return my_result;
	}
	public static void main(String[] args) 
	{
		  String Sentence = "Abc is very stupid person ";
	      String Pattern = "stupid";
	      System.out.println(Word(Sentence, Pattern));
	}

}
