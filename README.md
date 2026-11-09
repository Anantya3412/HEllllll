# RivalSMP — Paper 1.20.4 to 1.21.11

This repository contains a GitHub-ready Paper plugin project with basic server utilities:
- Join, quit and welcome messages
- `/rivalsmp help`
- `/rivalsmp info`
- `/rivalsmp reload`
- `/announce <message>`
- Configurable messages and permission checks

## Important scope note

This is a standalone safe utility edition. It does **not** contain the custom weapon or combat systems from the original RivalSMP project.

## Compatibility

- Built against Paper API `1.20.4-R0.1-SNAPSHOT`
- Compiled for Java 21
- Uses the stable Bukkit/Paper API surface in this project
- Intended for Paper 1.20.4–1.21.11; test on your exact server build before production use

This project has not been independently tested against every server release in that range.

## Build with GitHub Actions (no local Maven needed)

1. Create a GitHub repository.
2. Upload all files and folders from this project.
3. Open **Actions**.
4. Select **Build RivalSMP (Paper 1.20.4 - 1.21.11)**.
5. Run the workflow, or push a commit to trigger it.
6. Open the completed workflow run and download the artifact named `RivalSMP-Paper-1.20.4-to-1.21.11`.
7. Put the downloaded `.jar` directly in your server's `plugins` folder.
8. Restart the server.

## Build locally

Requirements: JDK 21 and Maven 3.9+.

Run `build.bat` on Windows, or run:

```bash
mvn clean package
```

The JAR is created at:

```text
target/RivalSMP-1.20.4-to-1.21.11.jar
```

## Commands

| Command | Description | Permission |
|---|---|---|
| `/rivalsmp help` | Show help | everyone |
| `/rivalsmp info` | Show plugin/server info | everyone |
| `/rivalsmp reload` | Reload config | `rivalsmp.admin` |
| `/announce <message>` | Broadcast announcement | `rivalsmp.admin` |

`rivalsmp.admin` defaults to server operators.

## Configuration

Edit `plugins/RivalSMP/config.yml`, then use `/rivalsmp reload`.
