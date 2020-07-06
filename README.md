<h1 align='center'>Android Project Template</h1>

### Code Style
To maintain the style and quality of the code, are used the bellow static analysis tools.

| Tool                                                   | Config file  | Check command      | Fix command               |
|---------------------------------------------------------|--------------|--------------------|---------------------------|
| [ktlint](https://github.com/pinterest/ktlint)           | -            | `./gradlew ktlint` | `./gradlew ktlintFormat`  |

### Dependencies
-   [Timber](https://github.com/JakeWharton/timber) - a logger with a small, extensible API which provides utility on top of Android's normal Log class.

### Plugins
-   [Ktlint](https://github.com/pinterest/ktlint) - kotlin linter with built-in formatter.
