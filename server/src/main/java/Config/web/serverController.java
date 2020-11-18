package Config.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import Config.tinterfae.tinterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @创建人：京城川少
 * @创建时间：2019/7/9
 * @描述
 */
@RestController
@RequestMapping("server1")
public class serverController {

    @Autowired
    private tinterface tinterface;

    @RequestMapping(value = "test01")
    public List<Map<String,Object>> test01(){
        System.out.println("===============");

        Map<String,Object> map = new HashMap<>();
        map.put("5555", "hhhhhhhhhhhhhhh");
        List<Map<String,Object>> ttttt = tinterface.ttttt(map);
        return ttttt;
    }

}
