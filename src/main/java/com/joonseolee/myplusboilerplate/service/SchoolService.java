package com.joonseolee.myplusboilerplate.service;

import com.joonseolee.myplusboilerplate.entity.School;
import com.joonseolee.myplusboilerplate.mapper.SchoolMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolService {

    private final SchoolMapper schoolMapper;

    public List<School> getSchools() {
        return schoolMapper.selectList(null);
    }
}
