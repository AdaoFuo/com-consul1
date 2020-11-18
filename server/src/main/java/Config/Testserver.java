package Config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @创建人：京城川少
 * @创建时间：2019/7/9
 * @描述
 */
@SpringBootApplication
@RestController
@RequestMapping("service")
@EnableFeignClients
public class Testserver {

    public static void main(String[] args) {
        SpringApplication.run(Testserver.class, args);
    }
    @RequestMapping("health")
    public String testhealth(){
        System.out.println("=====进行检查====");
        return "ok";
    }

}
