package encryptor;

public class AlgorithmEncrytor extends Encryptor {

    @Override
    protected String encrypt(Character aChar) {
        StringBuilder text = new StringBuilder ((char) (aChar + 2));
        return text.toString();
    }
}
