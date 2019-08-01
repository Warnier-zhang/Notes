package org.warnier.zhang.notes.mybatis3.generator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.warnier.zhang.notes.mybatis3.generator.model.Link;
import org.warnier.zhang.notes.mybatis3.generator.service.LinkService;

import java.util.List;
import java.util.Map;

@RestController
public class LinkController {
    @Autowired
    private LinkService linkService;

    @GetMapping("/links")
    public List<Link> queryLinks() {
        return linkService.queryLinks();
    }

    @GetMapping("/links/{id}")
    public Link queryLink(@PathVariable("id") Long linkId) {
        return linkService.queryLink(linkId);
    }

    @GetMapping("/links/search")
    public Map<String, Object> searchLinks(String linkName, Integer pageIndex, Integer pageSize) {
        return linkService.searchLinks(linkName, pageIndex, pageSize);
    }
}
