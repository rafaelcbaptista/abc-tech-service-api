package br.com.fiap.abctechservice.application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PropertiesComponentTests {

    @InjectMocks
    private PropertiesComponent propertiesComponent;


    @BeforeEach
    void setUp() {
        propertiesComponent = new PropertiesComponent();
    }

    @Test
    public void testingGetName() {
        Assertions.assertNotNull(propertiesComponent.getName());
        Assertions.assertEquals("abc-tech-service", propertiesComponent.getName());
    }

    @Test
    public void testingGetVersion() {
        Assertions.assertNotNull(propertiesComponent.getVersion());
    }

}