
INSERT INTO CATEGORY(id,name) values (1, '�J�e�S��A');
INSERT INTO CATEGORY(id,name) values (2, '�J�e�S��B');
INSERT INTO CATEGORY(id,name) values (3, '�J�e�S��C');

INSERT INTO PRODUCT(id,category_id,name,weight) values (1,1,'���iA',1111);
INSERT INTO PRODUCT(id,category_id,name,weight) values (2,2,'���iB',222.01);
INSERT INTO PRODUCT(id,category_id,name,weight) values (3,3,'���iC',2280);

INSERT INTO USERS(id,name,password) values (1, 'user1','pass1');
INSERT INTO USERS(id,name,password) values (2, 'user2','pass2');
INSERT INTO USERS(id,name,password) values (3, 'user3','pass3');

COMMIT;
