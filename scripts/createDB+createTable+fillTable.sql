CREATE SCHEMA `test` ;

CREATE TABLE `test`.`task` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `createDate` DATE NULL DEFAULT NULL,
  `description` VARCHAR(255) NOT NULL,
  `isDone` TINYINT(4) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

INSERT INTO `test`.`task` (`createDate`, `description`, `isDone`) VALUES ('2016-04-25', 'a1', '1');
INSERT INTO `test`.`task` (`createDate`, `description`, `isDone`) VALUES ('2016-04-06', 'a2', '0');
INSERT INTO `test`.`task` (`createDate`, `description`, `isDone`) VALUES ('2016-04-17', 'a3', '0');
INSERT INTO `test`.`task` (`createDate`, `description`, `isDone`) VALUES ('2016-04-25', 'a4', '1');
INSERT INTO `test`.`task` (`createDate`, `description`, `isDone`) VALUES ('2016-04-06', 'a5', '1');
INSERT INTO `test`.`task` (`createDate`, `description`, `isDone`) VALUES ('2016-04-06', 'a6', '1');
INSERT INTO `test`.`task` (`createDate`, `description`, `isDone`) VALUES ('2016-04-06', 'a7', '1');
INSERT INTO `test`.`task` (`createDate`, `description`, `isDone`) VALUES ('2016-04-25', 'a8', '0');
INSERT INTO `test`.`task` (`createDate`, `description`, `isDone`) VALUES ('2016-04-17', 'a9', '0');
INSERT INTO `test`.`task` (`createDate`, `description`, `isDone`) VALUES ('2015-09-12', 'b1', '1');
INSERT INTO `test`.`task` (`createDate`, `description`, `isDone`) VALUES ('2015-09-12', 'b2', '0');
INSERT INTO `test`.`task` (`createDate`, `description`, `isDone`) VALUES ('2015-09-12', 'b3', '0');
INSERT INTO `test`.`task` (`createDate`, `description`, `isDone`) VALUES ('2016-04-25', 'b4', '1');
INSERT INTO `test`.`task` (`createDate`, `description`, `isDone`) VALUES ('2015-09-12', 'b5', '0');
INSERT INTO `test`.`task` (`createDate`, `description`, `isDone`) VALUES ('2015-09-12', 'b6', '0');
INSERT INTO `test`.`task` (`createDate`, `description`, `isDone`) VALUES ('2015-09-12', 'b7', '1');
INSERT INTO `test`.`task` (`createDate`, `description`, `isDone`) VALUES ('2016-04-25', 'b8', '0');
INSERT INTO `test`.`task` (`createDate`, `description`, `isDone`) VALUES ('2016-04-17', 'b9', '0');
INSERT INTO `test`.`task` (`createDate`, `description`, `isDone`) VALUES ('2015-09-12', 'c1', '1');
INSERT INTO `test`.`task` (`createDate`, `description`, `isDone`) VALUES ('2016-04-25', 'c2', '0');
INSERT INTO `test`.`task` (`createDate`, `description`, `isDone`) VALUES ('2015-09-12', 'c3', '0');
INSERT INTO `test`.`task` (`createDate`, `description`, `isDone`) VALUES ('2016-04-17', 'c4', '1');
INSERT INTO `test`.`task` (`createDate`, `description`, `isDone`) VALUES ('2015-09-12', 'c5', '0');
INSERT INTO `test`.`task` (`createDate`, `description`, `isDone`) VALUES ('2016-04-17', 'c6', '0');
INSERT INTO `test`.`task` (`createDate`, `description`, `isDone`) VALUES ('2016-04-23', 'c7', '0');
INSERT INTO `test`.`task` (`createDate`, `description`, `isDone`) VALUES ('2016-04-25', 'c8', '1');
INSERT INTO `test`.`task` (`createDate`, `description`, `isDone`) VALUES ('2016-04-23', 'c9', '0');
INSERT INTO `test`.`task` (`createDate`, `description`, `isDone`) VALUES ('2016-04-17', 'd1', '0');
INSERT INTO `test`.`task` (`createDate`, `description`, `isDone`) VALUES ('2016-02-01', 'd2', '0');
INSERT INTO `test`.`task` (`createDate`, `description`, `isDone`) VALUES ('2016-02-01', 'd3', '1');
INSERT INTO `test`.`task` (`createDate`, `description`, `isDone`) VALUES ('2016-04-25', 'd4', '1');
INSERT INTO `test`.`task` (`createDate`, `description`, `isDone`) VALUES ('2016-02-01', 'd5', '1');
INSERT INTO `test`.`task` (`createDate`, `description`, `isDone`) VALUES ('2016-04-17', 'd6', '0');
INSERT INTO `test`.`task` (`createDate`, `description`, `isDone`) VALUES ('2016-04-23', 'd7', '0');
INSERT INTO `test`.`task` (`createDate`, `description`, `isDone`) VALUES ('2016-04-23', 'd8', '0');
INSERT INTO `test`.`task` (`createDate`, `description`, `isDone`) VALUES ('2016-04-23', 'd9', '1');
INSERT INTO `test`.`task` (`createDate`, `description`, `isDone`) VALUES ('2016-04-17', 'e1', '0');
INSERT INTO `test`.`task` (`createDate`, `description`, `isDone`) VALUES ('2016-04-06', 'e2', '0');
INSERT INTO `test`.`task` (`createDate`, `description`, `isDone`) VALUES ('2016-04-06', 'e3', '1');
INSERT INTO `test`.`task` (`createDate`, `description`, `isDone`) VALUES ('2016-04-25', 'e4', '0');
INSERT INTO `test`.`task` (`createDate`, `description`, `isDone`) VALUES ('2016-04-25', 'e5', '0');
INSERT INTO `test`.`task` (`createDate`, `description`, `isDone`) VALUES ('2016-04-25', 'e6', '1');
INSERT INTO `test`.`task` (`createDate`, `description`, `isDone`) VALUES ('2016-04-06', 'e7', '0');
INSERT INTO `test`.`task` (`createDate`, `description`, `isDone`) VALUES ('2016-04-17', 'e8', '0');
INSERT INTO `test`.`task` (`createDate`, `description`, `isDone`) VALUES ('2016-04-25', 'e9', '1');