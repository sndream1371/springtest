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
--게시판
CREATE TABLE `tbl_board` (
	`bno` INT(11) NOT NULL AUTO_INCREMENT,
	`title` VARCHAR(200) NOT NULL,
	`content` VARCHAR(4000) NULL DEFAULT NULL,
	`writer` VARCHAR(50) NOT NULL,
	`regdate` DATETIME NULL DEFAULT NULL,
	`viewcnt` INT(11) NULL DEFAULT '0',
	PRIMARY KEY (`bno`)
)
COLLATE='utf8_general_ci'
ENGINE=InnoDB
AUTO_INCREMENT=21
;

--로그인
DROP TABLE tbl_member;
CREATE TABLE `tbl_member` (
	`user_name` VARCHAR(20),
   `user_pw` VARCHAR(100),
	`user_id` VARCHAR(100) NOT NULL,
	`user_email` VARCHAR(200),
	`user_regdate` DATETIME NULL DEFAULT NULL,
    `user_updatedate` DATETIME NULL DEFAULT NULL
)
COLLATE='utf8_general_ci'
ENGINE=InnoDB
;



