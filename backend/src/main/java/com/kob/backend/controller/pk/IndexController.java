package com.kob.backend.controller.pk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: KaiyanWang
 * @version: 1.0
 * @DateTime: 2025-11-23 13:28
 */

@Controller
@RequestMapping("/pk/")
public class IndexController {
    @RequestMapping("index/")
    public String index() {
        return "pk/index.html";
    }
}
