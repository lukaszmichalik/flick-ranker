# flick-ranker

Website that allows users to make rankings of their favorite movies and shows. 

**Functionalities**

- Sign in & sign up 
- Browsing sets of movies and tv shows (data provided from external movie API) 
- Rating movies and shows
- Making custom ranking:  
    - Giving particular name to the ranking
    - Optional field for rules/description
    - Making ranking
    - Option for public or private ranking
- Comment section for public rankings
- Liking and disliking rankings
- Searching other users profiles and rankings

**Tech stack**
- `Spring Boot`
- `Maven`
- `Spring Security`
- `Spring Data JPA`
- `Lombok`
- `Vue.js`
- `PostgreSQL`
- `Flyway`
- `Docker`

**Conceptual ER diagram**

![database-erd](docs/erd_diagram.png)

**Retrieving ranking data - example of microservices workflow**

![retrieving-ranking-diagram](docs/retrieving-ranking-diagram.png)