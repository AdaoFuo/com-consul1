package Config.tinterfae;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * @创建人：京城川少
 * @创建时间：2019/7/9
 * @描述
 */
@FeignClient(name = "server2")
@Component
@RequestMapping("server2")
public interface tinterface {

    @RequestMapping("test02")
    List<Map<String,Object>> ttttt(@RequestParam("map")Map<String,Object>map);

}
