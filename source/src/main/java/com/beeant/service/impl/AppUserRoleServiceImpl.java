package com.beeant.service.impl;

import com.beeant.common.base.BaseServiceImpl;
import com.beeant.common.base.IBaseDao;
import com.beeant.dao.AppUserRoleDao;
import com.beeant.dto.AppUserRole;
import com.beeant.dto.AppUserRoleExample;
import com.beeant.service.IAppUserRoleService;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("AppUserRoleServiceImpl")
public class AppUserRoleServiceImpl extends BaseServiceImpl<AppUserRole, AppUserRoleExample> implements IAppUserRoleService {
    @Autowired
    private AppUserRoleDao appUserRoleDao;

    @Override
    public IBaseDao<AppUserRole, AppUserRoleExample> getDao() {
        return this.appUserRoleDao;
    }

    @Override
    public void setKey(AppUserRole record) {
        if(record.getUserRoleId() == null || "".equals(record.getUserRoleId())) {
            record.setUserRoleId(UUID.randomUUID().toString());
        }
    }
}