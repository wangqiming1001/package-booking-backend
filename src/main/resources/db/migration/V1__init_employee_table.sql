CREATE TABLE employee (
  id INTEGER PRIMARY KEY,
  name VARCHAR(64) NOT NULL,
  age   int(4) NOT NULL
);

CREATE TABLE storage (
  id VARCHAR(100) PRIMARY KEY,
  orderNumber VARCHAR(100) NOT NULL,
  name VARCHAR(64) NOT NULL,
  phone VARCHAR(100) NOT NULL,
  weight  VARCHAR(100) NOT NULL,
  timeOfAppointment VARCHAR(100),
  state VARCHAR(10)
);