package task_0421_inheritance.ohgiraffers.hw1.run;

import ch04_inheritance.ch07.sec07.exam01.E;
import java.util.Scanner;
import task_0421_inheritance.ohgiraffers.hw1.model.dto.EmployeeDTO;
import task_0421_inheritance.ohgiraffers.hw1.model.dto.StudentDTO;

public class Application {

    public static void main(String[] args) {
        StudentDTO[] students = new StudentDTO[3];

        students[0] = new StudentDTO("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
        students[1] = new StudentDTO("김말똥", 21, 187.3, 80.0, 2, "경영학과");
        students[2] = new StudentDTO("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");

        for (StudentDTO student : students) {
            System.out.println(student.information());
        }

        EmployeeDTO[] employees = new EmployeeDTO[10];
        Scanner sc = new Scanner(System.in);
        String addEmployee = "y";
        int count = 0;
        while("y".equals(addEmployee) || "Y".equals(addEmployee)) {

            System.out.println("사원 정보를 입력하세요.");
            System.out.println("이름 : ");
            String name = sc.next();

            System.out.println("나이 : ");
            int age = Integer.parseInt(sc.next());

            System.out.println("키 : ");
            double height = Double.parseDouble(sc.next());

            System.out.println("몸무게 : ");
            double weight = Double.parseDouble(sc.next());

            System.out.println("급여 : ");
            int salary = Integer.parseInt(sc.next());

            System.out.println("부서 : ");
            String dept = sc.next();

            employees[count] = new EmployeeDTO(name, age, height, weight, salary, dept);
            count ++;

            if (count == 10) {
                System.out.println("10명까지 입력이 가능합니다.");
                break;
            }

            System.out.println("최대 10명 입력 가능 (현재 : " + count + "/10)");
            System.out.println("추가 입력 하시겠습니까? (y 또는 Y 입력)");
            addEmployee = sc.next();
        }

        for (int i = 0; i < count; i++) {
            System.out.println(employees[i].information());
        }

    }
}
