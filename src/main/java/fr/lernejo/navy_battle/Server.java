package fr.lernejo.navy_battle;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server
{
    private final Map<String, String> gameSetting;
    private final int port;

    public Server(int port, Map<String, String> gameSetting)
    {
        this.gameSetting = gameSetting;
        this.port = port;
    }

    public void start()
    {
        InetSocketAddress socketAddr = new InetSocketAddress(port);
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        try {
            HttpServer httpServer = HttpServer.create(socketAddr, 0);
            GameHandle GameHandle = new GameHandle(gameSetting);

            System.out.println("Server start at port : " + port);

            httpServer.setExecutor(executorService);

            httpServer.createContext("/ping", new ServerHandler());
            httpServer.createContext("/api/game/start", GameHandle);

            httpServer.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
