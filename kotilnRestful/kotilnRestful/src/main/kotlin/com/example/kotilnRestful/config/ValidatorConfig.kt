package com.example.kotilnRestful.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean


@Configuration
class ValidatorConfig {

    @Bean
    fun validator():LocalValidatorFactoryBean{
        return LocalValidatorFactoryBean()
    }
}