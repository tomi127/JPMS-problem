module model.module {
    requires reactor.core;
    requires spring.data.mongodb;
    requires spring.context;

    exports com.model;
    opens com.model;
}