package com.sicnu.mapper;

import com.sicnu.pojo.Settings;

public interface SettingsMapper {

    Settings findOneByKey(String key);

    void addSetting(Settings settings);
}
