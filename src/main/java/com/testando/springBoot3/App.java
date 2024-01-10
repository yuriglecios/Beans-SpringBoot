package com.testando.springBoot3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        Livro livro = factory.getBean(Livro.class);
        livro.setNome("Testando");
        livro.setCodigo("1");

        Autor autor = factory.getBean(Autor.class);
        autor.setNomeAutor("Yuri Glecios");

        livro.exibir();

    }

}
