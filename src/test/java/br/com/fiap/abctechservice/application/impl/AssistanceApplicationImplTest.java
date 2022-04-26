package br.com.fiap.abctechservice.application.impl;

import br.com.fiap.abctechservice.model.Assistance;
import br.com.fiap.abctechservice.service.AssistanceService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class AssistanceApplicationImplTest {

    @InjectMocks
    private AssistanceApplicationImpl assistanceApplication;

    @Mock
    private AssistanceService assistanceService;

    @BeforeEach
    public void init() {
        when(assistanceService.getAssistsList()).thenReturn((List.of(
                new Assistance(1L, "Teste 1", "Teste Description 1"),
                new Assistance(2L, "Teste 2", "Teste Description 2")
        )));
    }

    @Test
    public void test_list_success() {
        var list = assertDoesNotThrow(() -> assistanceApplication.getAssists());

        assertEquals(2, list.size());
    }
}