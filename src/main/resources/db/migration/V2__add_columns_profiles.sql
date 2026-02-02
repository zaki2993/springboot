ALTER TABLE addresses
ADD COLUMN state VARCHAR(255) NOT NULL;
CREATE TABLE profiles (
  id BIGINT PRIMARY KEY,
  bio TEXT,
  phone_number VARCHAR(15),
  date_of_birth DATE,
  loyalty_points INTEGER DEFAULT 0 CHECK (loyalty_points >= 0),
  CONSTRAINT fk_profiles_users
    FOREIGN KEY (id)
    REFERENCES users(id)
    ON DELETE CASCADE
);


