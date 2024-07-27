package com.BlogApplication.REST.Blog.DTO;

import lombok.Data;

@Data
public class PostDTO {
    private long id;
    private String titile;
    private String Description;
    private String content;
}
