package com.example.SeatReserveApi.entity;

import lombok.Data;

@Data
public class BaseResponseApi<T> {
    private int statusCode;
    private String message;
    private T data;
    private Pagination pagination;

    public BaseResponseApi(int statusCode, String message, T data) {
        this.statusCode = statusCode;
        this.message = message;
        this.data = data;
    }

    public BaseResponseApi(int statusCode, String message, T data, Pagination pagination) {
        this.statusCode = statusCode;
        this.message = message;
        this.data = data;
        this.pagination = pagination;
    }
}


@Data
class Pagination {
    private int pageNumber;
    private int pageSize;
    private long totalElements;
    private int totalPages;
}