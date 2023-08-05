package com.data;

import com.model.DBEntry;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class MongoDatabse {
    private final ReactiveMongoTemplate mongoTemplate;

    public MongoDatabse(ReactiveMongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    public Mono<Void> save(DBEntry setup) {
        return mongoTemplate.save(setup)
                .then();
    }
}
