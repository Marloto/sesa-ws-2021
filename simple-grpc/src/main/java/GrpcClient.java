import de.thi.inf.sesa.simplegrpc.HelloRequest;
import de.thi.inf.sesa.simplegrpc.HelloResponse;
import de.thi.inf.sesa.simplegrpc.HelloServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080).usePlaintext().build();
        HelloServiceGrpc.HelloServiceBlockingStub stub = HelloServiceGrpc.newBlockingStub(channel);


        HelloRequest.Builder builder = HelloRequest.newBuilder();
        builder.setFirstName("Ich");
        builder.setLastName("Sonstwas");

        HelloRequest request = builder.build();

        HelloResponse hello = stub.hello(request);
        System.out.println(hello.getGreeting());
    }
}
