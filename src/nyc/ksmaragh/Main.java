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
        }
        else{
            return false;
        }

        return isEvenWord(newWord);
    }

}
