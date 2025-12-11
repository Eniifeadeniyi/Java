package services;

import dtos.requests.AddBookRequest;
import dtos.responses.AddBookResponse;

public interface BookServices {
    AddBookResponse addBook(AddBookRequest request);

}
