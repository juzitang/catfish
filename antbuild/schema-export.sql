
    alter table browserHistory 
        drop 
        foreign key FK5251F44C2A5701D1;

    alter table browserHistory 
        drop 
        foreign key FK5251F44CD1A250FB;

    alter table pageInfo 
        drop 
        foreign key FK33355BDD82C5DDA1;

    alter table userFavorite 
        drop 
        foreign key FK10DC1E8782C5DDA1;

    alter table userFavorite 
        drop 
        foreign key FK10DC1E87D1A250FB;

    drop table if exists admin;

    drop table if exists browserHistory;

    drop table if exists category;

    drop table if exists pageInfo;

    drop table if exists user;

    drop table if exists userFavorite;

    create table admin (
        adminID bigint not null auto_increment,
        loginName varchar(50) not null,
        plainPassword varchar(32),
        encrytedPassword varchar(255),
        name varchar(64) not null,
        email varchar(100),
        primary key (adminID),
        unique (loginName)
    ) ENGINE=InnoDB;

    create table browserHistory (
        browserHistoryID bigint not null auto_increment,
        userID bigint not null,
        pageID bigint not null,
        browserTime datetime not null,
        primary key (browserHistoryID)
    ) ENGINE=InnoDB;

    create table category (
        categoryID bigint not null auto_increment,
        name varchar(64) not null,
        description varchar(255),
        primary key (categoryID),
        unique (name)
    ) ENGINE=InnoDB;

    create table pageInfo (
        pageID bigint not null auto_increment,
        url varchar(1024) not null,
        pageType boolean not null,
        title varchar(255) not null,
        categoryID bigint,
        content longtext not null,
        primary key (pageID)

    ) ENGINE=InnoDB;

    create table user (
        userID bigint not null auto_increment,
        loginName varchar(50) not null,
        plainPassword varchar(32),
        encrytedPassword varchar(255),
        name varchar(64) not null,
        email varchar(100),
        push boolean not null,
        primary key (userID),
        unique (loginName)
    ) ENGINE=InnoDB;

    create table userFavorite (
        userFavoriteID bigint not null auto_increment,
        userID bigint not null,
        categoryID bigint not null,
        primary key (userFavoriteID)
    ) ENGINE=InnoDB;

    alter table browserHistory 
        add index FK5251F44C2A5701D1 (pageID), 
        add constraint FK5251F44C2A5701D1 
        foreign key (pageID) 
        references pageInfo (pageID);

    alter table browserHistory 
        add index FK5251F44CD1A250FB (userID), 
        add constraint FK5251F44CD1A250FB 
        foreign key (userID) 
        references user (userID);

    alter table pageInfo 
        add index FK33355BDD82C5DDA1 (categoryID), 
        add constraint FK33355BDD82C5DDA1 
        foreign key (categoryID) 
        references category (categoryID);

    alter table userFavorite 
        add index FK10DC1E8782C5DDA1 (categoryID), 
        add constraint FK10DC1E8782C5DDA1 
        foreign key (categoryID) 
        references category (categoryID);

    alter table userFavorite 
        add index FK10DC1E87D1A250FB (userID), 
        add constraint FK10DC1E87D1A250FB 
        foreign key (userID) 
        references user (userID);
