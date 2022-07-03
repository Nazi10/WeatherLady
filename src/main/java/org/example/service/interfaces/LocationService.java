package org.example.service.interfaces;

import org.example.dto.AddLocationDto;

import java.util.List;

public interface LocationService {
    void addLocation(AddLocationDto locationDto);
    List<AddLocationDto> getAllLocations();
}
