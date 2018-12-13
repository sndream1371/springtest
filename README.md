# springtest
springtest

mysql 실행
-cmd(관리자 권한으로실행)
-net start mysql
-cd c:\mysql
-mysql -u root -p
 root (pw)
 
use dream; (디비 변경)
show tables;


======================테이블생성 스크립=========================
CREATE TABLE `tbl_member` (
	`user_name` VARCHAR(20),
	`user_id` VARCHAR(100) NOT NULL,
	`user_email` VARCHAR(200),
	`user_regdate` DATETIME NULL DEFAULT NULL,
    `user_updatedate` DATETIME NULL DEFAULT NULL
)
COLLATE='utf8_general_ci'
ENGINE=InnoDB
;


