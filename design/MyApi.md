
## 0.1 图片上传  

URL:/image/upload  
Method:POST  
Request Content-Type: multipart/formdata  
RequestParam: image  

ResponseBody:
```
http://xxx.com/xxx1.jpg
```

Request Field

| 字段 | 类型 | 描述 |
| :-----------------------: | :----------------: | :---------: |
| image | String | 上传文件key |

Response Field
| 字段 | 类型 | 描述 |
| :---------------: | :------------: | :--------:|
|  | Stromg | 上传图片后url |

## 1.1管理员登录  
URL:/administrator/login?jusername={username}&password={password}  
Method:GET  

ResponseBody:
```
eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c
```

Reqiest Field
| 字段 | 类型 | 描述 |
| :---------------: | :-----------: | :---------: |
| username | String | 用户名 |
| password | String | 密码 |

Response Field
| 字段 | 类型 | 描述 |
| :--------------: | :------------: | :---------:|
|   | String | jut token |  


## 1.2 管理员获取Profile
URL: /administrator/getProfile
Method: GET

RequestHeader:
jcartToken: eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c

ResponseBody:
```json
{
    "administratorId": 1234,
    "username": "user001",
    "realName": "cjf",
    "email": "cjf@qq.com",
    "avatarUrl": "xxx1.jpg",
    "status": 1,
    "createTimestamp": 1582514828383
}
```
Request Header

| 字段 | 类型 | 描述 |
| :--------------: | :----------: | :--------: |
| jcarToken | String | jwt token |

Response Field

| 字段 | 类型 | 描述 |
| :----------------: | :----------: | :------: |
| administratorId | Integer | 管理员id |
|  username | String   | 用户名    |
|  realName | String   | 姓名    |
|  email  | String   | 邮箱    |
|  avatarUrl  | String   | 头像    |
|  status | Byte   | 状态    |
|  createTimestamp | Long   | 创建时间    |

## 1.3 管理员更新Profile
URL: /administrator/updateProfile  
Method:POST  

RequestHeader:
jcartToken: eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c

RequestBody:
```json
{
    "password": "123456",
    "realName": "cjf",
    "email": "cjf@qq.com",
    "avatarUrl": "xxx1.jpg",
    "status": 1
}
```

Request Header
| 字段     |     类型 |   描述   | 
| :--------------: | :--------:| :------: |
| jcartToken   | String   | jwt token    |

Request Field

| 字段     |     类型 |   描述   | 
| :--------------: | :--------:| :------: |
| password   | String   | 密码    |
| realName | String | 姓名 |
| email | String | 邮箱 | 
| avatarUrl | String | 头像 |
| status | Byte | 状态 |


## 1.4 管理员获取密码重置吗

## 1.5 管理员重置密码

## 1.6 管理员搜索列表

## 1.7 管理员回显

## 1.8 管理员创建

## 1.9 管理员更新

##  2.1 后台管理-商品列表页

URL： /product/search?productName={productName}&Model={Model}&quantity={quantity}&price={price}
Method: GET

ResponseBody:
```json
[
    {
        "image":"adf.peng",
        "productName":"苹果电脑",
        "Model":"苹果12",
        "price":"20000",
        "quantity":1003,
        "status":0
    },
      {
        "image":"123.peng",
        "productName":"苹果X",
        "Model":"苹果",
        "price":"6899",
        "quantity":136,
        "status":1
    }
]
```

Request Field
| 字段 | 类型 | 描述 |
| :--------------: | :--------:| :------: |
| productName   | String   | 关键字，商品名   |
| Model   | String   | 机型    |
| price   | Double   | 价格    |
| quantity | int | 排名号 |

Response Field 
| 字段     |     类型 |   描述   | 
| :--------------: | :--------:| :------: |
| image   | String   | 商品图片    |
| productName   | String   | 商品名    |
| Model   | String   | 商品型号    |
| price   | Double   | 商品价格    |
| quantity   | Integer   | 排名    |
| status   | int   | 状态    |



##  2.2 后台管理-商品添加
URL： /product/addproduct
Method:Post

