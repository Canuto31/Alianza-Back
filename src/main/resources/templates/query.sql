--CREATION QUERY
CREATE TABLE cliente
(
    Shared_Key   VARCHAR(255) PRIMARY KEY,
    Business_Id  VARCHAR(255),
    "E-mail"     VARCHAR(255),
    Phone        VARCHAR(20),
    "Data Added" TIMESTAMP
);

--INSERT QUERIES

INSERT INTO cliente (Shared_Key, Business_Id, "E-mail", Phone, "Data Added")
VALUES ('jgutierrez', 'Julian Gutierrez', 'jgutierrez@gmail.com', '3219876543', '2019-05-20');

INSERT INTO cliente (Shared_Key, Business_Id, "E-mail", Phone, "Data Added")
VALUES ('mmartinez', 'Manuel Martinez', 'mmartinez@gmail.com', '3219876543', '2019-05-20');

INSERT INTO cliente (Shared_Key, Business_Id, "E-mail", Phone, "Data Added")
VALUES ('aruiz', 'Ana Ruiz', 'aruiz@gmail.com', '3219876543', '2019-05-20');

INSERT INTO cliente (Shared_Key, Business_Id, "E-mail", Phone, "Data Added")
VALUES ('ogarcia', 'Oscar Garcia', 'ogarcia@gmail.com', '3219876543', '2019-05-20');

INSERT INTO cliente (Shared_Key, Business_Id, "E-mail", Phone, "Data Added")
VALUES ('tramos', 'Tania Ramos', 'tramos@gmail.com', '3219876543', '2019-05-20');


