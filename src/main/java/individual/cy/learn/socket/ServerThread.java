package individual.cy.learn.socket;

import java.io.*;
import java.net.Socket;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: mystic
 * @date: 2017/12/5 13:57
 * @since: JDK9.0.1
 * @version: X
 * Description:
 */
public class ServerThread implements Runnable {
    private BufferedReader br;
    private BufferedWriter bw;

    ServerThread(Socket socket) throws IOException {
        br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
    }

    @Override
    public void run() {
        try (PrintWriter pw = new PrintWriter(bw, true)) {
            String line;
            while ((line = br.readLine()) != null && !"".equals(line)) {
                System.out.println("Accept message from client : " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
