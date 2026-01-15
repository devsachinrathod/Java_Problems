const { Pool } = require("pg");

const pool = new Pool({
  connectionString: "postgresql://admin:admin123@localhost:5432/mydatabase"
});

async function connectDB() {
  try {
    const client = await pool.connect();
    console.log("PostgreSQL connected successfully");
    client.release();
  } catch (error) {
    console.error("PostgreSQL connection error:", error);
  }
}

module.exports = pool;
