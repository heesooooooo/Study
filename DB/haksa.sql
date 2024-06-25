-- MySQL Workbench Synchronization
-- Generated: 2024-01-05 15:58
-- Model: New Model
-- Version: 1.0
-- Project: Name of the project
-- Author: smhrd

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

ALTER TABLE `haksa`.`student` 
DROP FOREIGN KEY `fk_student_department`;

ALTER TABLE `haksa`.`course` 
DROP FOREIGN KEY `fk_course_professor1`;

ALTER TABLE `haksa`.`professor` 
DROP FOREIGN KEY `fk_professor_department1`;

ALTER TABLE `haksa`.`student_course` 
DROP FOREIGN KEY `fk_student_course_course1`;

ALTER TABLE `haksa`.`student_course` 
CHANGE COLUMN `id` `id` INT(11) NOT NULL ;
;

ALTER TABLE `haksa`.`student` 
ADD CONSTRAINT `fk_student_department`
  FOREIGN KEY (`department_code`)
  REFERENCES `haksa`.`department` (`department_code`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;

ALTER TABLE `haksa`.`course` 
ADD CONSTRAINT `fk_course_professor1`
  FOREIGN KEY (`professor_code`)
  REFERENCES `haksa`.`professor` (`professor_code`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;

ALTER TABLE `haksa`.`professor` 
ADD CONSTRAINT `fk_professor_department1`
  FOREIGN KEY (`department_code`)
  REFERENCES `haksa`.`department` (`department_code`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;

ALTER TABLE `haksa`.`student_course` 
DROP FOREIGN KEY `fk_student_course_student1`;

ALTER TABLE `haksa`.`student_course` ADD CONSTRAINT `fk_student_course_student1`
  FOREIGN KEY (`student_id`)
  REFERENCES `haksa`.`student` (`student_id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_student_course_course1`
  FOREIGN KEY (`course_code`)
  REFERENCES `haksa`.`course` (`course_code`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
