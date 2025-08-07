
-- product table
CREATE TABLE products(
                        id BIGINT AUTO_INCREMENT PRIMARY KEY,
                        product_name VARCHAR(255) NOT NULL UNIQUE ,
                        description TEXT,
                        price DOUBLE NOT NULL ,
                        active BOOLEAN DEFAULT true,
                        tax_rate DOUBLE ,
                        discount DOUBLE DEFAULT 0,
                        is_deleted BOOLEAN  DEFAULT false,
                        created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                        updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
                        deleted_at TIMESTAMP NULL
)