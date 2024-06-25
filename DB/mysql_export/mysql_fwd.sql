-- MySQL Script generated by MySQL Workbench
-- Thu Jan  4 15:58:05 2024
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema temp
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema temp
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `temp` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `temp` ;

-- -----------------------------------------------------
-- Table `temp`.`t_region`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `temp`.`t_region` (
  `region_code` VARCHAR(3) NOT NULL,
  `region_name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`region_code`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `temp`.`t_customer`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `temp`.`t_customer` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `customer_name` VARCHAR(45) NOT NULL,
  `phone` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `addfress` VARCHAR(100) NOT NULL,
  `regist_date` DATETIME NULL DEFAULT CURRENT_TIMESTAMP,
  `region_code` VARCHAR(3) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `phone_UNIQUE` (`phone` ASC) VISIBLE,
  UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE,
  INDEX `fk_t_customer_t_region_idx` (`region_code` ASC) VISIBLE,
  CONSTRAINT `fk_t_customer_t_region`
    FOREIGN KEY (`region_code`)
    REFERENCES `temp`.`t_region` (`region_code`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `temp`.`t_product`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `temp`.`t_product` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `product_code` VARCHAR(45) NOT NULL,
  `product_name` VARCHAR(45) NOT NULL,
  `price` INT NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `product_code_UNIQUE` (`product_code` ASC) VISIBLE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `temp`.`t_sales`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `temp`.`t_sales` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `qty` INT NOT NULL,
  `sales_date` DATETIME NULL DEFAULT CURRENT_TIMESTAMP,
  `customer_id` INT NOT NULL,
  `product_code` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_t_sales_t_customer1_idx` (`customer_id` ASC) VISIBLE,
  INDEX `fk_t_sales_t_product1_idx` (`product_code` ASC) VISIBLE,
  CONSTRAINT `fk_t_sales_t_customer1`
    FOREIGN KEY (`customer_id`)
    REFERENCES `temp`.`t_customer` (`id`),
  CONSTRAINT `fk_t_sales_t_product1`
    FOREIGN KEY (`product_code`)
    REFERENCES `temp`.`t_product` (`product_code`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
