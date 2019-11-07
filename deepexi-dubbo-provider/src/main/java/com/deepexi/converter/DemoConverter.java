package com.deepexi.converter;

import com.deepexi.model.dto.DemoDTO;
import com.deepexi.model.vo.DemoVO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DemoConverter {

    DemoVO dto2vo(DemoDTO dto);

}
