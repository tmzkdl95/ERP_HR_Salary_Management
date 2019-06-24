package com.mycompany.mapper.mapper_interface;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.mycompany.vo.boardVO;


public interface homePageMapper {
	@Select("select * from home_board")
	public List<boardVO> getList_homeboard();
	
}
