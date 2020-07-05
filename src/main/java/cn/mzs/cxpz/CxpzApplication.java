package cn.mzs.cxpz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("cn.mzs.cxpz.mapper")
@SpringBootApplication
public class CxpzApplication {

    public static void main(String[] args) {
        SpringApplication.run(CxpzApplication.class, args);
    }

}
