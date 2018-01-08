CREATE TABLE `j_product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `product_name` varchar(128) DEFAULT NULL,
  `short_name` varchar(64) DEFAULT NULL,
  `price` decimal(10,2) DEFAULT NULL,
  `status` tinyint(4) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB   DEFAULT CHARSET=utf8;