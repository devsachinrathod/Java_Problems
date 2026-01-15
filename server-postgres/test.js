const { insertUser, getAllUsers } = require("./services");

async function run() {
  try {
    await insertUser("John", "john@example.com");
    await insertUser("Sachin", "sachin@example.com");

    await getAllUsers();
  } catch (err) {
    console.error("Error:", err);
  } finally {
    process.exit(0);
  }
}

run();
