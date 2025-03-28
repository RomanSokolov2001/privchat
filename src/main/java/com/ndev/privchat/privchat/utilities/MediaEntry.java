package com.ndev.privchat.privchat.utilities;

import jakarta.annotation.Nullable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class MediaEntry {
    private final String originalFilename;
    private final String receiver;
    private final String sender;
    private final String id;
    private final String fileType;
    @Nullable
    private final String expiresAt;
}