package com.digitech.hrms.entity.common;


import com.digitech.hrms.entity.acl.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "groups")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;

    private  String name;

    private String address;

    @OneToOne(cascade = CascadeType.MERGE)
    private User headOfGroup;

    @OneToMany(mappedBy = "group")
    @JsonIgnore
    private List<OperatingUnit> operatingUnits;
}
