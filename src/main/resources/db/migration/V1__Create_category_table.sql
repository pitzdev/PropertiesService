CREATE TABLE  category (
  `id` INT NOT NULL AUTO_INCREMENT,
  `description` VARCHAR(100) NULL,
  `name` VARCHAR(45) NULL,
  `updatedAt` datetime default current_timestamp,
  `createdAt` datetime  default current_timestamp,
  PRIMARY KEY (`id`));