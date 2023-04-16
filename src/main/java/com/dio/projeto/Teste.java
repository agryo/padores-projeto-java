package com.dio.projeto;

import javax.sound.midi.Soundbank;
import java.util.Timer;

public class Teste {
    public static void main(String[] args) {
        //Testes relacionados aos Singletons

        SingletonLazy preguicoso = SingletonLazy.getInstancia();
        System.out.println(preguicoso);
        preguicoso = SingletonLazy.getInstancia();
        System.out.println(preguicoso);

        SingletonEager apressado = SingletonEager.getInstancia();
        System.out.println(apressado);
        apressado = SingletonEager.getInstancia();
        System.out.println(apressado);

        SingletonLazyHolder titular = SingletonLazyHolder.getInstancia();
        System.out.println(titular);
        titular = SingletonLazyHolder.getInstancia();
        System.out.println(titular);
    }
}
