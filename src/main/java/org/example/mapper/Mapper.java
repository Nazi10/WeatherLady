package org.example.mapper;

import org.example.dto.AddLocationDto;
import org.example.entity.Location;

import java.util.List;

public interface Mapper {

    AddLocationDto toDto(Location location);
    Location toEntity(AddLocationDto addLocationDto);
    List<AddLocationDto> listToDto(List<Location> locations);
}
