-- 用户表
create table sys_user
(
  user_id    varchar2(40),
  user_name  varchar2(100),
  login_name varchar2(100),
  password   varchar2(100)
)
tablespace DEMO
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
-- Add comments to the table
comment on table sys_user
  is '用户表';
-- Add comments to the columns
comment on column sys_user.user_id
  is '用户Id';
comment on column sys_user.user_name
  is '用户名';
comment on column sys_user.login_name
  is '用户登录名';
comment on column sys_user.password
  is '密码';
-- Create/Recreate primary, unique and foreign key constraints
alter table sys_user
  add constraint sys_user_key primary key (USER_ID);