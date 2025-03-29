
# Blogging App

## Overview

This is a full-stack Blog Application that allows users to create, edit, and publish blog posts with categorized tags. The project is deployed on GitHub and is built using the following technologies:


## Tech Stack

### Frontend:

React.js - A popular JavaScript library for building fast and interactive user interfaces.

TypeScript - A strongly typed superset of JavaScript that helps improve code quality and maintainability.

Vite - A modern frontend build tool that provides a fast development environment with hot module replacement.

### Backend:

Spring Boot - A powerful framework for building Java-based web applications, simplifying backend development with its convention-over-configuration approach.

Hibernate - A Java-based ORM (Object-Relational Mapping) framework that handles database interactions efficiently.

H2 Database - A lightweight, in-memory database used for quick and easy development and testing.

Spring Security - A security framework that provides authentication and authorization capabilities to secure the application.
## Features

1. User Authentication (Login) - Secure login functionality to ensure only authorized users can access the system.

2. Create Posts - Users can compose and add new blog posts to share their content.

3. Edit Posts - Modify existing posts with updated content as needed.

4. Create Tags - Users can generate custom tags to categorize their posts for better discoverability.

5. Create Categories - Organize posts into categories to make navigation easier for readers.

6. Save Draft Posts - Allows users to save unfinished posts as drafts and continue editing later.

7. Publish Posts - Enables users to make their blog posts publicly visible once they are ready.
## How to Use the Application

### Step 1: Follow these steps to set up and run the project locally:

1. Clone the frontend repository from GitHub.

2. Navigate to the project directory.

3. Install dependencies using the following command:
```bash
  npm install
```
4. Start the development server:

```bash
  npm run dev
```
The frontend will run on http://localhost:5173

### Step 2: Set Up the Backend
1. Clone the backend repository from GitHub.

2. Open the project in IntelliJ IDEA (or any preferred IDE).

3. Run the Spring Boot application.

4. The backend server will be available at http://localhost:8080.
## API Endpoints

#### App API (Spring Boot)
```http
  GET /api/items
```

| Method | Endpoints     | Description                |
| :-------- | :------- | :------------------------- |
| `GET` | `/api/posts` | N/A |
| `POST` | `/api/posts` | { "title": "Post Title", "content": "Post content...", "tags": ["tag1", "tag2"], "category": "Category Name" } |
| `POST` | `/api/auth/login` | { "username": "user", "password": "password" } |
| `DELETE` | `/api/posts/{id}` | N/A |



![Screenshot (98)](https://github.com/user-attachments/assets/595a8ae1-c04a-4322-a78d-d72e6839e98e)

![Screenshot (96)](https://github.com/user-attachments/assets/ce160cf7-8bfb-4b1a-a29d-9ac9772dac6f)

![Screenshot (97)](https://github.com/user-attachments/assets/2b731831-bdb8-4a4d-971a-5066d706dd7c)

![Screenshot (99)](https://github.com/user-attachments/assets/3cf9a135-21bb-484c-8924-b44ccc358749)

![Screenshot (100)](https://github.com/user-attachments/assets/5fd78ccd-eeff-4592-aabd-67296b9fa893)

![Screenshot (101)](https://github.com/user-attachments/assets/3e349527-7906-4f61-b2d0-879190a236d1)




[![MIT License](https://img.shields.io/badge/License-MIT-green.svg)](https://choosealicense.com/licenses/mit/)

[![GPLv3 License](https://img.shields.io/badge/License-GPL%20v3-yellow.svg)](https://opensource.org/licenses/)

[![AGPL License](https://img.shields.io/badge/license-AGPL-blue.svg)](http://www.gnu.org/licenses/agpl-3.0)

