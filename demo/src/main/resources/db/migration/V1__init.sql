CREATE TABLE book (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(255) NOT NULL,
    author VARCHAR(255) NOT NULL
);

INSERT INTO book (title, author) VALUES
  ('1984', 'George Orwell'),
  ('Brave New World', 'Aldous Huxley'),
  ('Fahrenheit 451', 'Ray Bradbury'),
  ('The Hobbit', 'J.R.R. Tolkien'),
  ('To Kill a Mockingbird', 'Harper Lee'),
  ('The Catcher in the Rye', 'J.D. Salinger'),
  ('The Great Gatsby', 'F. Scott Fitzgerald'),
  ('Moby Dick', 'Herman Melville'),
  ('Pride and Prejudice', 'Jane Austen'),
  ('War and Peace', 'Leo Tolstoy');