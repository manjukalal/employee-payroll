package com.bridgelabz;

import com.brigelabz.EmployeePayrollData;
import com.brigelabz.EmployeePayrollService;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class EmployeePayrollServiceTest {
    @Test
    public void given3EmployeeWhenWrittenToFileShouldMatchEmployeeEntries() {
        EmployeePayrollData[] arrayOfEmp = {new EmployeePayrollData(1, "manju", 1000), new EmployeePayrollData(2, "vysh", 2000), new EmployeePayrollData(3, "kalal", 3000)};
        EmployeePayrollService employeePayRollService;          //uc3 save the details in a file --open terminal enter->> more payroll-file.txt
        employeePayRollService = new EmployeePayrollService(Arrays.asList(arrayOfEmp));
        employeePayRollService.writeEmployeePayrollDara(EmployeePayrollService.IOService.FILE_IO);
        long entries = employeePayRollService.countEntries(EmployeePayrollService.IOService.FILE_IO);
        Assert.assertEquals(3, entries);
        employeePayRollService.printData(EmployeePayrollService.IOService.FILE_IO);
        System.out.println("Employee Payroll Service Number of Entries is : " + entries);
    }

    @Test
    public void readTheEmployeePayrollFile() {
        EmployeePayrollService employeePayRollService = new EmployeePayrollService();
        employeePayRollService.readEmployeePayroll(EmployeePayrollService.IOService.FILE_IO);
    }
}
