class TwelveDays{
    String verse(int verseNumber) {
     	String[] ordinalNumbers = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"};
     	String[] messages = {"a Partridge in a Pear Tree", "two Turtle Doves", "three French Hens", "four Calling Birds",
     						"five Gold Rings", "six Geese-a-Laying", "seven Swans-a-Swimming", "eight Maids-a-Milking",
     						"nine Ladies Dancing", "ten Lords-a-Leaping", "eleven Pipers Piping", "twelve Drummers Drumming"};
     	int number;					
     	String verse = "On the " + ordinalNumbers[verseNumber - 1] + " day of Christmas my true love gave to me: ";
     	if(verseNumber == 1){
     		return (verse + messages[0] + ".\n");
     	}    		
     	for(number = verseNumber - 1; number > 0; number--){
     		verse += messages[number] + ", ";
     	}
     	verse += "and " + messages[number] + ".\n";
     	return verse;
    }

    String verses(int startVerse, int endVerse) {
        String verses = "";
        int number;
        for(number = startVerse; number < endVerse; number++){
        	verses += verse(number) + "\n";
        }
        verses += verse(number);
        return verses;
    }
    
    String sing() {
        return verses(1,12);
    }
}