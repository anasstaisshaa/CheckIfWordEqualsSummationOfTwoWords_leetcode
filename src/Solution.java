class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int sumF =0;
        int sumS = 0;
        int sumT = 0;

        for(int i = 0; i < firstWord.length(); i++){
            sumF += firstWord.charAt(i)-'a';
            sumF*=10;
        }

        for(int i = 0; i < secondWord.length(); i++){
            sumS += secondWord.charAt(i)-'a';
            sumS*=10;
        }

        for(int i = 0; i < targetWord.length(); i++){
            sumT += targetWord.charAt(i)-'a';
            sumT*=10;
        }

        return (sumS+sumF) == sumT;
    }
}
