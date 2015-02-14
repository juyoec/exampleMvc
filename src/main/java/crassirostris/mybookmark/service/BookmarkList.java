package crassirostris.mybookmark.service;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

/**
 * Created by crassirostris on 15. 2. 7..
 */
@Data
@Entity
public class BookmarkList {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(length = 11, unique = true, nullable = false)
    private long seq;
    @NotNull
    @Max(value = 200)
    @Column(length = 200, nullable = false, updatable = false)
    private String url;
    @Max(value = 1000)
    @Column(length = 1000)
    private String description = "";
}
