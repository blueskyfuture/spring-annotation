package com.blueskyfuture.ImportBeanDefinitionRegistrar;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(MapperAutoConfiguredMyBatisRegistrar.class)
public class MapperAutoConfig {
}
