# 🍽🍷 Exercise Description

The goal of this exercise is to create a `Restaurant` class in Java with two attributes and manage a collection of unique restaurant entries using a `HashSet`. 

A restaurant is considered **duplicate** if both its **name** and **score** are the same.  
Restaurants with the same name but **different scores** (or vice versa) are considered different.

### ✅ What You Must Implement

#### 🔹 Restaurant Class
- Create a class `Restaurant` with the following attributes:
  - `String nom` — the name of the restaurant.
  - `int puntuacio` — the score of the restaurant.

#### 🔹 Equality Control
- Override the methods `equals()` and `hashCode()`:
  - Two `Restaurant` objects are equal **only if** they have the **same name and same score**.
  - This ensures that a `HashSet<Restaurant>` will automatically reject duplicates based on these criteria.

#### 🔹 Demonstration in `main()`
- Create several `Restaurant` objects and add them to a `HashSet`.
- Include at least one duplicate (same name and same score) to confirm that it will not be added.
- Print the final content of the `HashSet` to show that only unique restaurants are stored.

---

# 💻 Technologies Used

- Java 17  
- IntelliJ IDEA (Community Edition)  
- Maven  
- Git & GitHub  

---

# 📋 Prerequisites

To run this project, you will need:

- Java JDK 17  
- IntelliJ IDEA Community Edition  
- Git Bash or compatible terminal  
- GitHub account  

---

# 🛠️ Installation and Setup

1. **Install required tools:**
   - Java JDK 17  
   - IntelliJ IDEA Community Edition  
   - Git Bash  

2. **Clone the repository:**
```bash
git clone https://github.com/ArnauAsole/S1.03.JavaCollections.Lv2.Ex1.git
cd ArnauAsole/S1.03.JavaCollections.Lv2.Ex1
Open the project in IntelliJ:

Go to File → Open

Select the project directory

▶️ Running the Project
Open the Main.java file.

Right-click the file and select Run 'Main.main()'.

The output will show:

The list of unique Restaurant objects.

Confirmation that duplicates (same name and score) are ignored.

🌐 Deployment
This is a console-based Java application that runs locally in your IDE or terminal.
There is no need for deployment to a server or external environment.

🤝 Acknowledgements
Thanks to Ana, Alejandro, Adrià, and Ignasi for their encouragement and help throughout the project.
