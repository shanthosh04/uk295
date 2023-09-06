package ch.csbe.backendlb.Product;

import ch.csbe.backendlb.Category.Category;
import jakarta.persistence.*;

@Entity
public class Product {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        @Column(columnDefinition = "varchar(100)")
        private String sku;

        @Column(columnDefinition = "TINYINT")
        private Integer active;

        @Column(columnDefinition = "varchar(500)")
        private String productName;

        @Column(columnDefinition = "varchar(1000)")
        private String image;

        @Column(columnDefinition = "MEDIUMTEXT")
        private String description;

        @Column(columnDefinition = "FLOAT")
        private Float price;

        @Column(columnDefinition = "INT")
        private Integer stock;

        @ManyToOne
        private ch.csbe.backendlb.Category.Category Category;

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

        public Integer getActive() {
                return active;
        }

        public void setActive(Integer active) {
                this.active = active;
        }

        public String getProductName() {
                return productName;
        }

        public void setProductName(String productName) {
                this.productName = productName;
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
                this.description = description;
        }

        public Float getPrice() {
                return price;
        }

        public void setPrice(Float price) {
                this.price = price;
        }

        public Integer getStock() {
                return stock;
        }

        public void setStock(Integer stock) {
                this.stock = stock;
        }

        public ch.csbe.backendlb.Category.Category getCategory() {
                return Category;
        }

        public void setCategory(ch.csbe.backendlb.Category.Category category) {
                Category = category;
        }
}
