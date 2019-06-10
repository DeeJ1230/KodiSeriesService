package dk.leknoi.kodiservice.controller.mappers;

import dk.leknoi.kodiservice.controller.dto.TvShowDto;
import dk.leknoi.kodiservice.model.TvShow;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface ITvShowMapper {
//    @Mappings({
//            @Mapping(target="idShow", source="idShow")
//    })
    TvShowDto entityToDto(TvShow tvShow);
}
