package org.example.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "singer")
@Data
@NamedQuery(name = "Singer.findAll", query = "select s from Singer s")
public class Singer implements Serializable {
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
