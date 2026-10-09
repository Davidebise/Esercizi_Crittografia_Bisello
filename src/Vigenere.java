public class Vigenere {
    static String Cifra(String message,String key){
        int[] v=new int[key.length()];
        for(int i=0;i<key.length();i++){
            v[i]=(int)(key.charAt(i) % 26);
        }
        StringBuilder result = new StringBuilder();
        char ch;
        int actualKey;
        for (int i = 0; i < message.length(); i++) {
            ch = message.charAt(i);
            actualKey = v[i%v.length];
            if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
                if (((ch <= 90 && (ch + actualKey ) > 90)) || (ch + actualKey) > 122) {
                    result.append((char) ((ch + actualKey) - 26));
                } else {
                    result.append((char) (ch + actualKey));
                }
            } else {
                result.append((char)(ch + actualKey));
            }
        }
        return result.toString();
    }

    static String Decifra(String message,String key){
        int[] v=new int[key.length()];
        for(int i=0;i<key.length();i++){
            v[i]=(int)(key.charAt(i) % 26);
        }
        StringBuilder result = new StringBuilder();
        char ch;
        int actualKey;

        for (int i = 0; i < message.length(); i++) {
            ch = message.charAt(i);
            actualKey = v[i%v.length];

            if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
                if (((ch <= 90 && (ch - actualKey) < 65)) || (ch - actualKey) < 97) {
                    result.append((char) ((ch - actualKey) + 26));
                } else {
                    result.append((char) (ch - actualKey));
                }
            } else {
                result.append((char)(ch - actualKey));
            }
        }
        return result.toString();
    }
}
