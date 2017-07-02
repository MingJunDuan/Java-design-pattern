package com.mjduan.project.src;

import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Hans 2017-07-02 20:05
 */
public class Converter<T,U> {
    private final Function<T,U> fromDto;
    private final Function<U,T> fromEntity;

    public Converter(Function<T, U> fromDto, Function<U, T> fromEntity) {
        this.fromDto = fromDto;
        this.fromEntity = fromEntity;
    }

    public final U convertFromDto(final T userDto) {
        return fromDto.apply(userDto);
    }

    public final T convertFromEntity(final U user) {
        return fromEntity.apply(user);
    }

    public final List<U> createFromDtos(final Collection<T> userDtos) {
        List<U> result = userDtos.stream().map(this::convertFromDto).collect(Collectors.toList());
        return result;
    }

    public final List<T> createFromEntities(final Collection<U> users) {
        return users.stream().map(this::convertFromEntity).collect(Collectors.toList());
    }
}
