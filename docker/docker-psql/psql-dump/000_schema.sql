CREATE TABLE public.books_details (
  id serial PRIMARY KEY NOT NULL,
  isbn VARCHAR(255),
  lang VARCHAR(255),
  publisher VARCHAR(255),
  created_at timestamp with time zone DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE public.books (
  id serial PRIMARY KEY NOT NULL,
  title VARCHAR(255),
  author VARCHAR(255),
  details_id INT NOT NULL,
  created_at timestamp with time zone DEFAULT CURRENT_TIMESTAMP,
  FOREIGN KEY (details_id) REFERENCES books_details(id)
);

CREATE TABLE public.books_tags (
  id serial PRIMARY KEY NOT NULL,
  value VARCHAR(255),
  book_id INT NOT NULL,
  created_at timestamp with time zone DEFAULT CURRENT_TIMESTAMP,
  FOREIGN KEY (book_id) REFERENCES books(id)
);