package org.alexkov.ratingservice;

import lombok.Value;

/**
 * Created by alexk on 21.01.2018.
 */
@Value
public class Rating {
    final Long id;
    final Long bookId;
    final int stars;
}
