-- invoice table
CREATE TABLE invoices(
                          id BIGINT AUTO_INCREMENT PRIMARY KEY,
                          invice_number VARCHAR(500) NOT NULL UNIQUE ,
                          invoice_date DATE NOT NULL ,
                          due_date DATE ,
                          subtotal DOUBLE NOT NULL,
                          total DOUBLE NOT NULL,
                          status VARCHAR (20),
                          customer_id BIGINT NOT NULL ,
                          notes TEXT,
                          currency VARCHAR(4),
                          is_deleted BOOLEAN  DEFAULT false,
                          created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                          updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
                          deleted_at TIMESTAMP NULL,
                          FOREIGN KEY (customer_id) references customers(id)
)