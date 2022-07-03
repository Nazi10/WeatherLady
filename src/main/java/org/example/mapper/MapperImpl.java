package org.example.mapper;

import org.example.dto.AddLocationDto;
import org.example.entity.Location;

import java.util.ArrayList;
import java.util.List;


public class MapperImpl implements Mapper {
    @Override
    public AddLocationDto toDto(Location location) {
        if (location == null) {
            return null;
        }
        AddLocationDto response = new AddLocationDto();

        response.setId(location.getId());
        response.setCity(location.getCity());
        response.setCountry(location.getCountry());
        response.setRegion(location.getRegion());

        return response;
    }

    @Override
    public Location toEntity(AddLocationDto addLocationDto) {
        if (addLocationDto == null) {
            return null;
        }

        Location location = new Location();

        location.setCity(addLocationDto.getCity());
        location.setCountry(addLocationDto.getCountry());
        location.setId(addLocationDto.getId());
        location.setRegion(addLocationDto.getRegion());

        return location;
    }

    @Override
    public List<AddLocationDto> listToDto(List<Location> locations) {
        if (locations == null) {
            return null;
        }
        List<AddLocationDto> list = new ArrayList<AddLocationDto>(locations.size());
        for (Location location : locations) {
            list.add(toDto(location));
        }
        return list;
    }
}
