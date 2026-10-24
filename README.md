# Expense Reimbursement: Split Backend Prototypes

An early Java and PostgreSQL reimbursement project with employee and administrator functionality organized into separate Maven project directories.

## Problem and approach

Expense handling has two perspectives: an employee needs to review personal requests, while an administrator needs to inspect employees and review reimbursement records. This repository explores those responsibilities through separate services, DAOs, and HTTP entry points.

## Project layout

| Location | Responsibility |
| --- | --- |
| [pom.xml](pom.xml), [src/main/java/](src/main/java/) | Root employee-side prototype and JDBC data access. |
| [ReimbursementsMain.java](src/main/java/main/ReimbursementsMain.java) | Employee-side Javalin entry point. |
| [expense-reimbursement-system/](expense-reimbursement-system/) | Separate administrator-side Maven project. |
| [ERSMain.java](expense-reimbursement-system/src/main/java/endpoints/ERSMain.java) | Administrator-side routes for employee records, expenses, pending requests, and resolved requests. |
| [DatabaseScript](src/main/resources/DatabaseScript) | Initial PostgreSQL schema draft. |

Each project separates data objects, database access, and service logic. Both HTTP entry points use port 4040, so they are alternatives to run separately rather than services that can use the same host port simultaneously.

## Technologies

Java, Maven, Javalin 4.3.0, Jackson, PostgreSQL JDBC, and logging dependencies.

## Explore locally

1. Import the root project or nested project into a Java IDE as a Maven project.
2. Review the selected project's database utility and schema. The committed database names differ between modules and must be aligned with the local database.
3. Configure a compatible Java compiler level in the development environment; these Maven descriptors do not explicitly select one.
4. Launch the selected entry point on port 4040 after resolving the prototype's configuration and implementation gaps.

## Current scope

This is a development snapshot, not a completed integration. The root pending-request handler currently parses a null employee ID; the nested administrator DAO also contains an unfinished newest-expense method. The SQL file is a schema draft that needs review before execution.

## Portfolio focus

Separating employee and administrator concerns, organizing a layered Java backend, mapping database records to objects, and identifying the integration work needed when combining independently developed modules. Related repositories contain combined, containerized, and Spring-based versions of the same reimbursement domain.
