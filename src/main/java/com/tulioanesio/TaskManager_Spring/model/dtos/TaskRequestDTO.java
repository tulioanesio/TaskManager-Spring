package com.tulioanesio.TaskManager_Spring.model.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;

public record TaskRequestDTO (
        @NotBlank
        String Task,


        Boolean isCompleted) {
}
