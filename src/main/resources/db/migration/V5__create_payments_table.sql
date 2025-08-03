-- payment table
CREATE TABLE payments(
                              id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
                              invoiceId BIGINT,
                              amount DOUBLE not null,
                              status VARCHAR not null ,
                              date DATE not null ,
                              typeOfPayment VARCHAR not null,
                              transactionId BIGINT unique not null ,
                              isDeleted BOOLEAN  DEFAULT false,
                              created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                              updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                              deleted_at TIMESTAMP NULL
                          FOREIGN KEY (invoiceId) references invoices(id)
)