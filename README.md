
# Cricket Stats Management System

This project is a **Cricket Stats Management System** designed to manage players, teams, and match records for a cricket league, similar to the IPL (Indian Premier League). The application keeps track of team statistics, player performance, and match outcomes, updating all related data dynamically.

---

## Features
- **Player Management**:
  - Add players to teams with details like total runs and matches played.
  - Automatically calculate and store a player's batting average (to two decimal places).

- **Team Management**:
  - Add teams with details like total matches, wins, and losses.
  - Maintain a list of players associated with each team.

- **Match Management**:
  - Record match results, including scores for each team.
  - Automatically update team and player statistics based on match results.

---

## Technologies Used
- **Backend**: Spring Boot (Java)
- **Database**: MySQL
- **ORM**: Hibernate with JPA
- **Tools**:
  - Postman for API testing.
  - IntelliJ IDEA for development.

---

## Project Structure

```
src/main/java/com/example
|-- Controller
|   |-- PlayerController.java
|   |-- TeamController.java
|-- DAO
|   |-- PlayerDao.java
|   |-- TeamDao.java
|-- Entity
|   |-- Player.java
|   |-- Team.java
|-- Service
    |-- PlayerService.java
    |-- TeamService.java
```

### Entity Classes
1. **Player**
   - Attributes: `playerId`, `playerName`, `team`, `totalRuns`, `totalMatches`, `playerAvg`.
   - Automatically calculates and updates `playerAvg`.

2. **Team**
   - Attributes: `teamId`, `teamName`, `totalMatches`, `totalWins`, `totalLosses`.

### API Endpoints

#### Team
- **Add Team**:
  - `POST /api/team/addteam`
  - Request Body:
    ```json
    {
      "teamName": "Mumbai Indians",
      "totalMatches": 14,
      "totalWins": 10,
      "totalLosses": 4
    }
    ```
- **Add Multiple Teams**:
  - `POST /api/team/addmultipleteams`

#### Player
- **Add Player**:
  - `POST /api/player/addplayer`
  - Request Body:
    ```json
    {
      "playerName": "Virat Kohli",
      "team": {
        "teamId": 1
      },
      "totalRuns": 500,
      "totalMatches": 10
    }
    ```

---

## Prerequisites
1. Install Java 17 or higher.
2. Install MySQL Server.
3. Install an IDE like IntelliJ IDEA.
4. Install Postman for API testing.

---

## Setup Instructions
1. Clone the repository:
   ```bash
   git clone <repository-url>
   ```

2. Navigate to the project directory:
   ```bash
   cd cricket-stats-management
   ```

3. Configure the database in `application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/cricket_db
   spring.datasource.username=<your-username>
   spring.datasource.password=<your-password>
   spring.jpa.hibernate.ddl-auto=update
   ````

4. Run the application:
   ```bash
   mvn spring-boot:run
   ```

5. Test the APIs using Postman.

---

## Future Enhancements
- Add match records with automatic result computation.
- Implement authentication and authorization.
- Create a frontend using React or Angular.

---

## License
This project is licensed under the MIT License. See the LICENSE file for details.

