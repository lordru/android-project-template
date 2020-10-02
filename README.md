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
| [KtLint](https://github.com/pinterest/ktlint)           | -            | `./gradlew ktlint` | `./gradlew ktlintFormat`  |
| [Detekt](https://github.com/detekt/detekt)           | [.detekt-config.yml](/detekt/detekt-config.yml)            | `./gradlew detekt` | -  |

These tools are integrated in [pre-commit git hook](/scripts/git-hooks/pre-commit). This will make sure your code is validated against KtLint and Detekt before every commit. To skip them for specific commit add this option at git command:
```properties
git commit --no-verify
```


### Dependencies
-   [Timber](https://github.com/JakeWharton/timber) - a logger with a small, extensible API which provides utility on top of Android's normal Log class.
-   [LeakCanary](https://github.com/square/leakcanary/) - a memory leak detection library for Android.

### Plugins
-   [Ktlint](https://github.com/pinterest/ktlint) - kotlin linter with built-in formatter.
