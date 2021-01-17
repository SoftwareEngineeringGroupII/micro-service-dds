package com.sicnu.controller;

import com.sicnu.mapper.SettingsMapper;
import com.sicnu.pojo.Settings;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/SettingsMapper")
public class SettingsController {
    @Resource
    private SettingsMapper settingsMapper;

    @PostMapping("/findOneByKey")
    public Settings findOneByKey(@RequestParam("key") String key){
        return settingsMapper.findOneByKey(key);
    }
    @PostMapping("/addSetting")
    public int addSetting(@RequestParam("settings") Settings settings){
        return settingsMapper.addSetting(settings);
    }
}
