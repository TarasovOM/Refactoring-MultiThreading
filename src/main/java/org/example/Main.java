package org.example;

import org.example.Server;

import java.io.BufferedOutputStream;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class Main {

    public static void main(String[] args) {

        Server server = new Server(64);

        server.addHandler("GET", "/messages", new Handler() {

        });
        server.addHandler("POST", "/messages", new Handler() {
            public void handle(Request request, BufferedOutputStream responseStream) {
                // TODO: handlers code
            }
        });

        server.listen(9999);
    }
}
}