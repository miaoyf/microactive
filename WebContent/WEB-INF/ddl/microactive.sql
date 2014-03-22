/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50016
Source Host           : localhost:3306
Source Database       : microactive

Target Server Type    : MYSQL
Target Server Version : 50016
File Encoding         : 65001

Date: 2014-03-22 19:55:09
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `person`
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(255) default NULL,
  `pwd` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of person
-- ----------------------------
INSERT INTO person VALUES ('111', 'daleiwang', '123456');
INSERT INTO person VALUES ('2222', 'daleiwang', '123456');
INSERT INTO person VALUES ('3333', 'daleiwang', '123456');
INSERT INTO person VALUES ('444', 'daleiwang', '123456');
INSERT INTO person VALUES ('3334', 'zhangs', '123456');
INSERT INTO person VALUES ('3335', '111', '111111111111');
INSERT INTO person VALUES ('3336', 'zhang1', '123456');
INSERT INTO person VALUES ('3337', 'a2', '123456');
INSERT INTO person VALUES ('3338', 'aa', '123456');
INSERT INTO person VALUES ('3339', 'aaa', 'aaa');
INSERT INTO person VALUES ('3340', 'å¼ ä¸', '123456');
INSERT INTO person VALUES ('3341', 'AAA', '123456');
INSERT INTO person VALUES ('3342', '  æå', '123456');
INSERT INTO person VALUES ('3343', '2222', '111111');
INSERT INTO person VALUES ('3344', 'èæ°¸é', '123456');
INSERT INTO person VALUES ('3345', '333', '333');
INSERT INTO person VALUES ('3346', '6666', '6666');
