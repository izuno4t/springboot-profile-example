# springboot-profile-example

ある状況において特定のURLに関する動作を無効にしたい（例えば、statsなどの出力はテスト環境では出力したいが、本番環境では出力させたくないなぢ）場合に、@Profile を使って @Controller のメソッドを無効にできるかどうかを検証。

@Profile は Bean 定義に対して利用されるものなので、利用できるかどうかが不明。


