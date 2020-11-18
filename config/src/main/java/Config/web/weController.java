package Config.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @创建人：京城川少
 * @创建时间：2019/7/9
 * @描述
 */
@RestController
@RefreshScope
public class weController {

    @Value("${test.u1}")
    private String testu1;

    @RequestMapping("config")
    public String testConfig(){
        System.out.println("=======config======="+testu1);
        return testu1;
    }
    @RequestMapping("config1")
    public String testConfig1(){
        System.out.println("=========健康检查========");
        return testu1;
    }

}
