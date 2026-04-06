# SOLID-Principles

**The original code violated several SOLID principles, leading to several issues:**

- Single Responsibility Principle (SRP): The Order interface and OrderAction class had multiple reasons to change. A single class was responsible for calculating prices, processing orders, generating invoices, and sending email notifications. Changes in invoicing or notification logic would force modifications to this monolithic class, increasing complexity and risk.

- Interface Segregation Principle (ISP): The Order interface was "fat" or "monolithic," containing diverse functionalities. Any class implementing this interface, even if it only needed basic order placement, was forced to implement all methods, including those for invoicing and emails, even if not required (as noted in the OrderTest comments). This creates unnecessary dependencies.

- Open/Closed Principle (OCP): Modifying the system to add new notification methods (e.g., SMS) or invoicing formats would require modifying existing classes, making the system less extensible and more fragile.

**UML Diagram**

<img width="1408" height="768" alt="UML Diagram" src="https://github.com/user-attachments/assets/063a1210-c4a8-408c-a9da-c3837883ab12" />
