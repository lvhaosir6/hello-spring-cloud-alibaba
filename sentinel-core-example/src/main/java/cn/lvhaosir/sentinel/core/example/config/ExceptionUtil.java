package cn.lvhaosir.sentinel.core.example.config;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @author lvhaosir 2020/3/22 17:54
 * @Description: TODO()
 * @Version v1.0
 **/
public class ExceptionUtil {

    public static String exHandler(BlockException ex) {
        return "exHandler error";
    }


    public static String exHandler(String type, BlockException ex) {
        return type + " exHandler error";
    }

}
