package com.digitech.hrms.entity.common;


import com.digitech.hrms.entity.acl.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubTeam {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;

    private String name;

    private  String address;

    @OneToOne(cascade = CascadeType.MERGE)
    private User headOfSubTeam;

    @ManyToOne(fetch = FetchType.EAGER)
    private Team team;
}
