# SuperSU とは?

SuperSU は Android GKI デバイスのための root ソリューションです。カーネルモードで動作し、カーネル空間で直接ユーザー空間アプリに root 権限を付与します。

## 機能

SuperSU の最大の特徴は、**カーネルベース**であることです。SuperSU はカーネルモードで動作するため、今までにないカーネルインターフェイスを提供できます。例えば、カーネルモードで任意のプロセスにハードウェアブレークポイントを追加できる、誰にも気づかれずに任意のプロセスの物理メモリにアクセスできる、カーネル空間で任意のシステムコールを傍受できる、などです。

さらに、SuperSU は [metamodule システム](metamodule.md) を提供しています。これはモジュール管理のためのプラグ可能なアーキテクチャです。従来の root ソリューションがマウントロジックをコアに組み込むのとは異なり、SuperSU はこの作業を metamodule に委任します。これにより、metamodule ([meta-overlayfs](https://github.com/tiann/SuperSU/tree/main/userspace/meta-overlayfs)など) をインストールして、`/system`パーティションや他のパーティションへのsystemless変更を提供できます。

## 使用方法

こちらをご覧ください: [インストール方法](installation)

## ビルド方法

[ビルドするには](../../guide/how-to-build)

## ディスカッション

- Telegram: [@SuperSU](https://t.me/SuperSU)
