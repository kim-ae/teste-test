package br.com.kimae.testetest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StrategyService {

    @Autowired
    private List<Strategy> strategies;

    public void execute(){
        strategies.stream().forEach((s) -> s.execute());
    }

}
