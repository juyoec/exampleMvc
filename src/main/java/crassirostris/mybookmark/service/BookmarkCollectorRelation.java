package crassirostris.mybookmark.service;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by crassirostris on 15. 2. 8..
 */
@Data
@Entity
@Table(name="bookmark_collectors_rel")
public class BookmarkCollectorRelation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(length = 11, unique = true, nullable = false)
    private long seq;
    @NotNull
    @Column(nullable = false, updatable = false)
    private long listseq;
    @NotNull
    @Column(nullable = false, updatable = false)
    private long collectorSeq;
    @NotNull
    @Column(nullable = false, updatable = false)
    private String collectorCode;
    @CreatedDate
    @Column(updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
}
