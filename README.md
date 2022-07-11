# Spring bootアプリケーション: 予約申請アプリ
2021年12月頃からJavaの勉強をし始め、2022年4月からWebアプリケーションの制作を通してJavaのフレームワークであるSpringBootの学習していました。アプリケーションに関する機能紹介や作成に至った経緯は、下記のqiitaに限定共有記事として投稿しておりますのでご覧いただけると幸いです。
[https://qiita.com/Hottar7991/private/5e0059fbaba523c2286a)

## 目的
このアプリケーションを作成した目的は、Spring frameworkを構成する、いろいろなコンポーネントの流れを説明するため。

## 機能
- ログイン機能
- 管理者権限・ユーザー権限
- メールを使用した問い合わせ機能
- 検索機能
- CRUD機能
- パスワードのハッシュ化

## 使われる主要なコンポーネント
- Spring Boot 
- Bootstrap
- thymeleaf
- Spring Security 
- Spring JDBC 
- GoogleCalendarAPI

## アカウント
| ユーザーネーム | パスワード | 権限 |
|:-------- |:-------- |:----------- |
| admin    | password1234   | ADMIN |
| bob      | password1234   | USER  |
| lisa     | password1234   | USER  |
| mike     | password1234   | ADMIN |
| tom      | password1234   | USER  |


## 実装したかった機能
- ページネーション
- AWSを使用したデプロイ

## 作成を通した反省点
- アプリを作成する過程で多くの追加機能を実装しました。最初の段階でどのような機能が必要なのかの洗い出しが甘かったのが原因だと思います。コーディングの過程で全体の構成を見直す
- 機会が数多くあった。次回作成時は要件定義をしっかり行い、画面遷移図を自分自身も理解しきれるように細かく作成するよう心掛けたいと思います。
