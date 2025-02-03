package br.com.web.tournament.jzsports.model.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalTime;
@Entity
public class Goal implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private LocalTime timeGoal;
    @ManyToOne
    @JoinColumn(name = "match_id")
    private Round round;
    @ManyToOne
    @JoinColumn(name = "player_id")
    private Player player;

}
