<h1 align='center'>Android Project Template</h1>

<p align="center">
    <a href="https://img.shields.io/badge/Platform-Android%206.0-36da7e?logo=android&style=for-the-badge">
        <img src="https://img.shields.io/badge/Platform-Android%206.0-36da7e?logo=android&style=for-the-badge" alt="Platform" />
    </a>
</p>

### Features
- 100% Kotlin
- Code formatting - [ktlint](https://github.com/pinterest/ktlint)
- Code analysis - [detekt](https://github.com/detekt/detekt)

### Code Style
To maintain the style and quality of the code, are used the bellow static analysis tools.

| Tool                                                   | Config file  | Check command      | Fix command               |
|---------------------------------------------------------|--------------|--------------------|---------------------------|
| [ktlint](https://github.com/pinterest/ktlint)           | -            | `./gradlew ktlint` | `./gradlew ktlintFormat`  |
| [detekt](https://github.com/detekt/detekt)           | [.detekt-config.yml](/detekt/detekt-config.yml)            | `./gradlew detekt` | -  |

### Dependencies
-   [Timber](https://github.com/JakeWharton/timber) - a logger with a small, extensible API which provides utility on top of Android's normal Log class.

### Plugins
-   [Ktlint](https://github.com/pinterest/ktlint) - kotlin linter with built-in formatter.
