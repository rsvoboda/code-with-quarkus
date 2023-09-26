package org.acme;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class Main {
    void main() {
        System.out.println("==> Running main method");
        Quarkus.run();
    }
}