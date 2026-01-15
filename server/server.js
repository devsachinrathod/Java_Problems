const connectDB = require("./db");
const userSignupSchema = require("./schemas/schema");
const { ObjectId } = require("mongodb");

let db; // global reference

// ---------------- START SERVER ----------------
async function startServer() {
  try {
    db = await connectDB();
    console.log("Server started and DB ready");

    // authenticate + insert user
    const insertedId = await userAuthenticate({
      name: "John",
      email: "john@example.com",
      password: "password123",
      role: "user",
      isVerified: true
    });
      try {


    await displayAllRecords();

  } catch (err) {
    console.error("Startup error:", err);
  }

    // display inserted values
    await displayInsertedUser(insertedId);

    // logs
    await writeLog("Server initialized");
    await writeLog("Database connection successful");
    await writeLog("Application running");

  } catch (err) {
    console.error("Startup error:", err);
  }
}

// ---------------- USER AUTHENTICATE + INSERT ----------------
async function userAuthenticate(data) {
  const parsed = userSignupSchema.safeParse({
    ...data,
    createdAt: new Date(),
    updatedAt: new Date()
  });

  if (!parsed.success) {
    console.error("Validation errors:", parsed.error.errors);
    return null;
  }

  const result = await db.collection("users").insertOne(parsed.data);
  console.log("User inserted with ID:", result.insertedId);

  return result.insertedId;
}

// ---------------- DISPLAY INSERTED USER ----------------
async function displayInsertedUser(insertedId) {
  if (!insertedId) return;

  const user = await db
    .collection("users")
    .findOne({ _id: new ObjectId(insertedId) });

  console.log("Inserted User Details:", user);
  return user;
}

// ---------------- DISPLAY ALL RECORDS ----------------
async function displayAllRecords() {
  const users = await db
    .collection("users")
    .find({})
    .toArray();   // 🔴 THIS WAS MISSING

  console.log("All Users:", users);
  return users;
}

//   const users = await db.collection("users").find({});
//   console.log("All Users:", users);
//   return users;
  
// }
// console.log("Displaying all records:") ;
// const  res = await displayAllRecords();
// console.log(res);
// ---------------- LOGS ----------------
async function writeLog(message) {
  console.log(`[LOG]: ${message}`);

  const result = await db.collection("logs").insertOne({
    message,
    timestamp: new Date()
  });

  console.log("Inserted log ID:", result.insertedId);
}

// ---------------- START APP ----------------
startServer();
