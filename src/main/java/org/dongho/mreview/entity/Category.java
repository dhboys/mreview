package org.dongho.mreview.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cno;
    @ManyToMany
    private Set<Product> productSet;
}
