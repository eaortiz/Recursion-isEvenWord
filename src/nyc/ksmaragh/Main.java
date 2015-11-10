package nyc.ksmaragh;

public class Main
{

    public static void main(String[] args)
    {

        System.out.println("Is 'abacbc' even ? " + isEvenWord("abacbc"));
        System.out.println("Is 'appeases' even ? " + isEvenWord("appeases"));
        System.out.println("Is 'tattletale' even ? " + isEvenWord("tattletale"));
        System.out.println("Is 'apbelases' even ? " + isEvenWord("apbelases"));
        System.out.println("Is a null value even ? " + isEvenWord(null));

    }

    public static boolean isEvenWord(String word)
    {
        // good check
        if(word == null){
            return false;
        }

        if(word.isEmpty())
        {
            return true;
        }

        String firstChar = String.valueOf(word.charAt(0));
        String newWord = word.substring(1);

        if(newWord.contains(firstChar))
        {
            newWord = newWord.replaceFirst(firstChar, "");
            return isEvenWord(newWord); // this makes a lot more semantic sense here and although the result will be the same this makes a huge difference when reading and adding on to the code
        }
        else{
            return false;
        }
    }
    // I like how clean and consice this is and your test cases
}
