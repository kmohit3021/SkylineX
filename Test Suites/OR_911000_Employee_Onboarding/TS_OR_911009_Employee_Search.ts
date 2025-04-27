<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>TS_OR_911009_Employee_Search</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>3</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>236a8a79-d24d-4cac-ad28-4de244d7b105</testSuiteGuid>
   <testCaseLink>
      <guid>ea738659-6cf3-48b4-af66-2b51e27534b5</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/OR_910001_Employee_Onboarding/TC_OR_910007_Employee_Login</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>1452504c-8b07-49c3-a275-f980ac10c80d</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/OR_910001_Employee_Onboarding/TC_OR_910009_PIM_Employee_Search</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>088f6a87-2a8d-4107-8e69-04ec57a49a8b</id>
         <iterationEntity>
            <iterationType>RANGE</iterationType>
            <value>1-5</value>
         </iterationEntity>
         <testDataId>Data Files/Employee_Onboarding/Employee_Date</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>088f6a87-2a8d-4107-8e69-04ec57a49a8b</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>FullName2</value>
         <variableId>758e9c0f-03bf-4bb6-b8a4-16e90fdf550e</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
