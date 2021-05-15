package com.example.blog

import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class BlogConfiguration {

    @Bean
    fun databaseInitializer(userRepository: UserRepository,
                            articleRepository: ArticleRepository) = ApplicationRunner {

        val smaldini = userRepository.save(User("smaldini", "Stéphane", "Maldini"))
        articleRepository.save(Article(
            title = "spring-boot-kotlin 실습",
            headLine = "실습해보다: ",
            content = "실습하는데 어렵네요",
            author = smaldini
        ))

        articleRepository.save(Article(
            title = "Reactor Aluminium has landed",
            headLine = "Lorem ipsum",
            content = "dolor sit amet",
            author = smaldini
        ))
    }
}