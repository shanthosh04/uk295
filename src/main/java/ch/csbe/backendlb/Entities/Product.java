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
        private String Description;

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getSku() {
                return sku;
        }

        public void setSku(String sku) {
                this.sku = sku;
        }

        public static String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getImage() {
                return image;
        }

        public void setImage(String image) {
                this.image = image;
        }

        public String getDescription() {
                return description;
        }

        public void setDescription(String description) {
                this.Description = description;
        }

        public static float getPrice() {
                return price;
        }

        public void setPrice(float price) {
                this.price = price;
        }

        public int getStock() {
                return stock;
        }

        public void setStock(int stock) {
                this.stock = stock;
        }

        public static Category getCategory() {
                return Category;
        }

        public void setCategory(Category category) {
                this.Category = category;
        }
}
