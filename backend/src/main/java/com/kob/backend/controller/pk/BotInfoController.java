package com.kob.backend.controller.pk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author: KaiyanWang
 * @version: 1.0
 * @DateTime: 2025-11-23 19:13
 */
@RestController
@RequestMapping("/pk/")
public class BotInfoController {
    @RequestMapping("getbotinfo/")
    public List<Map<String, String>> getBotInfo() {
        List<Map<String, String>> list = new LinkedList<>();
        Map<String, String> bot1 = new HashMap<>();
        Map<String, String> bot2 = new HashMap<>();
        bot1.put("name", "bot1");
        bot1.put("rating", "1800");
        bot2.put("name", "bot2");
        bot2.put("rating", "1900");
        list.add(bot1);
        list.add(bot2);
        return list;
    }
}
