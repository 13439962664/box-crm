INSERT INTO `box`.`auth_permissions` (`id`, `permissions_code`, `permissions_name`, `del_`, `version_`) VALUES ('101', 'crm_customer_manage', '客户管理', '0', '0');
INSERT INTO `box`.`auth_permissions` (`id`, `permissions_code`, `permissions_name`, `del_`, `version_`) VALUES ('102', 'crm_customer_sel', '查询客户', '0', '0');
INSERT INTO `box`.`auth_permissions` (`id`, `permissions_code`, `permissions_name`, `del_`, `version_`) VALUES ('103', 'crm_customer_add', '添加客户', '0', '0');
INSERT INTO `box`.`auth_permissions` (`id`, `permissions_code`, `permissions_name`, `del_`, `version_`) VALUES ('104', 'crm_customer_upd', '修改客户', '0', '0');
INSERT INTO `box`.`auth_permissions` (`id`, `permissions_code`, `permissions_name`, `del_`, `version_`) VALUES ('105', 'crm_customer_del', '删除客户', '0', '0');

INSERT INTO `box`.`auth_role` (`id`, `role_code`, `role_name`, `del_`, `version_`) VALUES ('2', 'admin_customer', '客户管理员', '0', '0');

INSERT INTO `box`.`auth_role_permissions` (`role_id`, `permissions_id`) VALUES ('2', '101');
INSERT INTO `box`.`auth_role_permissions` (`role_id`, `permissions_id`) VALUES ('2', '102');
INSERT INTO `box`.`auth_role_permissions` (`role_id`, `permissions_id`) VALUES ('2', '103');
INSERT INTO `box`.`auth_role_permissions` (`role_id`, `permissions_id`) VALUES ('2', '104');
INSERT INTO `box`.`auth_role_permissions` (`role_id`, `permissions_id`) VALUES ('2', '105');

INSERT INTO `box`.`auth_user_role` (`user_id`, `role_id`) VALUES ('1', '2');


CREATE TABLE `crm_customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL COMMENT '姓名',
  `english_name` varchar(100) DEFAULT NULL COMMENT '英文名',
  `gender` int(1) DEFAULT NULL COMMENT '性别',
  `mobile_phone` varchar(20) DEFAULT NULL COMMENT '手机号码',
  `mobile_phone2` varchar(20) DEFAULT NULL COMMENT '手机号码2',
  `fixed_phone` varchar(20) DEFAULT NULL COMMENT '固定电话号码',
  `birthday` date DEFAULT NULL COMMENT '生日',
  `nationality_name` varchar(50) DEFAULT NULL COMMENT '国籍',
  `province_name` varchar(50) DEFAULT NULL COMMENT '省份',
  `city_name` varchar(50) DEFAULT NULL COMMENT '城市',
  `county_name` varchar(50) DEFAULT NULL COMMENT '区县',
  `home_address` varchar(255) DEFAULT NULL COMMENT '家庭住址',
  `profession_name` varchar(50) DEFAULT NULL COMMENT '职业',
  `resume` varchar(2000) DEFAULT NULL COMMENT '简介',
  `company_name` varchar(100) DEFAULT NULL COMMENT '公司',
  `company_address` varchar(255) DEFAULT NULL COMMENT '公司地址',
  `position_name` varchar(50) DEFAULT NULL COMMENT '职位',
  `del_` int(1) DEFAULT NULL COMMENT '删除标识：0正常；1删除',
  `version_` int(11) DEFAULT NULL COMMENT '版本号码',
  `create_time` datetime DEFAULT NULL,
  `create_user` int(11) DEFAULT NULL,
  `last_time` datetime DEFAULT NULL,
  `last_user` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

