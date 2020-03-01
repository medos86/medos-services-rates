CREATE TABLE user (
  id INT(20) NOT NULL AUTO_INCREMENT,
  username varchar(20) NOT NULL,
  password varchar(200) NOT NULL,
  role varchar(20) NOT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY UK_username (username)
);


INSERT INTO user(username, password, role) VALUES('ADMIN', 'ADMIN', 'ADMIN');
INSERT INTO user(username, password, role) VALUES('user', 'user', 'USER');