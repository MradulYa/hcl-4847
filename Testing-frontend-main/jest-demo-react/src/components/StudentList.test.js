import { render, screen } from "@testing-library/react";

import StudentList from "./StudentList";

import { getStudents, deleteStudent } from "../service/studentService";

// Mock entire module
jest.mock("../service/studentService", () => ({
  getStudents: jest.fn(),

  deleteStudent: jest.fn(),
}));

describe("Student List Testing", () => {
  test("should display students", async () => {
    getStudents.mockResolvedValue({
      data: [
        { id: 1, name: "Rahul" },
        { id: 2, name: "Amit" },
        { id: 3, name: "Priya" },
      ],
    });

    render(<StudentList />);

    expect(await screen.findByText("Rahul")).toBeInTheDocument();

    expect(screen.getByText("Amit")).toBeInTheDocument();

    expect(screen.getByText("Priya")).toBeInTheDocument();

    expect(getStudents).toHaveBeenCalledTimes(1);
  });
});
