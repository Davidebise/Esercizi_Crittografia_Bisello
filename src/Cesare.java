public class Cesare {
    static String Cifra(String message,int key){
        if(key<0) {
            throw new IllegalArgumentException("Chiave non valida!");
        }
        key=key%26;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);

            if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
                if (((ch <= 90 && (ch + key) > 90)) || (ch + key) > 122) {
                    result.append((char) ((ch + key) - 26));
                } else {
                    result.append((char) (ch + key));
                }
            } else {
                result.append((char)(ch + key));
            }
        }
        return result.toString();
    }

    static String Decifra(String message,int key){
        if(key<0) {
            throw new IllegalArgumentException("Chiave non valida!");
        }
        key=key%26;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);

            if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
                if (((ch <= 90 && (ch - key) < 65)) || (ch - key) < 97) {
                    result.append((char) ((ch - key) + 26));
                } else {
                    result.append((char) (ch - key));
                }
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
}
