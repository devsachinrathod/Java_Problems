const pool = require("./db");

// INSERT FUNCTION
async function insertUser(name, email) {
  const query = `
    INSERT INTO users (name, email)
    VALUES ($1, $2)
    RETURNING *
  `;

  const result = await pool.query(query, [name, email]);
  console.log("Inserted User:", result.rows[0]);

  return result.rows[0];
}

// DISPLAY ALL USERS
async function getAllUsers() {
  const query = `SELECT * FROM users ORDER BY id ASC`;
  const result = await pool.query(query);

  console.log("All Users:", result.rows);
  return result.rows;
}

module.exports = { insertUser, getAllUsers };