RequestBody:  
```json
[
    {
        "productName":"adf.peng",
        "description":"苹果电脑",
        "Model":"苹果12",
        "price":"20000",
        "quantity":1003,
        "status":0
    }
]
```
ResponseBody:  
```json
    true
```


Request Field
| 字段 | 类型 | 描述 |
| :--------------: | :--------:| :------: |
| productName   | String   | 关键字，商品名   |
| Model   | String   | 机型    |
| price   | Double   | 价格    |
| quantity | int | 排名号 |

Response Field
| 字段     |     类型 |   描述   | 
| :--------------: | :--------:| :------: |
|    | Boolean   | 添加状态    |


## 2.3 前台商店端-商品列表

URL: /product/findByAll
Method:Get

ResponseBody:
```json
[
    {
        "image":"adf.peng",
        "productName":"苹果电脑",
        "Model":"苹果12",
        "price":"20000",
        "详情":1003,
        "status":0
    },
    {
        "image":"adf.peng",
        "productName":"苹果电脑",
        "Model":"苹果12",
        "price":"20000",
        "详情":1003,
        "status":0
    }
      
]
```
Response Field 
| 字段     |     类型 |   描述   | 
| :--------------: | :--------:| :------: |
| image   | String   | 商品图片    |
| productName   | String   | 商品名    |
| Model   | String   | 商品型号    |
| price   | Double   | 商品价格    |
| 详情   | String   | 详情    |
| status   | int   | 状态    |

## 2.4 前台商店端-商品详情
URL: /product/findByid?productid={productid}  
Method:POST    

ResponseBody:
```json
    {
        "image":"adf.peng",
        "productName":"苹果电脑",
        "Model":"苹果12",
        "price":"20000",
        "详情":1003,
        "num":1,
        "status":0
    }
Request Field
| 字段     |     类型 |   描述   | 
| :--------------: | :--------:| :------: |
| productid | Integer | 商品id |


Response Field 
| 字段     |     类型 |   描述   | 
| :--------------: | :--------:| :------: |
| image   | String   | 商品图片    |
| productName   | String   | 商品名    |
| Model   | String   | 商品型号    |
| price   | Double   | 商品价格    |
| 详情   | String   | 详情    |
| status   | int   | 状态    |  

##  2.5 后台管理端-客户列表页  
URL: /product/findAll  
Method:Get  

ResponseBoday:
```json

    {
        "productName":"sdfs",
        "email":"232555@qq.com",
        "customerGroup":"123",
        "status":2,
        "DateAdded":"2020/02/22",
        "ip":"123.236.203"
    },
    {
        "productName":"sdfs",
        "email":"232555@qq.com",
        "customerGroup":"123",
        "status":2,
        "DateAdded":"2020/02/22",
        "ip":"123.236.203"
     }

```

Response Fled
| 字段     |     类型 |   描述   | 
| :--------------: | :--------:| :------: |
| productName   | String   | 商品名称    |
| email   | String   | 邮箱    |
| customerGroup   | int   | 客户分组    |
| status   | int   | 状态    |
| DateAdded   | date   | 时间    |
| ip | String | ip地址 |


## 2.6前台商店端-用户面板页

URL:/zonghe/findlist?accountid={accountid}&orderid={orderid}  
Method:GET

Request:
```json
{
    "accoutid":1,
    "orderid":1
}
```
ResponseBody:
```json
{
    "accountid":1,
    "accountname":"123"
},
{
    "accountid":1,
    "accountname":"123"
},
{
    "accountid":1,
    "accountname":"123"
},O]
{
    "orderid":1,
    "ordername":"我的"
},
{
    "orderid":1,
    "ordername":"我的"
},
{
    "orderid":1,
    "ordername":"我的"
}
```

Request File
| 字段 | 类型 | 描述 |
|:--------------------:|:------------:|:---------:|
| accountid | int | 用户id |
| orderId | int | 订单id |

Request File
| 字段 | 类型 | 描述 |
|:--------------------:|:------------:|:---------:|
| accountid | int | 用户id |
| accountname | String | 用户名 |
| orderId | int | 订单id |
| orderName | String | 订单名称 |

## 2.7前台商店端-个人信息修改页