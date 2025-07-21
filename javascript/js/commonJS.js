function saveCookie(cookieName, cookieValue, expDate) {
    // expDate (일 단위)
    // alert("쿠키 저장하자");
    let now = new Date();
    now.setDate(now.getDate() + expDate);

    let tmpCookie = `${cookieName}=${cookieValue};expires=${now.toUTCString()}`;

    // 쿠키 저장
    document.cookie = tmpCookie;
    
}

function readCookie(searchName){
    // searchName 이름의 쿠키를 찾아서,
    // 있으면, 쿠키 값을 반환하고
    // 없으면 null 반환.

    let returnVal = null;
    let cook = document.cookie;
    console.log("readCookie: " + cook);
    console.log(cook === "");
    
    
    let cookArr = cook.split(";");
    console.log(cookArr);

    for (i = 0; i < cookArr.length; i++){
        let cookName = cookArr[i].split("=")[0];
        if (cookName.trim() == searchName){
            returnVal = cookArr[i].split("=")[1];
        }
    }

    return returnVal;
}

function getParameter(queryName){
    // let returnVal = null;
    // // console.log(queryName);
    // let url = decodeURIComponent(location.href);
    // // console.log(url);
    // let queryStr = url.split("?")[1];
    // console.log(queryStr);
    // let queryStrArr = queryStr.split("&");
    // // console.log(queryStrArr);
    // for(item of queryStrArr){
    //     // console.log(item.split("=")[0])
    //     if (item.split("=")[0] == queryName){
    //         // console.log("확인");
    //         returnVal = item.split("=")[1];
    //         return returnVal;
    //     }
    // };
    // return returnVal;

    let returnVal = null;
    let url = location.href;

    if (url.indexOf("?") !== -1){
        // 쿼리스트링이 있는 경우
        let queryString = url.split("?")[1];
        let queryStringArr  = queryString.split("&");

        for (let item of queryStringArr){
            // key=value
            if (item.split("=")[0] == queryName){
                // 파라미터 이름이 있으면
                returnVal = item.split("=")[1];
                break;
            }
        }
    }
    return returnVal;
}