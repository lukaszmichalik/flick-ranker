package com.lukmic.userserviceapp.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IdRequest {

    @NotNull
    private Long id;
}
