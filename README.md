# Spring bootサンプルアプリケーション: 共用施設利用申請・問い合わせアプリ
[https://github.com/saladlam/spring-noticeboard](https://github.com/saladlam/spring-noticeboard)

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

## データベース
データはMYSQLに記憶する。スキーマとデータはアプリケーション起動時がインポートされる。

## 必要なもの
- Java SE Development Kit 8以降
- インタネット接続

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
- アプリを作成する過程で多くの追加機能を実装した。最初の段階で課題を解決するために、どのような機能が必要なのかの洗い出しが甘くコーディングの過程で全体の構成を見直す
- 機会が数多くあった。次回作政治は要件定義をしっかり行い、画面遷移図を自分自身も理解しきれるように細かく作成するよう心掛けたい。
