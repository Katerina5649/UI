

public static class Word {

    public static boolean IsReshuffle(String word1, String word2) {
        int i;
        int j;
        if (word1.length() != word2.length())
            return false;
        for (i = 0; i < word1.length(); i++) {
            for (j = 0; j < word2.length(); j++)
                if (word1.charAt(i) == word2.charAt(j))
                    word2 = removeCharAt(word2, j);
        }
        if (word2 == "")
            return true;
        return false;

    }
        public static String removeCharAt (String s,int pos){
            String c = "";
            return s.substring(0, pos) + c + s.substring(pos + 1);

        }


