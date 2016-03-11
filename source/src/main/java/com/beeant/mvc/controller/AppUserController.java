package com.beeant.mvc.controller;

import com.beeant.common.Message;
import com.beeant.common.base.BaseController;
import com.beeant.common.base.IBaseService;
import com.beeant.common.utils.DataTables;
import com.beeant.dto.AppUser;
import com.beeant.dto.AppUserExample;
import com.beeant.service.IAppUserService;
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
@RequestMapping("appUser")
public class AppUserController extends BaseController<AppUser, AppUserExample> {
    @Autowired
    private IAppUserService appUserService;

    @Override
    public String getBasePath() {
        return "appUser/";
    }

    @Override
    public IBaseService<AppUser, AppUserExample> getService() {
        return this.appUserService;
    }

    @Override
    public AppUserExample getExample() {
        return new AppUserExample();
    }

    @Override
    @RequiresPermissions("appUser:create:*")
    public ModelAndView create(AppUser record, Model model) {
         return super.create(record, model);
    }

    @Override
    @RequiresPermissions("appUser:delete:*")
    public ModelAndView delete(@RequestParam String key, Model model) {
        return super.delete(key, model);
    }

    @Override
    @RequiresPermissions("appUser:edit:*")
    public ModelAndView edit(@RequestParam String key, AppUser record, Model model) {
        return super.edit(key, record, model);
    }

    @Override
    @RequiresPermissions("appUser:view:*")
    public ModelAndView view(@RequestParam String key, Model model) {
        return super.view(key, model);
    }

    @Override
    @RequiresPermissions("appUser:browse:*")
    public ModelAndView browse(AppUser record, DataTables<AppUser> pager) {
        return super.browse(record, pager);
    }
}