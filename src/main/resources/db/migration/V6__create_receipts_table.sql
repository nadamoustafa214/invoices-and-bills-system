-- Receipt table
CREATE TABLE receipts(
                         id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
                         paymentId BIGINT,
                         receiptNumber VARCHAR unique not null,
                         date DATE not null ,
                         isDeleted BOOLEAN  DEFAULT false,
                         created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                         updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                         deleted_at TIMESTAMP NULL
                          FOREIGN KEY (paymentId) references payments(id)
)