package com.dio.projeto;

import com.dio.projeto.facade.Facade;
import com.dio.projeto.singleton.*;
import com.dio.projeto.strategy.*;

public class Teste {
    public static void main(String[] args) {
        //Testes relacionados aos Singletons
        System.out.println("Testes do Singleton");
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

        //Testes relacionados ao Strategy
        System.out.println("\nTestes do Strategy");
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        //Testes relacionados ao Facade
        Facade facade = new Facade();
        facade.migrarCliente("Agryo", "59375000");
    }
}
