package model;

import java.time.LocalDateTime;

public abstract class BaseModel {
    int id;

    // Audit colums : for auditing and debugging purposes
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String createdBy;
    private String updatedBy;

    protected BaseModel() {
    }

    protected BaseModel(int id, LocalDateTime createdAt, LocalDateTime updatedAt, String createdBy, String updatedBy) {
        this.id = id;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
    }
}
