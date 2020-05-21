package com.mmr.rabbitmq.util;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class ConnectionUtils {

    public static Connection getConnection() throws IOException, TimeoutException {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        //设置服务器地址
        connectionFactory.setHost("127.0.0.1");
        connectionFactory.setPort(5672);
    //设置vhost
        connectionFactory.setVirtualHost("/vhost_mmr");

        //
        connectionFactory.setUsername("user_mmr");
        connectionFactory.setPassword("123");
        return connectionFactory.newConnection();
    }
}
