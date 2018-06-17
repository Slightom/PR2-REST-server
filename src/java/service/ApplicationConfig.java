package service;

import java.util.Set;
import javax.ws.rs.core.Application;


@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(filters.LogingFilter.class);
        resources.add(filters.MyResponseFilter.class);
        resources.add(service.FlightsService.class);
        resources.add(service.TicketsService.class);
    }
    
}
