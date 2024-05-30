package com.example.employee;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class MainC {
    public static void insertDocument() {
        MongoClient mongoClient = MainB.getMongoClient();
        MongoDatabase database = mongoClient.getDatabase("RoamRanger");
        MongoCollection<Document> collection = database.getCollection("Patrol_Data");

        Document document = new Document("name", "John Doe")
                .append("email", "johndoe@example.com")
                .append("age", 30);

        collection.insertOne(document);

        mongoClient.close();
    }
}

