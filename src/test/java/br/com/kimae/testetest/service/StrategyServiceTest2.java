package br.com.kimae.testetest.service;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.test.util.ReflectionTestUtils;

@RunWith(MockitoJUnitRunner.class)
public class StrategyServiceTest2 {


    @InjectMocks
    private StrategyService service;

    private List<Strategy> strategies = new ArrayList<>();

    @Mock
    private Strategy s1;
    @Mock
    private Strategy s2;

    @Before
    public void setup(){
        strategies = Arrays.asList(s1,s2);

        ReflectionTestUtils.setField(service, "strategies", strategies);
    }

    @Test
    public void test(){

        service.execute();

        verify(s1).execute();
        verify(s2).execute();
    }
}
