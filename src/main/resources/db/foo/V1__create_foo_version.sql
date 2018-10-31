DROP TABLE IF EXISTS foo.t_foo ;

CREATE TABLE foo.t_foo (
    id VARCHAR(32) NOT NULL,
    foo VARCHAR(25),
    PRIMARY KEY (id)
);

INSERT INTO foo.t_foo (id,foo) values('1','fooooooooo');