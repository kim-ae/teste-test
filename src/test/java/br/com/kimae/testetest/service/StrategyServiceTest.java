package br.com.kimae.testetest.service;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.stream.Stream;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class StrategyServiceTest {

    @InjectMocks
    private StrategyService service;

    @Mock
    private List<Strategy> strategies;

    @Test
    public void test(){
        final Strategy s1 = mock(Strategy.class);
        final Strategy s2 = mock(Strategy.class);
        when(strategies.stream()).thenReturn(Stream.of(s1,s2));

        service.execute();

        verify(s1).execute();
        verify(s2).execute();
    }
}