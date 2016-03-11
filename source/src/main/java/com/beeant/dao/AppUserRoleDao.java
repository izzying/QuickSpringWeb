package com.beeant.dao;

import com.beeant.common.base.IBaseDao;
import com.beeant.dto.AppUserRole;
import com.beeant.dto.AppUserRoleExample;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRoleDao extends IBaseDao<AppUserRole, AppUserRoleExample> {
}