package org.warnier.zhang.notes.mybatis3.generator.service;

import org.warnier.zhang.notes.mybatis3.generator.model.Link;

import java.util.List;
import java.util.Map;

public interface LinkService {
    List<Link> queryLinks();

    Link queryLink(Long linkId);

    Map<String, Object> searchLinks(String linkName, Integer pageIndex, Integer pageSize);
}
