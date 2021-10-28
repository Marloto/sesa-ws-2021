import com.google.protobuf.InvalidProtocolBufferException;
import de.thi.inf.sesa.simplegrpc.HelloRequest;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        HelloRequest.Builder builder = HelloRequest.newBuilder();
        builder.setFirstName("Ich");
        builder.setLastName("Sonstwas");

        HelloRequest build = builder.build();
        byte[] bytes = build.toByteArray();
        System.out.println(Arrays.toString(bytes));

        //... fancy things happens...

        try {
            HelloRequest helloRequest2 = HelloRequest.parseFrom(bytes);
            System.out.println(helloRequest2.getFirstName());
            System.out.println(helloRequest2.getLastName());
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }
    }
}
