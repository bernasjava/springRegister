<!-- PROJECT LOGO -->
<br />
<p align="center">
  <a href="https://github.com/github_username/repo_name">
    <img src="images/logo.png" alt="Logo" width="80" height="80">
  </a>

  <h3 align="center">Spring Boot Register Application</h3>

  <p align="center">
    Complete backend application for user login and registration using Spring Boot including email verification links
    <br />
    <a href="https://github.com/bernasjava/springRegister"><strong>Explore the docs »</strong></a>
    <br />
    <br />
    <a href="https://github.com/bernasjava/springRegister/issues">Report Bug</a>
    ·
    <a href="https://github.com/bernasjava/springRegister/issues">Request Feature</a>
  </p>
</p>



<!-- TABLE OF CONTENTS -->
<details open="open">
  <summary><h2 style="display: inline-block">Table of Contents</h2></summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#contact">Contact</a></li>
  </ol>
</details>

## About The Project

### Built With

* [Spring Boot](https://spring.io/projects/spring-boot)
* [PostgreSQL](https://www.postgresql.org/)
* [InteliiJ IDEA](https://www.jetbrains.com/idea)
* [MailDev](https://github.com/maildev/maildev)



<!-- GETTING STARTED -->
## Getting Started

To get a local copy up and running follow these simple steps.

### Installation

1. Create database in PostgreSQL
```sh
CREATE DATABASE registration;
```

2. Clone the repo to your IDE
```sh
git clone https://github.com/bernasjava/springRegister.git
```
3. Run MailDev
```sh
$ maildev
```

4. Run springRegister from IDE



<!-- USAGE EXAMPLES -->
## Endpoints and sample requests

Sign in
```sh
/login
```
```sh
POST http://localhost:8080/login
Content-Type: application/json

{
  "username": "jsmith@mail.com",
  "password": "password123"
}
```

Register
```sh
/api/v1/registration
```
```
POST http://localhost:8080/api/v1/registration
Content-Type: application/json

{
  "firstName": "John",
  "lastName": "Smith",
  "email": "jsmith@mail.com",
  "password": "password123"
}
```

Confirm account
```sh
/api/v1/registration/confirm?token=yourtoken
```


<!-- CONTACT -->
## Contact

email: bernasinski.kamil@gmail.com


<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/github_username/repo.svg?style=for-the-badge
[contributors-url]: https://github.com/github_username/repo/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/github_username/repo.svg?style=for-the-badge
[forks-url]: https://github.com/github_username/repo/network/members
[stars-shield]: https://img.shields.io/github/stars/github_username/repo.svg?style=for-the-badge
[stars-url]: https://github.com/github_username/repo/stargazers
[issues-shield]: https://img.shields.io/github/issues/github_username/repo.svg?style=for-the-badge
[issues-url]: https://github.com/github_username/repo/issues
[license-shield]: https://img.shields.io/github/license/github_username/repo.svg?style=for-the-badge
[license-url]: https://github.com/github_username/repo/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://www.linkedin.com/in/kamil-bernasi%C5%84ski-6992611b2/
