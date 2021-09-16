DROP TABLE IF EXISTS USER;

CREATE TABLE USER (
  id INT AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(250) NOT NULL,
  password VARCHAR(250) NOT NULL,
  email VARCHAR(250) DEFAULT NULL,
  user_type VARCHAR(250) DEFAULT NULL
);

INSERT INTO USER (username, password, email, user_type) VALUES
  ('marcus', '1234', 'marcus@gmail.com', 'INSTRUCTOR');
  --('Bill', 'Gates', 'Billionaire Tech Entrepreneur'),
  --('Folrunsho', 'Alakija', 'Billionaire Oil Magnate');