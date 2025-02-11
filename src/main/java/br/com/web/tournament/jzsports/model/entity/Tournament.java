package br.com.web.tournament.jzsports.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Tournament implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Date startDate;
    @Column(nullable = false)
    private Date endDate;
    @Column(nullable = false)
    private String name;
    @OneToMany(mappedBy = "tournament", cascade = CascadeType.ALL)
    private List<Team> teams;
    @OneToMany(mappedBy = "tournament", cascade = CascadeType.ALL)
    private List<Round> rounds;
    @OneToMany(mappedBy = "tournament", cascade = CascadeType.ALL)
    private List<Classification> classifications;

}
