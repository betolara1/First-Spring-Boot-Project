// Classe para configurações de bibliotecas externas;
// Como configurar bancos de dados externos, como ORACLE, SQL Server, etc.
// Configurar AWS, Google Cloud, etc.


package com.ranetech.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfiguration {
    //@BEAN serve pra criar instancias de classes externas; 
    // que não são do Spring Boot, como por exemplo, a SDK do AWS;
    // outro exemplo uma classe de carros, que precisa chamar uma classe de tipo de carro;
    
    /*@Bean
     
    public Carro carro() {
        return new Carro();
    }

    public class SDKAWS sdkAWS() {
        return new SDKAWS();
        // essa classe SDKAWS é uma classe que não é do Spring Boot,
        // mas é uma classe que eu criei para configurar a SDK do AWS;
    }*/
}
