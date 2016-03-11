package com.beeant.dao;

import com.beeant.common.base.IBaseDao;
import com.beeant.dto.AppRole;
import com.beeant.dto.AppRoleExample;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

@Repository
public interface AppRoleDao extends IBaseDao<AppRole, AppRoleExample> {
}