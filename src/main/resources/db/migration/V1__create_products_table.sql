
-- product table
CREATE TABLE products(
                         id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
                        productName VARCHAR(50) unique not null ,
                        description TEXT,
                        price DOUBLE not null ,
                        active Boolean DEFAULT true,
                        taxRate DOUBLE ,
                        discount DOUBLE default 0,
                        isDeleted BOOLEAN  DEFAULT false,
                         created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                         updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                         deleted_at TIMESTAMP NULL
)