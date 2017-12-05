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
    private Socket socket;
    private BufferedReader br;
    private BufferedWriter bw;

    ServerThread(Socket socket) throws IOException {
        this.socket = socket;
        br = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
        bw = new BufferedWriter(new OutputStreamWriter(this.socket.getOutputStream()));
    }

    @Override
    public void run() {
        try(PrintWriter pw = new PrintWriter(bw, true)){
            String line;
            while ((line=br.readLine())!=null && !"".equals(line)){
                System.out.println("Accept message from client : " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public BufferedReader getBr() {
        return br;
    }

    public void setBr(BufferedReader br) {
        this.br = br;
    }

    public BufferedWriter getBw() {
        return bw;
    }

    public void setBw(BufferedWriter bw) {
        this.bw = bw;
    }
}
