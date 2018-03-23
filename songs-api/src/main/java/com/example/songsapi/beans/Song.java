package com.example.songsapi.beans;

import lombok.*;

import javax.persistence.*;
import java.sql.Time;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "SONGS")
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "LENGTH")
    private Time length;

}