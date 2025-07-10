# 🚀 End-to-End Test Automation Framework Using Selenium + Java + Jenkins + GitHub

## 👋 Introduction

Hello everyone!  
I am thrilled to share my recent learning journey and the successful implementation of a complete **Test Automation Framework** built using:

- **Selenium (Java)**
- **TestNG**
- **Jenkins**
- **GitHub**
- **Extent Reports**

This was a hands-on experience where I built the **HealthCura Web App Automation Framework** from scratch and integrated it with CI/CD using Jenkins.

---

## 🧱 Project Overview

📌 **Project Name:** HealthCura Web App  
📁 **Framework Type:** Maven-based Data-Driven Framework  
🔧 **Tools Used:** Selenium, TestNG, Maven, Git, GitHub, Jenkins, Extent Reports  
🌐 **Repository:** [GitHub - HealthCuraProject]( https://github.com/GajananaBV/HealthCuraProject )

---

## 📂 Folder Structure (POM Framework Breakdown)

HealthCuraProject/
│
├── src/
│ ├── main/
│ │ └── java/utilityClass/
│ │ ├── Explicit_waits.java
│ │ └── ExtentReportNG.java
│ └── test/
│ ├── java/base/
│ │ └── Setup.java
│ ├── listeners/
│ │ ├── Listeners.java
│ │ └── Retry.java
│ ├── pages/
│ │ ├── AppointmentPage.java
│ │ ├── LoginPage.java
│ │ └── HomePage.java
│ ├── tests/
│ │ ├── LoginNegativeTest.java
│ │ └── Functional_AppointmentTest.java
│ └── resources/
│ └── config.properties
│
├── testdata.json
├── pom.xml
└── Jenkinsfile (CI integration)


---

## 🧪 Features of the Framework

✅ **Page Object Model (POM)** structure  
✅ **Data-Driven Testing** with JSON  
✅ **TestNG Listeners** with Retry logic  
✅ **Centralized Waits** using `Explicit_waits.java`  
✅ **Beautiful HTML Reports** using Extent Reports  
✅ **Jenkins CI/CD Integration** for automatic test runs  
✅ **Version Control via Git & GitHub**

---

## 🧰 Jenkins Setup & Execution

I created a Jenkins Freestyle Job named `Health_Care_Rel_1.0` to automate execution.

### Steps:
1. **Configure GitHub Repo** in Jenkins.
2. Add build steps:
   - `mvn clean test`
3. Post-build actions:
   - Archive reports
   - Display test results using Extent Reports

✅ Successfully executed 12 builds  
✅ All tests passed in the latest runs  
✅ Email & report notifications ready (optional for future extension)

---

## 📊 Test Reports & Console Output

📸 **Extent Reports:**  
Provides a clean and interactive UI showing pass/fail per test with timestamps.

📟 **Maven Console Output:**

Tests run: 5, Failures: 0, Skipped: 0
BUILD SUCCESS


🧪 Sample Test Scenarios:
- TC_01: Book Appointment
- TC_04: Logout Should Redirect
- TC_05: Appointment Without Date (Negative Case)

---

## 📌 Conclusion

This project gave me practical exposure to building a robust framework and integrating it with modern DevOps tools like Jenkins and GitHub. I now feel confident in:

- Designing scalable Selenium frameworks
- Managing test execution via Jenkins
- Maintaining code in GitHub
- Generating professional reports for stakeholders

---

Thanks & Regards,  
**Gajanan V.B**

