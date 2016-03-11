package com.beeant.mvc.controller;

import com.beeant.common.Message;
import com.beeant.common.base.BaseController;
import com.beeant.common.base.IBaseService;
import com.beeant.common.utils.DataTables;
import com.beeant.dto.AppUserRole;
import com.beeant.dto.AppUserRoleExample;
import com.beeant.service.IAppUserRoleService;
import java.util.List;
import org.apache.ibatis.session.RowBounds;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("appUserRole")
public class AppUserRoleController extends BaseController<AppUserRole, AppUserRoleExample> {
    @Autowired
    private IAppUserRoleService appUserRoleService;

    @Override
    public String getBasePath() {
        return "appUserRole/";
    }

    @Override
    public IBaseService<AppUserRole, AppUserRoleExample> getService() {
        return this.appUserRoleService;
    }

    @Override
    public AppUserRoleExample getExample() {
        return new AppUserRoleExample();
    }

    @Override
    @RequiresPermissions("appUserRole:create:*")
    public ModelAndView create(AppUserRole record, Model model) {
         return super.create(record, model);
    }

    @Override
    @RequiresPermissions("appUserRole:delete:*")
    public ModelAndView delete(@RequestParam String key, Model model) {
        return super.delete(key, model);
    }

    @Override
    @RequiresPermissions("appUserRole:edit:*")
    public ModelAndView edit(@RequestParam String key, AppUserRole record, Model model) {
        return super.edit(key, record, model);
    }

    @Override
    @RequiresPermissions("appUserRole:view:*")
    public ModelAndView view(@RequestParam String key, Model model) {
        return super.view(key, model);
    }

    @Override
    @RequiresPermissions("appUserRole:browse:*")
    public ModelAndView browse(AppUserRole record, DataTables<AppUserRole> pager) {
        return super.browse(record, pager);
    }
}