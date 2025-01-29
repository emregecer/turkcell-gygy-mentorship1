package com.turkcell.gygy.tutorial.mapper;

import com.turkcell.gygy.tutorial.dto.BrandDto;
import com.turkcell.gygy.tutorial.entity.Brand;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BrandMapper {

    BrandMapper INSTANCE = Mappers.getMapper(BrandMapper.class);

    //@Mapping(source = "id", target = "id")
    //@Mapping(source = "name", target = "name")
    BrandDto mapToBrandDto(Brand brand);

}
