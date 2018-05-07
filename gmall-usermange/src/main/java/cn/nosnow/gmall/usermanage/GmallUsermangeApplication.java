package cn.nosnow.gmall.usermanage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 只要该模块需要与数据库进行交互的，则需要在该类上增加注解@MapperScan
 */

@SpringBootApplication
@MapperScan(basePackages = "cn.nosnow.gmall.usermanage.mapper")
public class GmallUsermangeApplication {

	public static void main(String[] args) {
		SpringApplication.run(GmallUsermangeApplication.class, args);
	}
}
