-- invoice item table
CREATE TABLE invoice_items(
                         id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
                         invoiceId BIGINT,
                         unitPrice DOUBLE not null,
                         quantity int not null ,
                         taxRate DOUBLE ,
                         totalPrice DOUBLE not null,
                         isDeleted BOOLEAN  DEFAULT false,
                         created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                         updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                         deleted_at TIMESTAMP NULL
                          FOREIGN KEY (invoiceId) references invoices(id)
)