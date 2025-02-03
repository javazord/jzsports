package br.com.web.tournament.jzsports.model.entity;

import br.com.web.tournament.jzsports.model.entity.e.EPosition;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
public class Player implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Enumerated(EnumType.STRING)
    private EPosition position;
    @OneToMany(mappedBy = "player", cascade = CascadeType.ALL)
    private List<Goal> goals;
    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;

}
