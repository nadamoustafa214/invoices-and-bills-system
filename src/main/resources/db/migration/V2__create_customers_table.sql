-- customer table
CREATE TABLE customers(
                         id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
                         name VARCHAR(100)  not null ,
                         email varchar(80) unique not null ,
                         phone VARCHAR(20) unique not null  ,
                         address VARCHAR(300),
                         city VARCHAR(50) not null ,
                         created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                         updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                         deleted_at TIMESTAMP NULL
)