CREATE TABLE tags (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE user_tags (
    user_id BIGINT NOT NULL,
    tag_id INTEGER NOT NULL,
    CONSTRAINT users_tags_pk PRIMARY KEY (user_id, tag_id),
    CONSTRAINT fk_user_tags_users
        FOREIGN KEY (user_id)
        REFERENCES users(id)
        ON DELETE CASCADE,
    CONSTRAINT fk_user_tags_tags
        FOREIGN KEY (tag_id)
        REFERENCES tags(id)
        ON DELETE CASCADE
);

