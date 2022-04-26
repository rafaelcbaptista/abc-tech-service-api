package br.com.fiap.abctechservice.application.impl;

import br.com.fiap.abctechservice.application.dto.OrderDto;
import br.com.fiap.abctechservice.application.dto.OrderLocationDto;
import br.com.fiap.abctechservice.service.OrderService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@SpringBootTest
public class OrderApplicationImplTest {

    @InjectMocks
    private OrderApplicationImpl orderApplication;

    @Mock
    private OrderService orderService;

    @Test
    public void test_create_success() {
        var locationDto = new OrderLocationDto(48.858906, 2.3120157, new Date());
        var orderDto = new OrderDto(123L, List.of(1L), locationDto, locationDto);

        assertDoesNotThrow(() -> orderApplication.createOrder(orderDto));
    }

}