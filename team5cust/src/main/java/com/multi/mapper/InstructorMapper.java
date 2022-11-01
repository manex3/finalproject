package com.multi.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.InstructorDTO;
import com.multi.frame.MyMapper;

@Repository
@Mapper
public interface InstructorMapper extends MyMapper<Integer,InstructorDTO>{
}