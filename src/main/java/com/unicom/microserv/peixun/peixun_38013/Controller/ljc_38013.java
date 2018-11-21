package com.unicom.microserv.peixun.peixun_38013.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>描述: </p>
 * <p>备注: </p>
 * <p>作者: </p>
 *
 * @param
 * @return
 */
@RestController
public class ljc_38013 {
    @GetMapping("/peixun/38013")
    public String vv() {
        return "hello 38013";
    }

    @GetMapping("/peixun/38013/{v1}/{v2}")
    public String vv2(@PathVariable String v1,
                      @PathVariable String v2,
                      @RequestParam(value = "p", defaultValue = "1") String p) {
        return "hello 38013" + v1 + "/" + v2 + "?p==" + p;
    }
}
