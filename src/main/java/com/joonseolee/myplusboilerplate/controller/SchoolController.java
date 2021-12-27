package com.joonseolee.myplusboilerplate.controller;

import com.joonseolee.myplusboilerplate.entity.School;
import com.joonseolee.myplusboilerplate.service.SchoolService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/school")
@RequiredArgsConstructor
public class SchoolController {

    private final SchoolService schoolService;

    @GetMapping
    public List<School> getSchools() {
        return schoolService.getSchools();
    }
}
