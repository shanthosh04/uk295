CREATE TABLE `category` (
                            `active` tinyint(4) DEFAULT NULL,
                            `id` bigint(20) NOT NULL,
                            `name` varchar(255) DEFAULT NULL,
                            PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

CREATE TABLE `product` (
                           `active` tinyint(4) DEFAULT NULL,
                           `price` float DEFAULT NULL,
                           `stock` int(11) DEFAULT NULL,
                           `category_id` bigint(20) DEFAULT NULL,
                           `id` bigint(20) NOT NULL,
                           `description` mediumtext DEFAULT NULL,
                           `image` varchar(1000) DEFAULT NULL,
                           `product_name` varchar(500) DEFAULT NULL,
                           `sku` varchar(100) DEFAULT NULL,
                           PRIMARY KEY (`id`),
                           KEY `FK1mtsbur82frn64de7balymq9s` (`category_id`),
                           CONSTRAINT `FK1mtsbur82frn64de7balymq9s` FOREIGN KEY (`category_id`) REFERENCES `category` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

CREATE TABLE `user` (
                        `birthdate` date DEFAULT NULL,
                        `id` bigint(20) NOT NULL,
                        `adress` varchar(255) DEFAULT NULL,
                        `city` varchar(255) DEFAULT NULL,
                        `email` varchar(1000) DEFAULT NULL,
                        `firstname` varchar(255) DEFAULT NULL,
                        `lastname` varchar(255) DEFAULT NULL,
                        `password` varchar(200) DEFAULT NULL,
                        PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;
