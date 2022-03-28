package fr.lernejo.navy_battle;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;

public class Launcher
{
    public static void main(String[] args)
    {
        int port;
        if (args.length < 1) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter a port : ");
            port = scan.nextInt();
            scan.close();
        }
        else
            {
                port = Integer.parseInt(args[0]);
            }
        final Map<String, String> gameSetting = new HashMap<String, String>();
        gameSetting.put("id", UUID.randomUUID().toString());
        gameSetting.put("port", String.valueOf(port));

        Server server = new Server(port, gameSetting);
        if (args.length == 2) {
            Client.start(args[1], gameSetting);
        }
        server.start();
    }
}
