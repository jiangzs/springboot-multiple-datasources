DROP TABLE IF EXISTS bar.t_bar ;

CREATE TABLE bar.t_bar (
    id VARCHAR(32) NOT NULL,
    bar VARCHAR(25),
    PRIMARY KEY (id)
);

INSERT INTO bar.t_bar (id,bar) values('1','barbar');