package site.bigbear.tenancy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动程序
 * @author cheyantao
 */
@SpringBootApplication
@MapperScan("site.bigbear.tenancy.mapper")
public class TenancyApplication {
    public static void main(String[] args) {
        SpringApplication.run(TenancyApplication.class, args);
    }
}
