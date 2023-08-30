package ch.csbe.backendlb.Entities;

import jakarta.persistence.*;

@Entity
public class Product {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        @Column (columnDefinition = "TINYINT")
        private Integer active;

        @Column (columnDefinition = "varchar(500)")
        private String name;

        @Column (columnDefinition = "varchar(1000)")
        private String image;

        @Column (columnDefinition = "MEDIUMTEXT")
        private String type;

        @Column(columnDefinition = "FLOAT")
        private Float price;

        @Column(columnDefinition = "INT")
        private Integer stock;

        @ManyToOne ()
        private Category Category;
}
