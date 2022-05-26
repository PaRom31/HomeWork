package Level_2.Lesson6;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;


public class SimpleSingleThreadConsoleTCPServer {
    private static final int PORT = 8189;

    private List<Connector> connectors;

    public SimpleSingleThreadConsoleTCPServer (){this.connectors = new ArrayList<>();}

    public static void main(String[] args) {
        new SimpleSingleThreadConsoleTCPServer().start();
    }

    private void start() {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Server started");
            while (true) {
                System.out.println("Waiting for connect....");
                Socket socket = serverSocket.accept();
                System.out.println("Client connected");
                Connector connector = new Connector(socket, this);
                connectors.add(connector);
                connector.connect();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void broadcast(String massage) {
        for (Connector connector : connectors) {
            connector.send(massage);
        }
    }



}

