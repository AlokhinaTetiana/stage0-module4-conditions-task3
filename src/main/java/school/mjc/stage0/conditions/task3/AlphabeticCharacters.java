package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        int ch =(int)character;
        if (!(ch>64&&ch<=90 || ch>96&&ch<=122)){
            System.out.println("wrong alphabet!");
        }
        else if(character == 'a' || character == 'e' || character == 'i' ||
                character == 'o' || character == 'u' ||character == 'A' ||
                character == 'E' || character == 'I' ||
                character == 'O' || character == 'U' ){
            System.out.println("Vowel");}
        else{
            System.out.println("Consonant");}
    }
}
