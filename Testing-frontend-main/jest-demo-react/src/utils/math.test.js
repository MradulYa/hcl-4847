import { add, subtract, multiply } from "./math.js";

describe("Math Utility Testing", () => {
  test("should add two numbers", () => {
    expect(add(10, 20)).toBe(30);
  });

  test("should subtract two numbers", () => {
    expect(subtract(10, 20)).toBe(-10);
  });

  test("should multiply two numbers", () => {
    expect(multiply(10, 20)).toBe(200);
  });
});
