package GRPCServer;
import DataService.DataService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GRPCServer {
    public static void main(String[] args) throws IOException, InterruptedException {

        Server server = ServerBuilder.forPort(5252).addService(new DataService()).build();
        server.start();
        System.out.println("service started");
        server.awaitTermination();
    }
}
