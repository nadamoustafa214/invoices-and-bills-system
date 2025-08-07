-- Receipt table
CREATE TABLE receipts(
                         id BIGINT AUTO_INCREMENT PRIMARY KEY,
                         payment_id BIGINT NOT NULL ,
                         receipt_number VARCHAR(500) NOT NULL UNIQUE ,
                         date DATE NOT NULL ,
                         is_deleted BOOLEAN  DEFAULT false,
                         created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                         updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
                         deleted_at TIMESTAMP NULL,
                         FOREIGN KEY (payment_id) references payments(id)
)