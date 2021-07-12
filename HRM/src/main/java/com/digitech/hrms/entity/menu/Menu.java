package com.digitech.hrms.entity.menu;

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
@Table(name = "menus")
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;

    private  String name;

    @OneToOne(cascade = CascadeType.MERGE)
    private Menu parentMenu;

    private String url;

    private String icon;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "menu")
    private List<MenuUser> menuUsers;

}
