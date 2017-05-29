
INSERT INTO CATEGORY(id,name) values (1, 'カテゴリA');
INSERT INTO CATEGORY(id,name) values (2, 'カテゴリB');
INSERT INTO CATEGORY(id,name) values (3, 'カテゴリC');

INSERT INTO PRODUCT(id,category_id,name,weight) values (1,1,'商品A',1111);
INSERT INTO PRODUCT(id,category_id,name,weight) values (2,2,'商品B',222.01);
INSERT INTO PRODUCT(id,category_id,name,weight) values (3,3,'商品C',2280);

INSERT INTO USERS(id,name,password) values (1, 'user1','pass1');
INSERT INTO USERS(id,name,password) values (2, 'user2','pass2');
INSERT INTO USERS(id,name,password) values (3, 'user3','pass3');

COMMIT;
