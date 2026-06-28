---
layout: home
title: Основанное на ядре root-решение для Android

hero:
  name: SuperSU
  text: Основанное на ядре root-решение для Android
  tagline: ""
  image:
    src: /logo.png
    alt: SuperSU
  actions:
    - theme: brand
      text: Начало работы
      link: /ru_RU/guide/what-is-supersu
    - theme: alt
      text: Посмотр на GitHub
      link: https://github.com/tiann/SuperSU

features:
  - title: Основанный на ядре
    details: SuperSU работает в режиме ядра Linux, он имеет больше контроля над пользовательскими приложениями.
  - title: Контроль доступа по белому списку
    details: Только приложение, которому предоставлено разрешение root, может получить доступ к `su`, другие приложения не могут воспринимать su.
  - title: Ограниченные root-права
    details: SuperSU позволяет вам настраивать uid, gid, группы, возможности и правила SELinux для su. Заприте root-власть в клетке.
  - title: Система Metamodule
    details: Подключаемая модульная инфраструктура позволяет модифицировать /system без изменения системы. Установите metamodule (например meta-overlayfs) для включения монтирования модулей.

