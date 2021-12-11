import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputData {
    public static String read() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите Ваш пример в формате число пробел знак пробел число.");
        String sConversation = null;
        try {
            sConversation = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sConversation;
}
}
