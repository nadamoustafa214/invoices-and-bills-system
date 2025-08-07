-- customer table
CREATE TABLE customers(
                         id BIGINT AUTO_INCREMENT PRIMARY KEY,
                         name VARCHAR(100)  NOT NULL ,
                         email VARCHAR(200)  NOT NULL UNIQUE ,
                         phone VARCHAR(20)  NOT NULL UNIQUE ,
                         address VARCHAR(300),
                         city VARCHAR(50) NOT NULL ,
                         is_deleted BOOLEAN  DEFAULT false,
                         created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                         updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP ,
                         deleted_at TIMESTAMP NULL
)