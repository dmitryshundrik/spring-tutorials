package org.example.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "singer")
@Data
public class Singer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "LYRIC")
    private String lyric;

    @Version
    @Column(name = "VERSION")
    private int version;
}
