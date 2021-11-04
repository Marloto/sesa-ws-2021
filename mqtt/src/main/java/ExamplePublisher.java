import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

public class ExamplePublisher {
    public static void main(String[] args) {
        String topic = "example";
        String broker = "tcp://10.30.97.247:1883"; // 10.30.97.247
        int qos = 2;
        String clientId = "ExampleClientSeb";

        MemoryPersistence persistence = new MemoryPersistence();
        try {
            MqttClient client = new MqttClient(broker, clientId, persistence);
            MqttConnectOptions connOps = new MqttConnectOptions();
            connOps.setCleanSession(true);

            System.out.println("Try to connect");
            client.connect(connOps);
            System.out.println("Connected");

            int i = 0;
            while(i ++ < 100) {

                String content = "Test " + System.currentTimeMillis();
                MqttMessage message = new MqttMessage(content.getBytes());
                message.setQos(qos);
                client.publish(topic, message);

                Thread.sleep(1000);
            }

            client.disconnect();
            System.out.println("Disconnected");

        } catch (MqttException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
