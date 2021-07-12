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
public class EmployeeMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private User user;

    @OneToOne(cascade = CascadeType.MERGE)
    private Designation designation;

    @OneToOne(cascade = CascadeType.MERGE)
    private Department department;

    @OneToOne(cascade = CascadeType.MERGE)
    private Group group;

    @OneToOne(cascade = CascadeType.MERGE)
    private OperatingUnit operatingUnit;

    @OneToOne(cascade = CascadeType.MERGE)
    private Product product;

    @OneToOne(cascade = CascadeType.MERGE)
    private  Section section;

    @OneToOne(cascade = CascadeType.MERGE)
    private SubSection subSection;

    @OneToOne(cascade = CascadeType.MERGE)
    private Team team;

    @OneToOne(cascade = CascadeType.MERGE)
    private SubTeam subTeam;

    @OneToOne(cascade = CascadeType.MERGE)
    private EmployeeMaster superior;

    private String presentAddress;

    private  String permanentAddress;

    private String email;

    private String phone;

    @OneToOne(cascade = CascadeType.MERGE)
    private Shift shift;


    @OneToMany(mappedBy ="employeeMaster")
    @JsonIgnore
    private List<Attendance>attendances;

}
