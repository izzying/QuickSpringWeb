package com.beeant.service.impl;

import com.beeant.common.base.BaseServiceImpl;
import com.beeant.common.base.IBaseDao;
import com.beeant.dao.AppUserDao;
import com.beeant.dto.AppUser;
import com.beeant.dto.AppUserExample;
import com.beeant.service.IAppUserService;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("AppUserServiceImpl")
public class AppUserServiceImpl extends BaseServiceImpl<AppUser, AppUserExample> implements IAppUserService {
    @Autowired
    private AppUserDao appUserDao;

    @Override
    public IBaseDao<AppUser, AppUserExample> getDao() {
        return this.appUserDao;
    }

    @Override
    public void setKey(AppUser record) {
        if(record.getUserId() == null || "".equals(record.getUserId())) {
            record.setUserId(UUID.randomUUID().toString());
        }
    }
}