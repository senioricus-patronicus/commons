package ru.splendidpdf.model;

import lombok.Getter;

@Getter
public enum CompressionType {
    LOW(0.8f),
    MEDIUM(0.6f),
    HIGH(0.4f);

    private final float factor;

    CompressionType(float factor) {
        this.factor = factor;
    }
}
