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

## 振り返り
- どのようにすれば自分に身につくか
- 実際にコーディングするまでは、市販の教材やUdemyなどのビデオ教材を使ってインプットをすればアプリ制作に関わる知識が自分に身につくと思っていました。しかし、いざ作業に取り掛かると多くのエラーに直面し、事前に勉強していた知識だけでは解決できませんでした。その都度発生するエラーと向き合い、1つ1つ解決することで同じエラーが起きてもある程度対処できるようになりました。
　

- 課題を解決するためのアプローチ
- エラーを解消するために、同じような事象の解決例がネット上で多く投稿されていますが、その投稿のみをコピペするだけではどういった流れで処理が進んでいるのか理解が進まないと感じました。そこで、発生した問題を切り分けて分析し、検証し解消に導く。1つの問題が解決してもまた新しい問題が発生するなど忍耐力が求められましたが限られた製作期間を考えると実務でも同じことが求められると感じました。

- 勉強の過程
- 今回の予約アプリを制作するうえで１番の失敗といえるのが勉強の過程です。エンジニアとして働くうえでは言語の学習はもちろんですが、コーディングに夢中になるあまりにテストやGithubなど実務で必要とする内容の勉強を怠っていました。
