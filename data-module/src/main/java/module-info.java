module data.module {
    requires model.module;
    requires reactor.core;
    requires spring.data.mongodb;
    requires spring.context;

    requires spring.core;
    requires spring.beans;
    requires spring.boot;
    requires spring.web;
    requires spring.boot.autoconfigure;

    opens com.data;
}