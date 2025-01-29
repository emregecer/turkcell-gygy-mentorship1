package com.turkcell.gygy.tutorial.service;

import com.turkcell.gygy.tutorial.dto.BrandDto;
import com.turkcell.gygy.tutorial.dto.InsertBrandRequestDto;

import java.util.List;

public interface BrandService {

    List<BrandDto> getAllBrands();

    void insertBrand(InsertBrandRequestDto dto);
}
