package individual.cy.learn.socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author mystic
 * @version X
 * Description:
 * @date 2017/12/5 14:56
 * @since JDK9.0.1
 */
public class Client {
    public static void main(String[] args) throws IOException {
        try (
                Socket client = new Socket("localhost", 10010);
                Scanner scanner = new Scanner(System.in);
                PrintWriter output =
                        new PrintWriter(client.getOutputStream(), true)
        ) {
            String words;
            while (scanner.hasNext()) {
                words = scanner.nextLine();
                output.println(words);
                System.out.println("Send message to server : " + words);
            }
        }
    }
}
