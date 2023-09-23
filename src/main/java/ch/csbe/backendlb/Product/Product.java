package ch.csbe.backendlb.Product;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Schema(
        description = "Product identification number",
        example = "1"
)
public class Product {

        // Unique identifier for the product
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(columnDefinition = "BIGINT", nullable = false)
        private Long id;

        // Stock Keeping Unit (SKU) of the product
        @Column(columnDefinition = "VARCHAR(100)", nullable = false)
        private String sku;

        // Status indicating whether the product is active (usually 0 or 1)
        @Column(columnDefinition = "TINYINT", nullable = false)
        private String active;

        // Name of the product
        @Column(columnDefinition = "VARCHAR(500)", nullable = false)
        private String productName;

        // URL or path to the product's image
        @Column(columnDefinition = "VARCHAR(1000)", nullable = false)
        private String image;

        // Description of the product
        @Column(columnDefinition = "MEDIUMTEXT", nullable = false)
        private String description;

        // Price of the product
        @Column(columnDefinition = "DOUBLE", nullable = false)
        private Double price;

        // Available stock quantity
        @Column(columnDefinition = "INT", nullable = false)
        private String stock;

        // Many-to-One relationship with product category
        @ManyToOne
        private ch.csbe.backendlb.Category.Category category;

        // Getter and setter methods for each field

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
                return category;
        }

        public void setCategory(ch.csbe.backendlb.Category.Category category) {
                this.category = category;
        }
}

