package com.jnshu.carrots.servicesecurity.web;

import com.jnshu.carrots.servicesecurity.service.impl.BlogService;
import com.jnshu.carrots.servicesecurity.entity.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by fangzhipeng on 2017/5/15.
 */

@RestController
@PreAuthorize("hasAuthority('ROLE_ADMIN')")
@RequestMapping("/blogs")
public class BlogController {

    @Autowired
    BlogService blogService;
    @GetMapping
    public ModelAndView list(Model model) {

        List<Blog> list =blogService.getBlogs();
        model.addAttribute("blogsList", list);
        return new ModelAndView("blogs/list", "blogModel", model);
    }

    @GetMapping(value = "/{id}/deletion")
    public ModelAndView delete(@PathVariable("id") Long id, Model model) {
        blogService.deleteBlog(id);
        model.addAttribute("blogsList", blogService.getBlogs());
        return new ModelAndView("blogs/list", "blogModel", model);
    }


}
