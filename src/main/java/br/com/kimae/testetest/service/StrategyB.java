package br.com.kimae.testetest.service;

import org.springframework.stereotype.Component;

@Component
public class StrategyB implements Strategy {

    @Override
    public void execute() {
        System.out.println("StrategyB");
    }
}
