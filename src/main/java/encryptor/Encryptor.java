package encryptor;

public abstract class Encryptor {

    public String encrypt(String text) {
        // Template pattern
        StringBuilder builder = new StringBuilder(text);
        builder.reverse();

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < builder.length(); i++) {
            // TODO: Creo que aqui tengo que analizar primero la letra en la que estoy
            char aChar = builder.charAt(i);
            result.append(encrypt(aChar));
        }

        return result.toString();
    }

    protected abstract String encrypt(Character aChar);

}
