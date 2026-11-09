# RivalSMP — 1.20.4-to-1.21.11

This is a separate source project targeting Paper 1.20.4-to-1.21.11. It currently contains safe utility features only: configurable chat announcements and `/rivalsmp help`, `/rivalsmp info`, and `/rivalsmp reload`.

## Build
Push this folder to a GitHub repository and open **Actions**. The workflow builds the JAR and uploads it as an artifact.

## Important compatibility note
This project is compiled against Paper API 1.20.4-R0.1-SNAPSHOT. A successful compile does not prove compatibility with every patch release in the requested range; test on each server version before production use.

This is not a complete port of the uploaded RivalSMP source. Custom weapon/combat systems and other unported features are intentionally not included.
