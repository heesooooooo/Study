-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema exam
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema exam
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `exam` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `exam` ;

-- -----------------------------------------------------
-- Table `exam`.`t_cus`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `exam`.`t_cus` (
  `customer_code` INT NOT NULL,
  `customer_name` VARCHAR(45) NULL,
  `address` VARCHAR(45) NULL,
  PRIMARY KEY (`customer_code`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `exam`.`t_order`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `exam`.`t_order` (
  `order_number` INT NOT NULL,
  `product_name` VARCHAR(45) NULL,
  `quantity` VARCHAR(45) NULL,
  `price` VARCHAR(45) NULL,
  `customer_code` INT NOT NULL,
  PRIMARY KEY (`order_number`),
  INDEX `fk_t_order_t_cus_idx` (`customer_code` ASC) VISIBLE,
  CONSTRAINT `fk_t_order_t_cus`
    FOREIGN KEY (`customer_code`)
    REFERENCES `exam`.`t_cus` (`customer_code`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
