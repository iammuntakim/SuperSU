**English** | [Español](README_ES.md) | [简体中文](README_CN.md) | [繁體中文](README_TW.md) | [日本語](README_JP.md) | [한국어](README_KR.md) | [Polski](README_PL.md) | [Português (Brasil)](README_PT-BR.md) | [Türkçe](README_TR.md) | [Русский](README_RU.md) | [Tiếng Việt](README_VI.md) | [Indonesia](README_ID.md) | [עברית](README_IW.md) | [हिंदी](README_IN.md) | [Italiano](README_IT.md)

# SuperSU

<img src="https://supersu.org/logo.png" style="width: 96px;" alt="logo">

A kernel-based root solution for Android devices.

[![Latest release](https://img.shields.io/github/v/release/tiann/SuperSU?label=Release&logo=github)](https://github.com/tiann/SuperSU/releases/latest)
[![Weblate](https://img.shields.io/badge/Localization-Weblate-teal?logo=weblate)](https://hosted.weblate.org/engage/supersu)
[![Channel](https://img.shields.io/badge/Follow-Telegram-blue.svg?logo=telegram)](https://t.me/SuperSU)
[![License: GPL v2](https://img.shields.io/badge/License-GPL%20v2-orange.svg?logo=gnu)](https://www.gnu.org/licenses/old-licenses/gpl-2.0.en.html)
[![GitHub License](https://img.shields.io/github/license/tiann/SuperSU?logo=gnu)](/LICENSE)

## Features

1. Kernel-based `su` and root access management.
2. Module system based on [metamodules](https://supersu.org/guide/metamodule.html): Pluggable infrastructure for systemless modifications.
3. [App Profile](https://supersu.org/guide/app-profile.html): Lock up the root power in a cage.

## Compatibility state

SuperSU officially supports Android GKI 2.0 devices (kernel 5.10+). Older kernels (4.14+) are also supported, but the kernel will need to be built manually.

With this, WSA, ChromeOS, and container-based Android are all supported.

Currently, the `arm64-v8a` and `x86_64` architectures are supported.

> [!CAUTION]
> Recent kernel versions have implemented a breaking change causing SuperSU to fail and potentially trigger a kernel panic on `x86_64`! Check the website for more info!

## Usage

- [Installation](https://supersu.org/guide/installation.html)
- [How to build](https://supersu.org/guide/how-to-build.html)
- [Official website](https://supersu.org/)

## Translation

To help translate SuperSU, we no longer accept translation contributions via Weblate. All translations are now handled using LLMs.

If you would like to add support for a new language, feel free to open a PR. Please note that modifications to existing English and Chinese translations are not accepted.

## Discussion

- Telegram: [@SuperSU](https://t.me/SuperSU)

## Security

For information on reporting security vulnerabilities in SuperSU, see [SECURITY.md](/SECURITY.md).

## License

- Files under the `kernel` directory are [GPL-2.0-only](https://www.gnu.org/licenses/old-licenses/gpl-2.0.en.html).
- All other parts except the `kernel` directory are [GPL-3.0-or-later](https://www.gnu.org/licenses/gpl-3.0.html).

## Credits

- [Kernel-Assisted Superuser](https://git.zx2c4.com/kernel-assisted-superuser/about/): The SuperSU idea.
- [Magisk](https://github.com/topjohnwu/Magisk): The powerful root tool.
- [genuine](https://github.com/brevent/genuine/): APK v2 signature validation.
- [Diamorphine](https://github.com/m0nad/Diamorphine): Some rootkit skills.
