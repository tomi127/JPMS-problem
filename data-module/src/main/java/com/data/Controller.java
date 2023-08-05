package com.data;

import com.model.DBEntry;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class Controller {
    private final MongoDatabse db;

    public Controller(MongoDatabse db) {
        this.db = db;
    }

    @PostMapping(path = "/storeInDB")
    public Mono<Void> storeInDB() {
        return db.save(new DBEntry(null, "test"));
    }
}
