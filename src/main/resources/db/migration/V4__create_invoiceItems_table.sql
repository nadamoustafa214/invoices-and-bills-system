-- invoice item table
CREATE TABLE invoice_items(
                         id BIGINT AUTO_INCREMENT PRIMARY KEY,
                         invoice_id BIGINT NOT NULL ,
                         unit_price DOUBLE NOT NULL,
                         quantity BIGINT NOT NULL ,
                         tax_rate DOUBLE ,
                         total_price DOUBLE NOT NULL,
                         is_deleted BOOLEAN  DEFAULT false,
                         created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                         updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
                         deleted_at TIMESTAMP NULL,
                         FOREIGN KEY (invoice_id) references invoices(id)
)