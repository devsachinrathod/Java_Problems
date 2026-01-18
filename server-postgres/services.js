const pool = require("./db");
const express = require("express");
const app = express();

app.use(express.json());

/* ===============================
   CREATE TABLE ON SERVER START
   =============================== */
async function createUsersTable() {
  const query = `
    CREATE TABLE IF NOT EXISTS users (
      id SERIAL PRIMARY KEY,
      name VARCHAR(100) NOT NULL,
      email VARCHAR(150) NOT NULL UNIQUE,
      created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
    );
  `;

  try {
    const client = await pool.connect();
    await client.query(query);
    client.release();
    console.log("Users table is ready");
  } catch (error) {
    console.error("Error creating users table:", error);
  }
}
  async function createFeedbackTable() {
    const query = `
      CREATE TABLE IF NOT EXISTS feedback (
        id SERIAL PRIMARY KEY,
        user_id INTEGER REFERENCES users(id),
        name VARCHAR(100) NOT NULL,
        description TEXT NOT NULL,
        created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
        price INTEGER NOT NULL
      );
    `;
    try {
      const client = await pool.connect();
      await client.query(query);
      client.release();
      console.log("Feedback table is ready");
    }
    catch (error) {
      console.error("Error creating feedback table:", error);
    }
  }

async function createCropsTable() {
  const query = `
    CREATE TABLE IF NOT EXISTS crops (
      id SERIAL PRIMARY KEY,
      name VARCHAR(100) NOT NULL,
      description TEXT NOT NULL,
      quantity INTEGER NOT NULL,
      price INTEGER NOT NULL,
      location VARCHAR(150) NOT NULL,
      contact_info INTEGER NOT NULL,
      created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
    );
  `;
  try {
    
    const client = await pool.connect();
    await client.query(query);
    client.release();
    console.log("Crops table is ready");
  } catch (error) {
    console.error("Error creating crops table:", error);
  }
}

/* ===============================
   SIGN UP
   =============================== */
app.post("/auth/signup", async (req, res) => {
  const { name, email } = req.body;

  if (!name || !email) {
    return res.status(400).json({
      error: "Name and email are required"
    });
  }

  try {
    const client = await pool.connect();

    const insertQuery = `
      INSERT INTO users (name, email)
      VALUES ($1, $2)
      RETURNING id
    `;

    const result = await client.query(insertQuery, [name, email]);
    client.release();

    return res.status(201).json({
      message: "User created successfully",
      userId: result.rows[0].id
    });

  } catch (err) {
    console.error(err);

    if (err.code === "23505") {
      return res.status(409).json({
        error: "Email already exists"
      });
    }

    return res.status(500).json({
      error: "Database error"
    });
  }
});

/* ===============================
   GET ALL USERS
   =============================== */
app.get("/users", async (req, res) => {
  try {
    const client = await pool.connect();
    const result = await client.query("SELECT * FROM users");
    client.release();

    return res.status(200).json({
      users: result.rows
    });
  } catch (err) {
    console.error("Error fetching users:", err);
    return res.status(500).json({
      error: "Database error"
    });
  }
});

/* ===============================
   SIGN IN (EMAIL-BASED)
   =============================== */
app.post("/auth/signin", async (req, res) => {
  const { email } = req.body;

  if (!email) {
    return res.status(400).json({
      error: "Email is required"
    });
  }

  try {
    const client = await pool.connect();

    const query = `
      SELECT id, name, email
      FROM users
      WHERE email = $1
    `;

    const result = await client.query(query, [email]);
    client.release();

    if (result.rows.length === 0) {
      return res.status(401).json({
        error: "User not found"
      });
    }

    return res.status(200).json({
      message: "Signin successful",
      user: result.rows[0]
    });

  } catch (err) {
    console.error("Signin error:", err);
    return res.status(500).json({
      error: "Database error"
    });
  }
});

/* ===============================
    FEEDBACK INSERT
   =============================== */
app.post("/feedback", async (req, res) => {
  const { user_id, name, description, price } = req.body;

  if (!user_id || !name || !description || !price) {
    return res.status(400).json({
      error: "All fields are required"
    });

  }
  const insertQuery = `
    INSERT INTO feedback (user_id, name, description, price)
    VALUES ($1, $2, $3, $4)
    `;
  
  try {
    const insetedResult = await pool.query(insertQuery, [user_id, name, description, price]);
    return res.status(201).json({
      message: "Feedback submitted successfully"
    });
  } catch (err) {
    console.error("Error inserting feedback:", err);
    return res.status(500).json({ 
      error: "Database error"
    });
  }
});

app.put("/feedback/:id", async (req, res) => {
  const feedbackId = req.params.id;
  const { name, description, price } = req.body;
  if (!name || !description || !price) {
    return res.status(400).json({
      error: "All fields are required"
    });
  }

  const updateQuery = `
    UPDATE feedback
    SET name = $1, description = $2, price = $3
    WHERE id = $4
    `;

  try {
    
    const updatedResult = await pool.query(updateQuery, [name, description, price, feedbackId]);
    return res.status(200).json({
      message: "Feedback updated successfully"
    });
  } catch (err) {
    console.error("Error updating feedback:", err);
    return res.status(500).json({ 
      error: "Database error"
    });
  }
});

app.get("/feedbacks", async (req, res) => {
  try {
    const result = await pool.query("SELECT * FROM feedback");
    return res.status(200).json(result.rows);
  } catch (err) {
    console.error("Error fetching feedbacks:", err);
    return res.status(500).json({
      error: "Database error"
    });
  }
});

/* ===============================
   post crops buy and sell API
   =============================== */
app.post("/crops", async (req, res) => {
  
  const { name, description, quantity, price, location, contact_info } = req.body;

  if (!name || !description || !quantity || !price || !location || !contact_info) {
    return res.status(400).json({
      error: "All fields are required"
    });
  }
  const insertQuery = `
    INSERT INTO crops (name, description, quantity, price, location, contact_info)
    VALUES ($1, $2, $3, $4, $5, $6)
    `;
  try {
    const insetedResult = await pool.query(insertQuery, [name, description, quantity, price, location, contact_info]);
    return res.status(201).json({
      message: "Crop added successfully"
    });
  } catch (err) {
    console.error("Error inserting crop:", err);
    return res.status(500).json({
      
      error: "Database error"
    });
}
});

app.put("/crops/:id", async (req, res) => {
  const cropId = req.params.id;
  const { name, description, quantity, price, location, contact_info } = req.body;
  if (!name || !description || !quantity || !price || !location || !contact_info) {
    return res.status(400).json({
      error: "All fields are required"
    });
  }
  const updateQuery = `
    UPDATE crops
    SET name = $1, description = $2, quantity = $3, price = $4, location = $5, contact_info = $6
    WHERE id = $7
    `;
  try {
    const updatedResult = await pool.query(updateQuery, [name, description, quantity, price, location, contact_info, cropId]);
    return res.status(200).json({
    
      message: "Crop updated successfully"
    });
  } catch (err) {
    console.error("Error updating crop:", err);
    return res.status(500).json({
      error: "Database error"
    });
  }
});

app.get("/all-crops", async (req, res) => {
  try {
    const result = await pool.query("SELECT * FROM crops");
    return res.status(200).json(result.rows);
  } catch (err) {
    console.error("Error fetching crops:", err);
    return res.status(500).json({
      error: "Database error"
    });
  }
}
);

/* ===============================
   START SERVER
   =============================== */
const PORT = 3000;

createUsersTable();
createFeedbackTable();
createCropsTable();

app.listen(PORT, () => {
  console.log(`Server is running on port ${PORT}`);
});
