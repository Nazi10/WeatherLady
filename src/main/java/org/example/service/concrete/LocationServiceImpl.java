package org.example.service.concrete;

import lombok.RequiredArgsConstructor;
import org.example.dto.AddLocationDto;
import org.example.entity.Location;
import org.example.mapper.Mapper;
import org.example.service.interfaces.LocationService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.ArrayList;
import java.util.List;

import static org.example.config.HibernateConfig.buildSessionFactory;
@RequiredArgsConstructor
public class LocationServiceImpl implements LocationService {
    static Session session;
    static SessionFactory sessionFactory;
    private final Mapper mapper;

    @Override
    public void addLocation(AddLocationDto locationDto) {
        Location location = null;
        try {
            session = buildSessionFactory().openSession();
            session.beginTransaction();
            location = new Location();
            location.setId(locationDto.getId());
            location.setRegion(locationDto.getRegion());
            location.setCountry(locationDto.getCountry());
            location.setCity(locationDto.getCity());
            session.save(location);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public List<AddLocationDto> getAllLocations() {
        List<Location> locations = new ArrayList<>();
        try {
            session = buildSessionFactory().openSession();
            session.beginTransaction();
            locations = session.createQuery("From Location").list();
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return mapper.listToDto(locations);
    }
}
