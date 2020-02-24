#Administarator
| 字段 | 类型 | 约束  | 说明 |
|---|---|---|---|
| administrator_id | int | 主键 自增 | ID |
| username | varchar(20) | 非空，唯一索引 | 用户名 |
| real_name | varcheer(20) | 索引 | 真实姓名 |
| email | varchar(100) | 索引 | 邮箱 |
| encrypted_password | varchar(100) | 非空 | 加密密码 |
| status | tinyint | 非空 ，默认启用 | 状态(0禁用，1启用) |
| create_time | datetime | 非空 | 创建时间 |
| avatar_url | varchar(100) |  | 头像地址 |


#Product 商品
| 字段 | 类型 | 约束 | 说明 |
|---|---|---|---|
| productid | int | 主键 自增 | ID |
| product_name | varchar(50) | 非空 | 商品名称 |
| product_code | varchar(50) |  | 商品代号 |
| price | double | 非空 | 商品价格 | 
| main_pic_url | varchar(100) | | 主图 |
| product_abstract | varchar(255) |  | 商品摘要 |
| discount | double |  | 打折 |
| sort_order | int | 非空 | 排序 |
| stock_quantity | bigint |  | 库存量 |
| status | int | 非空 | 状态 |
| reword_points | bigint | 非空 | 积分 |

#ProduDetail(商品详情表)
| 字段 | 类型 | 约束 | 说明 |
|---|---|---|---|
| product_id | int | 主键 非空 | 商品ID |
| description | text |  | 描述 |
| other_pic | varchar(2000) |  | 其他图片(数组) |


#Customer(客户)
| 字段 | 类型 | 约束 | 说明 |
|---|---|---|---|
| customer_id | int | 主键，非空 | 客户ID |
| username | varchar(50) | 唯一 | 客户名称 |
| mobile | varchar(50) | 非空，唯一 | 客户手机号 |
| mobile_verified | bit | 默认false | 手机验证码  |
| email | varchar(100) | 非空 唯一 | 邮箱 |
| email_verified | varchar(50) | 非空 唯一 | 邮箱验证码 |
| real_name | varchar(50) | 非空 | 客户姓名 |
| default_address_id | int | 非空 | 默认地址id |
| encryped_password | varchar(255) | 非空 | 加密密码 |
| news_subscribed | varchar(100) |  | 新闻订阅 |
| status | tinyint | 非空 | 创建时间 |


#Address(地址)
| 字段 | 类型 | 约束 | 说明 |
|---|---|---|---|
| address_id | int | 非空 | 地址id |
| customer_id | int | 非空 | 客户id |
| receiver_name | varchar(50) | 非空 | 收货人姓名 |
| receiver_mobile | varchar(50) | 非空 | 收货人手机号 |
| content | varchar(200) |  | 地址内容 |
| tag | varchar(20) | 非空 | 标签 |


#order(订单)
| 字段 | 类型 | 约束 | 说明 |
|---|---|---|---|
| order_id | int | 主键 非空 | 订单id |
| customer_id | int | 非空 | 客户id |
| status | tinyint | 非空 | 状态 |
| total_price | double | 非空 | 总金额 |
| create_time | datetime | 非空 | 创建时间 |
| update_time | datetime | 非空 | 修改时间 |


#OrderDetail(订单详情细副表)
| 字段 | 类型 | 约束 | 说明 |
|---|---|---|---|
| order_id | int | 非空 | 订单id |
| ship_address | varchar(300) | 非空 | 寄送地址 | 
| ship_method | smallint | 非空 | 寄送方式 |
| ship_price | double | 非空 | 邮费 |
| pay_method | smallint | 非空 | 支付方式 |
| invoice_address | varchar(100) | 非空 | 发票地址 | 
| invoice_price | double | 非空 | 发票价格 | 
| comment | varchar(300) |  | 备注 |
| order_products | text | 非空 | 内容（商品对象数组json） |
| product_id | int | 非空 | 商品id |
| product_code  | string | 非空 | 商品代码 |
| product_name | string | 非空 | 商品名称 |
| quantity | int | 非空 | 商品数量 |
| unit_price | double | 非空 | 单价 |
| unit_reword_points | int |  | 单个积分 |


#OrderHistory(订单历史)
| 字段 | 类型 | 约束 | 说明 |
|---|---|---|---|
| order_id | int | 主键 非空 | 订单id |
| order_history_id | int | 非空 | 订单历史id |
| time | datetime | 非空 | 访问时间 |
| comment | varchar（255） |  | 备注 |
| order_status | int | 非空 | 订单状态 |
| customer_notified | varchar(50) | 通知用户 |

#return(退货)
| 字段 | 类型 | 约束 | 说明 |
|---|---|---|---|
| return_id | int | 主键 非空 | 退货id|
| order_id | int | 非空 | 订单id |
| order_time | datetime | 非空 | 订单时间 |
| customer_id | int | 非空，索引、外键 |
| customer_name | varchar(50) | 非空 | 用户名称 |
| email | varchar(100) | 非空 | 邮箱 |
| moblie | varchar(50) | 非空 | 手机号 |
| status | tinyint | 非空 | 状态（0退货，1正在处理，完成）|
| return_action | tinyint |  | 处理方式（0退货、1换货、2修理）|
| product_code | int | 非空 | 商品代码 |
| product_name | varchar(50) | 非空 | 商品名称 |
| quantity | int | 非空 | 商品数量 |
| reason | tinyint | 非空 | 退货原因（0发货过期、1订单错误、2收到错误商品、3质量问题） |
| opend | int | 非空 | 是否开封 |
| comment | varchar(300) | | 备注 |
| create_time | datetime | 非空.索引 | 创建时间 |
| update_time | datetime | 非空 | 修改时间 |

#ReturnHistory(退货历史)
| 字段 | 类型 | 约束 | 说明 |
|---|---|---|---|
| return_history_id | int | 非空 主键 | 退货历史id |
| return_id | int | 非空 | 退货id |
| time | detetime | 非空 | 退货时间 |
| return_status | int | 非空 | 退货状态 |
| comment | varchar(50) | 非空 | 备注 |
| customer_notified | varchar(100) | 非空 | 通知客户 |
 