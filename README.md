# ☕ Java Multiple Choice Quiz Application

<div align="center">

![Quiz Application Logo](https://img.shields.io/badge/☕-Java%20Quiz%20App-orange?style=for-the-badge&logo=java&logoColor=white)

[![GitHub stars](https://img.shields.io/github/stars/yourusername/quiz-application?style=social)](https://github.com/yourusername/quiz-application/stargazers)
[![GitHub forks](https://img.shields.io/github/forks/yourusername/quiz-application?style=social)](https://github.com/yourusername/quiz-application/network)
[![GitHub issues](https://img.shields.io/github/issues/yourusername/quiz-application)](https://github.com/yourusername/quiz-application/issues)
[![License](https://img.shields.io/github/license/yourusername/quiz-application)](LICENSE)

*A desktop quiz application built with Java AWT/Swing featuring login system, timer, and interactive MCQ interface*

[🐛 Report Bug](https://github.com/yourusername/quiz-application/issues) | [✨ Request Feature](https://github.com/yourusername/quiz-application/issues)

</div>

---

## 📋 Table of Contents

- [✨ Features](#-features)
- [🎯 Demo](#-demo)
- [🛠️ Technologies Used](#️-technologies-used)
- [⚡ Quick Start](#-quick-start)
- [📦 Installation](#-installation)
- [🎮 Usage](#-usage)
- [🏗️ Project Structure](#️-project-structure)
- [🤝 Contributing](#-contributing)
- [📝 License](#-license)
- [🙏 Acknowledgments](#-acknowledgments)

---

## ✨ Features

<div align="center">

| Feature | Description | Status |
|---------|-------------|--------|
| 🔐 **User Authentication** | Secure login system with username and password | ✅ |
| ⏱️ **Timer Functionality** | 30-second countdown timer for each question | ✅ |
| 📊 **Real-time Scoring** | Live score tracking and percentage calculation | ✅ |
| 🎯 **MCQ Interface** | Multiple choice questions with radio button selection | ✅ |
| 🔄 **Question Randomization** | Questions are shuffled for each quiz attempt | ✅ |
| 📈 **Results Display** | Detailed results with score and percentage | ✅ |
| 🔄 **Retake Option** | Ability to restart the quiz from results screen | ✅ |
| 🖼️ **Visual Feedback** | Image indicators for selected/unselected answers | ✅ |

</div>

> ✅ Completed | 🚧 In Progress | ❌ Planned

---

## 🎯 Demo

<div align="center">

### 🖥️ Application Flow

```
┌─────────────────┐    ┌─────────────────┐    ┌─────────────────┐    ┌─────────────────┐
│   Login Screen  │───▶│  Quiz Interface │───▶│ Question Timer  │───▶│ Results Screen  │
│                 │    │                 │    │                 │    │                 │
│  👤 Username    │    │  📝 Question 1  │    │   ⏱️ 00:00:15   │    │  🏆 Score: 8/9  │
│  🔐 Password    │    │  ⚪ Option A    │    │   🟠 Hurry Up!  │    │  📊 89% Pass   │
│  🚪 Login       │    │  ⚫ Option B    │    │   ✅ Selected   │    │  🔄 Retest     │
└─────────────────┘    │  ⚪ Option C    │    │   ➡️ Next       │    │  🚪 Exit       │
                       │  ⚪ Option D    │    └─────────────────┘    └─────────────────┘
                       │  ➡️ Next        │
                       └─────────────────┘
```

### 🎮 Try It Yourself

1. **Download** the source code from this repository
2. **Compile** using `javac *.java`  
3. **Run** with `java LoginPMcq`
4. **Login** with username: `user` and password: `123`
5. **Experience** the interactive Java quiz application!

### 📋 Sample Questions Preview

```java
// Example questions from the application:
❓ "What is name of java compiler?"
   → javac ✅

❓ "What is full form of JVM?"  
   → java virtual machine ✅

❓ "Choose comparison operator"
   → == ✅

❓ "Package is used for event handling"
   → java.awt.event ✅
```

</div>

---

## 🛠️ Technologies Used

<div align="center">

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![AWT](https://img.shields.io/badge/AWT-Swing-orange?style=for-the-badge&logo=java&logoColor=white)

</div>

### Core Technologies
- **Java SE** - Core programming language
- **AWT (Abstract Window Toolkit)** - GUI framework for desktop interface
- **Swing Components** - Enhanced UI components
- **Threading** - For timer implementation
- **Collections Framework** - ArrayList for question management

### Key Java Features Used
- **Object-Oriented Programming** - Classes and inheritance
- **Event Handling** - ActionListener and ItemListener interfaces
- **Multithreading** - Runnable interface for timer functionality
- **Graphics** - Custom painting and image display

---

## ⚡ Quick Start

Get the Java Quiz Application up and running in just a few steps:

```bash
# 1️⃣ Clone the repository
git clone https://github.com/yourusername/quiz-application.git

# 2️⃣ Navigate to project directory
cd quiz-application

# 3️⃣ Compile all Java files
javac *.java

# 4️⃣ Run the application
java LoginPMcq

# 🎉 Login with username: "user" and password: "123"
```

### 🎮 Default Login Credentials
- **Username:** `user`
- **Password:** `123`

---

## 📦 Installation

### Prerequisites

Make sure you have the following installed:
- **Java Development Kit (JDK)** (v8 or higher) - [Download](https://www.oracle.com/java/technologies/downloads/)
- **Java Runtime Environment (JRE)** - Usually included with JDK
- **Git** - [Download](https://git-scm.com/)

### Step-by-Step Installation

1. **Clone the Repository**
   ```bash
   git clone https://github.com/yourusername/quiz-application.git
   cd quiz-application
   ```

2. **Compile Java Files**
   ```bash
   # Compile all Java source files
   javac *.java
   
   # Alternative: Compile with classpath
   javac -cp . *.java
   ```

3. **Prepare Resources**
   ```bash
   # Make sure these image files are in the project directory:
   # - st.jpg (for unselected state)
   # - yes.jpg (for selected state)  
   # - t.gif (for results screen)
   ```

4. **Run the Application**
   ```bash
   # Start the login screen
   java LoginPMcq
   ```

5. **For Development**
   ```bash
   # Run individual components for testing
   java Timer      # Test timer functionality
   java PMcq       # Test quiz directly (skip login)
   ```

---

## 🎮 Usage

### Login Process

1. **Launch Application** - Run `java LoginPMcq`
2. **Enter Credentials** - Username: `user`, Password: `123`  
3. **Click Login** - Access the quiz interface

### Taking the Quiz

1. **Read Question** - Each question appears with 4 multiple choice options
2. **Select Answer** - Click on radio buttons to choose your answer
3. **Monitor Timer** - 30-second countdown for each question
   - 🟢 **Green** (30-20 seconds): Plenty of time
   - 🟠 **Orange** (19-10 seconds): Hurry up!
   - 🔴 **Red** (9-0 seconds): Time running out!
4. **Next Question** - Click "Next" to proceed or wait for auto-advance
5. **Visual Feedback** - See checkmark/cross images based on selection

### After Quiz Completion

- 📊 **View Results** - See your total score and percentage
- 🔄 **Retake Quiz** - Click "Retest" to try again with shuffled questions
- 🚪 **Exit** - Close the application

### Sample Quiz Questions

The quiz includes Java programming questions such as:
- Java compiler and interpreter names
- JVM full form
- Java keywords and operators
- Package information
- Exception handling
- Applet basics

---

## 🏗️ Project Structure

```
quiz-application/
├── 📁 src/
│   ├── 📄 LoginPMcq.java      # 🔐 Login screen with authentication
│   ├── 📄 PMcq.java           # 🎯 Main quiz interface with timer
│   ├── 📄 Question.java       # 📝 Question data model
│   ├── 📄 ResWin.java         # 📊 Results display window
│   └── 📄 Timer.java          # ⏱️ Standalone timer component
├── 📁 assets/
│   ├── 🖼️ st.jpg             # ❌ Unselected answer indicator
│   ├── 🖼️ yes.jpg            # ✅ Selected answer indicator  
│   └── 🖼️ t.gif              # 🏆 Results celebration image
├── 📄 README.md
├── 📄 .gitignore
└── 📄 LICENSE

### 📄 File Descriptions

- **LoginPMcq.java** - Entry point with user authentication
- **PMcq.java** - Core quiz logic, timer, and question display
- **Question.java** - Simple data class for quiz questions
- **ResWin.java** - Results screen with score and restart options
- **Timer.java** - Standalone timer utility for testing
```

---

## 🤝 Contributing

We love contributions! Here's how you can help make this project even better:

### 🌟 Ways to Contribute

- 🐛 **Report Bugs** - Found a bug? Let us know!
- 💡 **Suggest Features** - Have an idea? We'd love to hear it!
- 🔧 **Submit Pull Requests** - Code contributions are welcome!
- 📖 **Improve Documentation** - Help us make docs clearer
- ✅ **Add Tests** - Help improve code coverage

### 📝 Contribution Guidelines

1. **Fork the Project**
2. **Create your Feature Branch** (`git checkout -b feature/AmazingFeature`)
3. **Commit your Changes** (`git commit -m 'Add some AmazingFeature'`)
4. **Push to the Branch** (`git push origin feature/AmazingFeature`)
5. **Open a Pull Request**

### 🎯 Development Setup

```bash
# Fork and clone your fork
git clone https://github.com/YOUR_USERNAME/quiz-application.git

# Add upstream remote
git remote add upstream https://github.com/yourusername/quiz-application.git

# Create a new branch for your feature
git checkout -b feature-name

# Make your changes and commit
git add .
git commit -m "Description of changes"

### 📝 Contribution Guidelines

1. **Fork the Project**
2. **Create your Feature Branch** (`git checkout -b feature/AmazingFeature`)
3. **Commit your Changes** (`git commit -m 'Add some AmazingFeature'`)
4. **Push to the Branch** (`git push origin feature/AmazingFeature`)
5. **Open a Pull Request**

### 🎯 Development Setup

```bash
# Fork and clone your fork
git clone https://github.com/YOUR_USERNAME/quiz-application.git

# Add upstream remote
git remote add upstream https://github.com/yourusername/quiz-application.git

# Create a new branch for your feature
git checkout -b feature-name

# Make your changes and commit
javac *.java  # Test compilation
java LoginPMcq  # Test functionality

git add .
git commit -m "Description of changes"

# Push your changes
git push origin feature-name
```

### 💡 Ideas for Contribution

- 📚 **Add More Questions** - Expand the question database
- 🎨 **UI Improvements** - Enhance the visual design
- 🔊 **Sound Effects** - Add audio feedback
- 📱 **Mobile UI** - Create responsive design
- 🏆 **High Scores** - Add persistent score storage
- 📂 **Question Categories** - Organize questions by topics
- 🌐 **Database Integration** - Connect to external database
- 🎯 **Difficulty Levels** - Implement easy/medium/hard modes

---

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

## 🙏 Acknowledgments

- Thanks to the Java AWT/Swing documentation for GUI guidance
- Inspiration from classic desktop quiz applications
- Special thanks to all contributors and testers

---

## 📞 Support

If you have any questions or need help with the project:

- 📧 **Email**: singhamritraj898@gmail.com


---

<div align="center">

**Made with ❤️ and ☕ Java**

**Developed by Amrit Raj Singh**

⭐ **Don't forget to star this repository if you found it helpful!** ⭐

[⬆ Back to Top](#-Java-Multiple-Choice-Quiz-Application)

</div>
