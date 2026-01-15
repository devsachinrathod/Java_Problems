const { z } = require("zod");

const UserSignupSchema = z.object({
  name: z.string().min(2, "Name must be at least 2 characters"),
  email: z.string().email("Invalid email format"),
  password: z.string().min(8, "Password must be at least 8 characters"),
  role: z.enum(["user", "admin"]).default("user"),
  isVerified: z.boolean().default(false),
  createdAt: z.date(),
  updatedAt: z.date()
});


module.exports = UserSignupSchema;
