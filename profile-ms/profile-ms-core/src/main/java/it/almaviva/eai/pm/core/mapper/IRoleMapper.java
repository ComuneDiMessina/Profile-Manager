package it.almaviva.eai.pm.core.mapper;

import it.almaviva.eai.pm.integration.entity.RoleEntity;
import it.almaviva.eai.pm.shared.dto.role.RoleDTO;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Mapper(componentModel="spring", imports = {Collectors.class, Optional.class, Collection.class, Stream.class }, nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface IRoleMapper {

  RoleDTO fromRole(RoleEntity roleEntity);

  List<RoleDTO> fromRoleIterable(Iterable<RoleEntity> microserviceEntityList);

}
