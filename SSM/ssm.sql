set names utf8mb4;
set foreign_key_checks = 0;
drop table if exists user;
create table user(
    user_id varchar(255) character set utf8 collate utf8_general_ci not null default '',
    card_type varchar(255) character set utf8 collate utf8_general_ci null default null,
    card_no varchar(255) character set utf8 collate utf8_general_ci null default null,
    user_name varchar(255) character set utf8 collate utf8_general_ci null default null,
    user_sex varchar(255) character set utf8 collate utf8_general_ci null default null,
    user_age varchar(255) character set utf8 collate utf8_general_ci null default null,
    user_role varchar(255) character set utf8 collate utf8_general_ci null default null,
    primary key (user_id) using btree
) engine = innoDB character set = utf8 collate = utf8_general_ci row_format = compact;
insert into user values ('15968162087363060','身份证','114264195202156467','张三','男','30','办事人员和有关人员');
insert into user values ('15968162346981977','护照','A32532654','李四','男','29','不便分类的其他从业人员');
insert into user values ('15968162893439470','身份证','112344198709094532','王五','男','31','农林牧渔水利业生产人员');
insert into user values ('15968163245457143','身份证','453234199909094532','赵六','男','34','未知');
insert into user values ('15968163514764733','军官证','军7657868','钱七','女','23','不便分类的其他从业人员');
insert into user values ('15968165113694372','台湾往来大陆通行证','43256786','周八','女','48','生产、运输设备操作人员及有关人员');
insert into user values ('15968165371931786','港澳居民通行证','C98767665','吴九','女','35','不便分类的其他从业人员');
insert into user values ('15968941217553030','身份证','343546199801018768','郑十','男','22','军人');
insert into user values ('15968943937844616','身份证','4454531199603025756','冯十一','女','31','不便分类的其他从业人员');
insert into user values ('15968944123869023','护照','B54322654','陈十二','女','39','农林牧渔水利业生产人员');
insert into user values ('15968953962316864','身份证','110232199505056789','朱十三','女','33','商业、服务业人员');
insert into user values ('15968954638794962','身份证','110651966604079098','孔十四','女','29','生产、运输设备操作人员及有关人员');
set foreign_key_checks = 1 ;
