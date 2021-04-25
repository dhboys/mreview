package org.dongho.mreview.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pno;

    @ManyToMany(mappedBy = "productSet")
    Set<Category> categorySet;
}
