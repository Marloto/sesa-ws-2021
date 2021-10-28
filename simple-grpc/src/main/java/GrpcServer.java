import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GrpcServer {
    public static void main(String[] args) throws InterruptedException, IOException {
        Server build = ServerBuilder.forPort(8080).addService(new HelloServiceImpl()).build();

        build.start();
        build.awaitTermination();
    }
}
