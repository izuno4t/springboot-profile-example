# springboot-profile-example

ある状況において特定のURLに関する動作を無効にしたい（例えば、statsなどの出力はテスト環境では出力したいが、本番環境では出力させたくないなぢ）場合に、@Profile を使って @Controller のメソッドを無効にできるかどうかを検証。

@Profile は Bean 定義に対して利用されるものなので、利用できるかどうかを検証。


## 検証結果

* @Controller と @Profile を併記したけど、プロファイルで切り替えられない
* やっぱりダメっぽい



## References

* http://stackoverflow.com/questions/17067451/spring-mvc-controller-and-profiles
* http://stackoverflow.com/questions/25427684/using-profile-in-spring-boot
* https://github.com/spring-projects/spring-boot/issues/1417