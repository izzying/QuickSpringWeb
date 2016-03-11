package com.beeant.mvc.controller;

import com.beeant.common.Message;
import com.beeant.common.base.BaseController;
import com.beeant.common.base.IBaseService;
import com.beeant.common.utils.DataTables;
import com.beeant.dto.AppRole;
import com.beeant.dto.AppRoleExample;
import com.beeant.service.IAppRoleService;
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
@RequestMapping("appRole")
public class AppRoleController extends BaseController<AppRole, AppRoleExample> {
    @Autowired
    private IAppRoleService appRoleService;

    @Override
    public String getBasePath() {
        return "appRole/";
    }

    @Override
    public IBaseService<AppRole, AppRoleExample> getService() {
        return this.appRoleService;
    }

    @Override
    public AppRoleExample getExample() {
        return new AppRoleExample();
    }

    @Override
    @RequiresPermissions("appRole:create:*")
    public ModelAndView create(AppRole record, Model model) {
         return super.create(record, model);
    }

    @Override
    @RequiresPermissions("appRole:delete:*")
    public ModelAndView delete(@RequestParam String key, Model model) {
        return super.delete(key, model);
    }

    @Override
    @RequiresPermissions("appRole:edit:*")
    public ModelAndView edit(@RequestParam String key, AppRole record, Model model) {
        return super.edit(key, record, model);
    }

    @Override
    @RequiresPermissions("appRole:view:*")
    public ModelAndView view(@RequestParam String key, Model model) {
        return super.view(key, model);
    }

    @Override
    @RequiresPermissions("appRole:browse:*")
    public ModelAndView browse(AppRole record, DataTables<AppRole> pager) {
        return super.browse(record, pager);
    }
}