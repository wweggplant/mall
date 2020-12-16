package com.wangjojo.mymall.dao;

import com.wangjojo.mymall.mbg.model.UmsPermission;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UmsAdminRoleRelationDao {
    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);
}
