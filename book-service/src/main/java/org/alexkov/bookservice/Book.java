package org.alexkov.bookservice;

import lombok.Data;
import lombok.Value;

/**
 * Created by alexk on 21.01.2018.
 */
@Data
public class Book {
    final Long id;
    final String author;
    final String title;
}
