CREATE TABLE BOOK (
	id 			IDENTITY NOT NULL PRIMARY KEY,
	title		VARCHAR(45) NOT NULL UNIQUE,
	description	VARCHAR(45) NOT NULL,
);

CREATE INDEX idx_title
	ON BOOK (title);