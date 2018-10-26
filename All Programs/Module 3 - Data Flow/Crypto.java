// For this project you will be writing methods of encrypting and decrypting text.


import java.util.*;

public class Crypto {
    public static void main(String[] args){
        //take in string to be encrypted
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a string to be encrypted: ");
        String text = input.nextLine();
        System.out.print("Please enter an integer shift value: ");
        int key = input.nextInt();
        System.out.print("Please enter a code group size: ");
        int num = input.nextInt();

        System.out.print("Its cyphertext equivalent is : ");
        System.out.println(encryptString(text, key, num));
    }
    public static String normalizeText(String text){
        String normalizedText = "";
        for (int i = 0; i < text.length(); i++){
            if ((text.charAt(i) >= 65 && text.charAt(i) <= 90) || (text.charAt(i) >= 97 && text.charAt(i) <= 122))
                normalizedText += text.charAt(i);
        }

        normalizedText = normalizedText.toUpperCase();

        return normalizedText;
    }
    public static String obify(String normalizedText){
        String obifiedText = "";
        for (int i = 0; i < normalizedText.length(); i++){
            if (normalizedText.charAt(i) == 'A' || normalizedText.charAt(i) == 'E' || normalizedText.charAt(i) == 'I' || normalizedText.charAt(i) == 'O' || normalizedText.charAt(i) == 'U'|| normalizedText.charAt(i) == 'Y')
                obifiedText += "O" + "B" + normalizedText.charAt(i);
            else
                obifiedText += normalizedText.charAt(i);
        }

        return obifiedText;
    }
    public static String shiftAlphabet(int shift) {
        int start = 0;
        if (shift < 0) {
            start = (int) 'Z' + shift + 1;
        } else {
            start = 'A' + shift;
        }
        String result = "";
        char currChar = (char) start;
        for(; currChar <= 'Z'; ++currChar) {
            result = result + currChar;
        }
        if(result.length() < 26) {
            for(currChar = 'A'; result.length() < 26; ++currChar) {
                result = result + currChar;
            }
        }
        return result;
    }
    public static String ceasarify(String obifiedText, int key){

        String ceasarifiedText = "";
        for (int i = 0; i < obifiedText.length(); i++){
            ceasarifiedText += shiftAlphabet(key).charAt(obifiedText.charAt(i) - 'A');
        }

        return ceasarifiedText;
    }
    public static String groupify(String ceasarifiedText, int num){
        String groupifiedText = "";
        int blank = 0;
        if (ceasarifiedText.length() % num == 0)
            for (int i = 0; i < ceasarifiedText.length() - 1; i += num){
                for (int j = 0; j < num; j++){
                    groupifiedText += ceasarifiedText.charAt(i + j);
                }
                groupifiedText += " ";
            }
         else {
            for (int j = 0; j < ceasarifiedText.length() - 1; j += num){
                for (int i = 0; (i < num) && (j + i < ceasarifiedText.length()); i++){
                    groupifiedText += ceasarifiedText.charAt(j + i);
                }
                if ((groupifiedText.length() - blank) % num == 0) {
                    groupifiedText += " ";
                    blank++;
                }
            }
            while ((groupifiedText.length() - blank) % num != 0)
                groupifiedText += "x";
        }

        return groupifiedText;
    }
    public static String encryptString(String text, int key, int num){
        return groupify(ceasarify(obify(normalizeText(text)), key), num);
    }
}
