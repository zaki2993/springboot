CREATE TABLE categories (
    id SMALLINT NOT NULL,
    name VARCHAR(255) NOT NULL,
    CONSTRAINT cat_pk PRIMARY KEY (id)
);
CREATE TABLE products (
    id BIGINT GENERATED ALWAYS AS IDENTITY,
    name VARCHAR(255) NOT NULL,
    price DECIMAL(10,2) NOT NULL,
    cat_id SMALLINT,
    CONSTRAINT pro_pk PRIMARY KEY (id),
    CONSTRAINT fk_pro_cat
        FOREIGN KEY (cat_id)
        REFERENCES categories(id)
);

