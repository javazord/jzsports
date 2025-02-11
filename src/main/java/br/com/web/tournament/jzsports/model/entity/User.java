package br.com.web.tournament.jzsports.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false, unique = true, length = 12)
    private String login;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private boolean accessLevel;
    @ManyToOne(fetch = FetchType.LAZY)
    private Team team;


}
