## 1.1 客户注册

URL: /customer/register
Method:POST

RequestBody:
```json
{
    "username":"user01",
    "realName":"张三",
    "mobile":"1234567890",
    "email":"aa@qq.com",
    "password":"123456",
    "newsSubsribed":false
}
```

ResponseBody:
```
12346
```

Request Field
| 字段 | 类型 | 描述 |
| :---------------: | :------------: | :--------: |
| username | String | 用户名 |
| realName | String | 真实姓名 |
| mobile | String | 手机 |
| email | String | 邮箱 |
| password | String | 密码 |
| newsSubscribed | Boolean | 订阅新闻 |

Response Field  

| 字段     |     类型 |   描述   | 
| :--------------: | :--------:| :------: |
|    | Integer   | 客户Id    |

## 1.2 客户登录
URL: /customer/login?username={username}&password={password}  
Method:GET  

ResponseBody:
```
eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c
```

Request Field
| 字段 | 类型 | 描述 |
| :------------------: | :--------------:|:---------:|
| username | String | 用户名 |
| password | String | 密码 |

Response Field
| 字段 | 类型 | 描述 |
| :----------------------: | :---------------:|:---------:|
|   | String | jwt token |

## 1.3 客户修改密码
URL: /customer/changepassword  
Method:POST  

RequestHeader:
jwtToken:xxx

RequestBody:
```json
{
    "orlginPwd":"123456",
    "newPwd":"abcdef"
}
```

Request Header

| 字段 | 类型 | 描述 |
| :--------------------: | :------------: | :--------: |
| jwtToken | String | 登录后jwtToken |

Request Field

| 字段 | 类型 | 描述 |
|:--------------------:|:------------:|:---------:|
| originPwd | String | 用户名 |
| newPwd | String | 真实姓名 |

## 1.4前台商店端-个人信息修改页
URL: /customer/updateAccount
Method:POST

RequestBody:
```json
    {
        "accountid":1,
        "first_name":"李四",
        "last_name":"王五",
        "email":"ff@qq.com",
        "telephone":123456
    }
```

ResponseBody:
```
    true
```
Request File
| 字段 | 类型 | 描述 |
|:--------------------:|:------------:|:---------:|
| accountid | int | 用户id |
| first_name | String | 用户之前名字 |
| last_name | String | 用户现在的名字 |
| email | String | 用户的邮箱 |
| telephone | String | 用户的手机号 |


Request File
| 字段 | 类型 | 描述 |
|:--------------------:|:------------:|:---------:|
|  | boolean | true修改成功，false修改失败 |

## 1.5前台商店端-用户地址列表页
URL: /customer/findByidAddress?accountid={accountid}  
Method:Get  

RequestBody:
```
1
```

ResponseBody:
```json
{
    "first_name":"李四",
    "last_name":"王五",
    "company":"123",
    "address1":"123",
    "address2":"456",
    "city":"上海",
    "postcode":"520",
    "country":1,
    "state":2,
    "default_address":0
}
```

Request Field
| 字段 | 类型 | 描述 |
|:--------------------:|:------------:|:---------:|
| accountid | int | 用户id |

Response Field
| 字段 | 类型 | 描述 |
|:--------------------:|:------------:|:---------:|
| first_name | string | 用户之前名称 |
| last_name | string | 用户之后名称 |
| company | string | 用户公司名称 |
| address1 | string | 用户地址1 |
| address2 | string | 用户地址2 |
| city | string | 城市 |
| postcode | string | 代号 |
| country | int |  |
| state | int |  |
| default_address | int |  |

## 1.6 前台商店端-地址修改
URL:/customer/addAddress?address={address}  
Method:POST  

RequestBody:
```json
{
    "first_name":"李四",
    "last_name":"王五",
    "company":"123",
    "address1":"123",
    "address2":"456",
    "city":"上海",
    "postcode":"520",
    "country":1,
    "state":2,
    "default_address":0
}
```

ResponseBody:
```
133
```

Request Field
| 字段 | 类型 | 描述 |
|:--------------------:|:------------:|:---------:|
| first_name | string | 用户之前名称 |
| last_name | string | 用户之后名称 |
| company | string | 用户公司名称 |
| address1 | string | 用户地址1 |
| address2 | string | 用户地址2 |
| city | string | 城市 |
| postcode | string | 代号 |
| country | int |  |
| state | int |  |
| default_address | int |  |

Response Field
| 字段 | 类型 | 描述 |
|:--------------------:|:------------:|:---------:|
| accountid | int | 用户id |