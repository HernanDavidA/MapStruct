package com.mapStructure.MapStructureWorkshop.api.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class BookRequest {

    @NotBlank(message = "Title is required")
    @Size(min = 0, max = 100, message = "Title requires 1 character at least")
    private String title;

    @NotBlank(message = "Author is required")
    @Size(min = 0, max = 100 , message = "Author requires 1 character at least")
    private String author;

    @NotBlank(message = "Publication year is required")
    private int publicationYear;

    @NotBlank(message = "Genre is required")
    @Size(min = 0, max = 50 , message = "Genre requires 1 character at least")
    private String genre;

    @NotBlank(message = "ISBN is required")
    @Size(min = 0, max = 20 , message = "ISBN requires 1 character at least")
    private String isbn;


}
