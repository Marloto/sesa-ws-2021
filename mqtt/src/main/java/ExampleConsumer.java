import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

import java.io.IOException;

public class ExampleConsumer {
    public static void main(String[] args) {
        String topic = "example";
        String broker = "tcp://10.30.97.247:1883"; // 10.30.97.247

        String clientId = "ExampleServerSeb";

        MemoryPersistence persistence = new MemoryPersistence();
        try {
            MqttClient client = new MqttClient(broker, clientId, persistence);
            MqttConnectOptions connOps = new MqttConnectOptions();
            connOps.setCleanSession(true);

            System.out.println("Try to connect");
            client.connect(connOps);
            System.out.println("Connected");

            // Lambda?

            client.subscribe(topic, (realTopic, msg) -> {
                System.out.println(msg);
            });

            System.in.read();

            client.disconnect();
            System.out.println("Disconnected");

        } catch (MqttException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
