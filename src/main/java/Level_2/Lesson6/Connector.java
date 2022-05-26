package Level_2.Lesson6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Connector {
    private Socket socket;
    private DataInputStream in;
    private DataOutputStream out;
    private Thread connectThread;
    private SimpleSingleThreadConsoleTCPServer server;

    public Connector(Socket socket, SimpleSingleThreadConsoleTCPServer server) {
        try {
            this.socket = socket;
            this.server = server;
            this.in = new DataInputStream(socket.getInputStream());
            this.out = new DataOutputStream(socket.getOutputStream());
            System.out.println("New connection");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public void connect(){
        connectThread = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted() && socket.isConnected()) {
                try {
                    String massage = in.readUTF();
                    server.broadcast(massage);
                    System.out.println(massage);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        });
        connectThread.start();
    }
    public void send(String msg) {
        try{
            out.writeUTF(msg);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
