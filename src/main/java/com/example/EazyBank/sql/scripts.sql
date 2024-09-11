create table users(username varchar(50) not null primary key,password varchar(500) not null,enabled boolean not null);
create table authorities (username varchar(50) not null,authority varchar(50) not null,constraint fk_authorities_users foreign key(username) references users(username));
create unique index ix_auth_username on authorities (username,authority);


INSERT IGNORE INTO `users` VALUES ('user', '{noop}EazyBytes@12345', true);

INSERT INTO authorities (username, authority)
VALUES ('user', 'read');

INSERT INTO users (username, password, enabled)
VALUES ('admin', '{bcrypt}$2a$12$DYLniVPrAfVpTTgvvUjwM.zdcDv.vmRYMX/mHU8Nmq7DoUFw6L6X6', true);

INSERT INTO authorities (username, authority)
VALUES ('admin', 'admin');

CREATE TABLE customer (
    `id` INT AUTO_INCREMENT,
    `email` VARCHAR(45) NOT NULL,
    `pwd` VARCHAR(200) NOT NULL,
    `role` VARCHAR(45) NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO `customer` VALUES ('owin@gmail.com','{noop}EazyBytes@12345','read');
INSERT INTO `customer` VALUES ('admin@gmail.com','bcrypt}$2a$12$DYLniVPrAfVpTTgvvUjwM.zdcDv.vmRYMX/mHU8Nmq7DoUFw6L6X6','admin');