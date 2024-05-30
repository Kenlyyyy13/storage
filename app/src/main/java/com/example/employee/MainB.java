package com.example.employee;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

public class MainB {
    private static final String CONNECTION_STRING = "<mongodb+srv://RoamRanger:bhielatt@roamranger.gqcfv8t.mongodb.net/\n" +
            "\n>";

    public static MongoClient getMongoClient() {
        return MongoClients.create(CONNECTION_STRING);
    }
}
