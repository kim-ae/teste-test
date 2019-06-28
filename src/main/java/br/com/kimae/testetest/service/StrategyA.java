package br.com.kimae.testetest.service;

import org.springframework.stereotype.Component;

@Component
public class StrategyA implements Strategy {

    @Override
    public void execute() {
        System.out.println("StrategyA");
    }
}
