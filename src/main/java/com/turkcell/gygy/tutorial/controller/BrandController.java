package com.turkcell.gygy.tutorial.controller;

import com.turkcell.gygy.tutorial.dto.BrandDto;
import com.turkcell.gygy.tutorial.dto.InsertBrandRequestDto;
import com.turkcell.gygy.tutorial.service.BrandService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//localhost:8080
@Slf4j
@RestController
@RequestMapping("/api/v1/brands")
public class BrandController {

    private final BrandService brandService;

    public BrandController(BrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping
    public List<BrandDto> getAllBrands() {
        log.info("getAllBrands request received");
        return brandService.getAllBrands();
    }

    @PostMapping
    public void insertNewBrand(@RequestBody InsertBrandRequestDto insertBrandRequestDto) {
        brandService.insertBrand(insertBrandRequestDto);
    }

    //USER ---> CONTROLLER --> SERVICE (Logic buradadır) ---> REPOSITORY --> DB / Other WebService etc.

    //USER --> Controller (DTO) --> Service (DTO) --> Mapper (DTO -> Entity) --> Repository (Entity)


}
