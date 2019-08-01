package org.warnier.zhang.notes.mybatis3.generator.service.impl;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.warnier.zhang.notes.mybatis3.generator.dao.LinkMapper;
import org.warnier.zhang.notes.mybatis3.generator.model.Link;
import org.warnier.zhang.notes.mybatis3.generator.model.LinkExample;
import org.warnier.zhang.notes.mybatis3.generator.service.LinkService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class LinkServiceImpl implements LinkService {
    @Autowired
    private LinkMapper linkMapper;

    @Override
    public List<Link> queryLinks() {
        return linkMapper.selectByExample(null);
    }

    @Override
    public Link queryLink(Long linkId) {
        return linkMapper.selectByPrimaryKey(linkId);
    }

    @Override
    public Map<String, Object> searchLinks(String linkName, Integer pageIndex, Integer pageSize) {
        Map<String, Object> msg = new HashMap<>();

        LinkExample linkExample = new LinkExample();
        if (linkName == null) {
            linkName = "%%";
        }
        linkExample.createCriteria()
                // LIKE - meaning the related column must be "like" the value passed in on the method call.
                // The code does not add the required '%', you must set that value yourself in the value you pass in on the method call.
                .andLinkNameLike("%" + linkName + "%")
                .andLinkAvailableEqualTo("Y");
        Long total = linkMapper.countByExample(linkExample);
        msg.put("total", total);

        if (pageIndex == null) {
            pageIndex = 0;
        }
        if (pageSize == null) {
            pageSize = 10;
        }
        Integer offset = pageIndex * pageSize;
        Integer limit = pageSize;
        List<Link> data = linkMapper.selectByExampleWithRowbounds(linkExample, new RowBounds(offset, limit));
        msg.put("data", data);
        return msg;
    }
}
