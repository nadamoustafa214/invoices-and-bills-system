-- invoice table
CREATE TABLE invoices(
                          id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
                         inviceNumber VARCHAR unique not null ,
                          invoiceDate DATE not null ,
                          dueDate DATE ,
                            subtotal DOUBLE not null,
                            total DOUBLE not null,
                            status VARCHAR,
                            customerId BIGINT not null ,
                            notes TEXT,
                            currency VARCHAR,
                          isDeleted BOOLEAN  DEFAULT false,
                          created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                          updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                          deleted_at TIMESTAMP NULL
                          FOREIGN KEY (customerId) references customers(id)
)