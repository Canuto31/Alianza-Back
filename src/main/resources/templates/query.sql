--CREATION QUERY
CREATE TABLE cliente
(
    shared_key   VARCHAR(255) PRIMARY KEY,
    business_id  VARCHAR(255),
    email     VARCHAR(255),
    phone        VARCHAR(20),
    data_added TIMESTAMP
);

--INSERT QUERIES

INSERT INTO cliente (shared_key, business_id, email, phone, data_added)
VALUES ('jgutierrez', 'Julian Gutierrez', 'jgutierrez@gmail.com', '3219876543', '2019-05-20');

INSERT INTO cliente (shared_key, business_id, email, phone, data_added)
VALUES ('mmartinez', 'Manuel Martinez', 'mmartinez@gmail.com', '3219876543', '2019-05-20');

INSERT INTO cliente (shared_key, business_id, email, phone, data_added)
VALUES ('aruiz', 'Ana Ruiz', 'aruiz@gmail.com', '3219876543', '2019-05-20');

INSERT INTO cliente (shared_key, business_id, email, phone, data_added)
VALUES ('ogarcia', 'Oscar Garcia', 'ogarcia@gmail.com', '3219876543', '2019-05-20');

INSERT INTO cliente (shared_key, business_id, email, phone, data_added)
VALUES ('tramos', 'Tania Ramos', 'tramos@gmail.com', '3219876543', '2019-05-20');


