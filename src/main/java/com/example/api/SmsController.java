package com.example.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
public class SmsController {

    @GetMapping("/sms")
    public void sendSms() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://message.textware.lk:5001/sms/send_sms.php?username={username}&password={password}&src={src}&dst={dst}&msg={msg}&dr={dr}";
        Map<String, String> params = new HashMap<>();
        params.put("username", "zerocode");
        params.put("password", "LFnLtQZ1PLpjkMO");
        params.put("src", "BigHut");
        params.put("dst", "0716329281");
//        params.put("dst", "0764605086");
        params.put("msg", "hello");
        params.put("dr", "1");
        restTemplate.getForObject(url, String.class, params);
    }
}
