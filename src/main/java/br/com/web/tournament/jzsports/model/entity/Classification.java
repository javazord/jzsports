package br.com.web.tournament.jzsports.model.entity;

import jakarta.persistence.*;

import java.io.Serializable;
@Entity
public class Classification implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Integer victories;
    @Column(nullable = false)
    private Integer defeats;
    @Column(nullable = false)
    private Integer draws;
    @Column(nullable = false)
    private Integer points;
    @Column(nullable = false)
    private Integer matches;
    @Column(nullable = false)
    private Integer goalsConceded;
    @Column(nullable = false)
    private Integer goalsScored;
    @OneToOne
    @JoinColumn(name = "team_id")
    private Team team;
    @ManyToOne
    @JoinColumn(name = "tournament_id", nullable = false)
    private Tournament tournament;

}
