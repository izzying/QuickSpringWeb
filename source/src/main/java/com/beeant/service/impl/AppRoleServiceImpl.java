package com.beeant.service.impl;

import com.beeant.common.base.BaseServiceImpl;
import com.beeant.common.base.IBaseDao;
import com.beeant.dao.AppRoleDao;
import com.beeant.dto.AppRole;
import com.beeant.dto.AppRoleExample;
import com.beeant.service.IAppRoleService;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("AppRoleServiceImpl")
public class AppRoleServiceImpl extends BaseServiceImpl<AppRole, AppRoleExample> implements IAppRoleService {
    @Autowired
    private AppRoleDao appRoleDao;

    @Override
    public IBaseDao<AppRole, AppRoleExample> getDao() {
        return this.appRoleDao;
    }

    @Override
    public void setKey(AppRole record) {
        if(record.getId() == null || "".equals(record.getId())) {
            record.setId(UUID.randomUUID().toString());
        }
    }
}