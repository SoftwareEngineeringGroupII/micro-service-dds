package com.sicnu.utils;

import com.sicnu.client.RoleAuthorityClient;
import com.sicnu.pojo.Authorities;

import java.util.Iterator;
import java.util.List;

public class AuthorityTreeUtils {

    public static void getChildrenToMenu(RoleAuthorityClient roleAuthorityMapper, Authorities authorities) {
        List<Authorities> children = roleAuthorityMapper.findChildrenByParentId(authorities.getId());
        authorities.setChildren(children);
        for (Authorities child : children) {
            getChildrenToMenu(roleAuthorityMapper,child);
        }
    }

    public static void getSpecialChildrenToMenu(RoleAuthorityClient roleAuthorityMapper, Authorities authorities, List<String> authorityIds) {
        List<Authorities> children = roleAuthorityMapper.findChildrenByParentId(authorities.getId());
        Iterator<Authorities> iterator = children.iterator();
        while (iterator.hasNext()) {
            Authorities next = iterator.next();
            //如果权限表里面没有这个权限，就移除
            if (!authorityIds.contains(next.getId())) {
                iterator.remove();
            }
        }
        authorities.setChildren(children);
        for (Authorities child : children) {
            getChildrenToMenu(roleAuthorityMapper,child);
        }
    }

}
