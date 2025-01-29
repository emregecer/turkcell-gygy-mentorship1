package com.turkcell.gygy.tutorial.service;

import com.turkcell.gygy.tutorial.dto.BrandDto;
import com.turkcell.gygy.tutorial.dto.InsertBrandRequestDto;
import com.turkcell.gygy.tutorial.entity.Brand;
import com.turkcell.gygy.tutorial.mapper.BrandMapper;
import com.turkcell.gygy.tutorial.repository.BrandRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BrandServiceImpl implements BrandService {

    private final BrandRepository brandRepository;

    public BrandServiceImpl(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<BrandDto> getAllBrands() {
        return brandRepository.findAll().stream()
                .map(BrandMapper.INSTANCE::mapToBrandDto)
                .collect(Collectors.toList());
    }

    @Override
    public void insertBrand(InsertBrandRequestDto dto) {
        Brand brand = new Brand();
        brand.setName(dto.getBrandName());

        brandRepository.save(brand);
    }

    //Spring Dependency Injection
    //Java Stream API & Java Lambda Kullanımları
    //Controller-Service-Repository
    //Entity/DTO DTO/Entity conversions & object mappings

}
