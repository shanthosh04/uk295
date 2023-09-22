package ch.csbe.backendlb.Product;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Schema (
        description = "Identifikationsnummer der Product",
        example = "1"
)
public class Product {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(columnDefinition = ("int"),nullable = false)
        private Long id;

        @Column(columnDefinition = "varchar(100)", nullable = false)
        private String sku;

        @Column(columnDefinition = "TINYINT", nullable = false)
        private String active;

        @Column(columnDefinition = "varchar(500)", nullable = false)
        private String productName;

        @Column(columnDefinition = "varchar(1000)", nullable = false)
        private String image;

        @Column(columnDefinition = "MEDIUMTEXT", nullable = false)
        private String description;

        @Column(columnDefinition = "DOUBLE", nullable = false)
        private Double price;

        @Column(columnDefinition = "INT", nullable = false)
        private String stock;

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

        public String getActive() {
                return active;
        }

        public void setActive(String active) {
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

        public Double getPrice() {
                return price;
        }

        public void setPrice(Double price) {
                this.price = price;
        }

        public String getStock() {
                return stock;
        }

        public void setStock(String stock) {
                this.stock = stock;
        }

        public ch.csbe.backendlb.Category.Category getCategory() {
                return Category;
        }

        public void setCategory(ch.csbe.backendlb.Category.Category category) {
                Category = category;
        }
}
