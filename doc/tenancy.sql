/*
 Navicat MySQL Data Transfer

 Source Server         : local
 Source Server Version : 50638
 Source Host           : localhost
 Source Database       : tenancy

 Target Server Version : 50638
 File Encoding         : utf-8

 Date: 03/10/2019 17:10:06 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `base_test`
-- ----------------------------
DROP TABLE IF EXISTS `base_test`;
CREATE TABLE `base_test` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `base_test`
-- ----------------------------
BEGIN;
INSERT INTO `base_test` VALUES ('1', 'test1'), ('2', 'test2'), ('3', 'test3');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
