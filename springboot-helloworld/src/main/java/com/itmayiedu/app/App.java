
package com.itmayiedu.app;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = { "com.itmayiedu.yml.controller" })
// @EnableJpaRepositories("com.itmayiedu.dao")
@EnableAutoConfiguration
// @EntityScan("com.itmayiedu.entity")

public class App {

	public static void main(String[] args) {
		// 主函数运行springboot项目
		SpringApplication.run(App.class, args);
	}

}
