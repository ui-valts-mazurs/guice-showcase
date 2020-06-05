package com.ui.showcase.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Stage;

public class Main {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(Stage.PRODUCTION, new MainModule());
        injector.getInstance(Application.class)
                .demonstrate();
    }
}
