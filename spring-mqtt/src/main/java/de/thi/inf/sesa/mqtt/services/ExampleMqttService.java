package de.thi.inf.sesa.mqtt.services;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class ExampleMqttService {

    @Value("${mqtt.topic}")
    private String topic;
    @Value("${mqtt.broker}")
    private String broker;
    @Value("${mqtt.client}")
    private String clientId;

    private MqttClient client;

    @PostConstruct
    public void init() {
        MemoryPersistence persistence = new MemoryPersistence();
        try {
            client = new MqttClient(broker, clientId, persistence);
            MqttConnectOptions connOps = new MqttConnectOptions();
            connOps.setCleanSession(true);

            System.out.println("Try to connect");
            client.connect(connOps);
            System.out.println("Connected");
        } catch (MqttException e) {
            e.printStackTrace();
        }
    }

    public void publish(int qos, String content) {
        MqttMessage message = new MqttMessage(content.getBytes());
        message.setQos(qos);
        try {
            client.publish(topic, message);
        } catch (MqttException e) {
            e.printStackTrace();
        }
    }

    public void publish(String content) {
        this.publish(2, content);
    }

}
