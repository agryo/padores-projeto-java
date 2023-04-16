package com.dio.projeto.singleton;

/**
 * Singleton "Apressado"
 *
 * @author agryo
 */
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();
    private SingletonEager(){
        super();
    }
    public static SingletonEager getInstancia(){
        return instancia;
    }
}
