import { isEligible } from "./student.js";

describe("Check student eligibility", () => {
  test("Student with 85%", () => {
    expect(isEligible(85)).toBe(true);
  });

  test("Stud with 60%", () => {
    expect(isEligible(60)).toBe(false);
  });

  test("Stud with 75%", () => {
    expect(isEligible(75)).toBe(true);
  });

  test("Invalid attendance", () => {
    expect(() => isEligible(110))
    .toThrow("Invalid attendance value");
  });
});
