/*
 Navicat Premium Data Transfer

 Source Server         : test
 Source Server Type    : MySQL
 Source Server Version : 50732
 Source Host           : localhost:3307
 Source Schema         : ssmbuild

 Target Server Type    : MySQL
 Target Server Version : 50732
 File Encoding         : 65001

 Date: 24/02/2021 19:46:57
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_city
-- ----------------------------
DROP TABLE IF EXISTS `tb_city`;
CREATE TABLE `tb_city`  (
  `CITY_ID` int(11) NOT NULL AUTO_INCREMENT,
  `CITY_NAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `CITY_DESCRIBE` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `CITY_HREF` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`CITY_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_city
-- ----------------------------
INSERT INTO `tb_city` VALUES (1, '武汉', '是长江经济带核心城市、中部崛起战略支点、全面创新改革试验区，是全国三大智力密集区之一，中国光谷致力打造有全球影响力的创新创业中心。根据国家发改委要求，武汉正加快建成以全国经济中心、高水平科技创新中心、商贸物流中心和国际交往中心四大功能为支撑的国家中心城市。', 'https://baike.baidu.com/item/%E6%AD%A6%E6%B1%89/106764?fr=aladdin');
INSERT INTO `tb_city` VALUES (2, '上海', '简称“沪”或“申”，是中华人民共和国省级行政区、直辖市、国家中心城市、超大城市、上海大都市圈核心城市，国务院批复确定的中国国际经济、金融、贸易、航运、科技创新中心 [1]  。截至2019年，全市下辖16个区，总面积6340.5平方千米，建成区面积1237.85平方千米，常住人口2428.14万人，城镇人口2139.19万人。', 'https://baike.baidu.com/item/%E4%B8%8A%E6%B5%B7/114606');

-- ----------------------------
-- Table structure for tb_house
-- ----------------------------
DROP TABLE IF EXISTS `tb_house`;
CREATE TABLE `tb_house`  (
  `HOUSE_ID` int(11) NOT NULL AUTO_INCREMENT,
  `HOUSE_NAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `HOUSE_KIND` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `HOUSE_CITY` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `HOUSE_AREA` int(255) NOT NULL,
  `HOUSE_PEOPLE` int(255) NOT NULL,
  `HOUSE_COMETIME` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `HOUSE_LEAVETIME` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `HOUSE_BEDNUM` int(11) NOT NULL,
  `HOUSE_PRICE` int(10) NOT NULL,
  PRIMARY KEY (`HOUSE_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_house
-- ----------------------------
INSERT INTO `tb_house` VALUES (1, '都是家园圣天地', '大床房', '武汉', 67, 1, '15:00之后', '12:00之前', 1, 220);
INSERT INTO `tb_house` VALUES (2, '徽苑酒店公寓外滩店家', '双人床', '武汉', 70, 2, '15:00之后', '14:00之前', 2, 180);
INSERT INTO `tb_house` VALUES (3, '品尊名致豪华复式房', '双人床', '武汉', 69, 2, '12:00之后', '12:00之前', 2, 200);
INSERT INTO `tb_house` VALUES (4, '新港湾酒店公寓', '大床房', '武汉', 80, 1, '13:00之后', '12:00之前', 1, 190);
INSERT INTO `tb_house` VALUES (5, 'IU商务酒店', '大床房', '武汉', 80, 1, '15:00之后', '14:00之前', 1, 210);
INSERT INTO `tb_house` VALUES (6, '好嗨呦酒店公寓', '双人床', '武汉', 67, 2, '15:00之后', '12:00之前', 2, 90);
INSERT INTO `tb_house` VALUES (7, '海滨商务酒店', '大床房', '上海', 89, 1, '14:00之后', '12:00之前', 1, 289);

-- ----------------------------
-- Table structure for tb_order
-- ----------------------------
DROP TABLE IF EXISTS `tb_order`;
CREATE TABLE `tb_order`  (
  `ORDER_ID` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `USER_ID` int(11) NULL DEFAULT NULL,
  `USER_NAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `USER_PHONE` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `HOUSE_ID` int(11) NOT NULL,
  `ORDER_COMEDATE` date NOT NULL,
  `ORDER_LEAVEDATE` date NOT NULL,
  `ORDER_TOTALPRICE` int(10) NOT NULL,
  `ORDER_LIVEDAYS` int(255) NOT NULL,
  `ORDER_STATUS` int(255) NOT NULL,
  PRIMARY KEY (`ORDER_ID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_order
-- ----------------------------
INSERT INTO `tb_order` VALUES ('2577631b4e4843', NULL, NULL, NULL, 4, '2021-02-25', '2021-02-26', 190, 1, 0);
INSERT INTO `tb_order` VALUES ('307bc0a836b843', NULL, NULL, NULL, 2, '2021-02-24', '2021-02-25', 180, 1, 0);
INSERT INTO `tb_order` VALUES ('431209a5b40a43', NULL, NULL, NULL, 2, '2021-02-24', '2021-03-08', 2160, 12, 0);
INSERT INTO `tb_order` VALUES ('43a3e6eca37143', NULL, NULL, NULL, 2, '2021-02-25', '2021-02-27', 360, 2, 0);
INSERT INTO `tb_order` VALUES ('43ab5a34a0cf43', NULL, NULL, NULL, 5, '2021-02-24', '2021-02-26', 360, 2, 0);
INSERT INTO `tb_order` VALUES ('53b0209f470b43', NULL, NULL, NULL, 4, '2021-02-25', '2021-02-26', 190, 1, 0);
INSERT INTO `tb_order` VALUES ('807a7e76052b43', NULL, NULL, NULL, 2, '2021-02-24', '2021-02-25', 180, 1, 0);
INSERT INTO `tb_order` VALUES ('b79a3931c06343', NULL, NULL, NULL, 5, '2021-02-25', '2021-02-26', 210, 1, 0);
INSERT INTO `tb_order` VALUES ('dc1cde50cdc443', NULL, NULL, NULL, 4, '2021-02-24', '2021-02-26', 380, 2, 0);

SET FOREIGN_KEY_CHECKS = 1;
