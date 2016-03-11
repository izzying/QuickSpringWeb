package com.beeant.dao;

import com.beeant.common.base.IBaseDao;
import com.beeant.dto.AppUser;
import com.beeant.dto.AppUserExample;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserDao extends IBaseDao<AppUser, AppUserExample> {
}