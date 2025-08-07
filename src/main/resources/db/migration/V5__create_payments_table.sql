-- payment table
CREATE TABLE payments(
                              id BIGINT AUTO_INCREMENT PRIMARY KEY,
                              invoice_id BIGINT NOT NULL ,
                              amount DOUBLE NOT NULL,
                              status VARCHAR(20) NOT NULL ,
                              date DATE NOT NULL ,
                              type_of_payment VARCHAR(20) NOT NULL ,
                              transaction_id BIGINT  NOT NULL UNIQUE ,
                              is_deleted BOOLEAN  DEFAULT false,
                              created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                              updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
                              deleted_at TIMESTAMP NULL,
                              FOREIGN KEY (invoice_id) references invoices(id)
)