package com.model;


import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collection = "test")
public record DBEntry(@MongoId String id, String value) {
}
