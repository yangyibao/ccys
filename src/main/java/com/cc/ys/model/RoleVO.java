package com.cc.ys.model;

import java.util.List;

public class RoleVO {
    private Integer roleId;

    private String roleName;

    private String roleExt1;

    private String roleExt2;

    private String roleExt3;

    private List<PermissionVO> permissionVOList;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleExt1() {
        return roleExt1;
    }

    public void setRoleExt1(String roleExt1) {
        this.roleExt1 = roleExt1 == null ? null : roleExt1.trim();
    }

    public String getRoleExt2() {
        return roleExt2;
    }

    public void setRoleExt2(String roleExt2) {
        this.roleExt2 = roleExt2 == null ? null : roleExt2.trim();
    }

    public String getRoleExt3() {
        return roleExt3;
    }

    public void setRoleExt3(String roleExt3) {
        this.roleExt3 = roleExt3 == null ? null : roleExt3.trim();
    }

    public List<PermissionVO> getPermissionVOList() {
        return permissionVOList;
    }

    public void setPermissionVOList(List<PermissionVO> permissionVOList) {
        this.permissionVOList = permissionVOList;
    }
}