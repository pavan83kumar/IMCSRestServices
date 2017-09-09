package com.configurations;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(DAOConfig.class)

@Configuration
public class Config {

}
