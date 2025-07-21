function Account(owner, accNum, balance) {
    // 객체 속성
    this.owner = owner; // account.owner = "홍길동";
    this.accNum = accNum;
    this.balance = balance;
    this.name = "직장인 비과세 예금";
    this.bankname = "우리은행";

    //객체 기능(메서드)
    this.deposit = function (money) {
        // 예금
        this.balance += money;
    };
    
    this.checkBalance = function(){
        // 잔액조회
        return this.balance;
    };

    this.withdraw = function (money) {
        //인출
        if (this.balance >= money){
            this.balance -= money;
        } else {
            window.alert("잔액이 부족합니다.");
        }
    };
}