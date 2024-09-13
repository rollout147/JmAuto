package com.oracle.jmAuto.dto;

import lombok.Data;

@Data
public class KakaoPayApproveResponse {
	private String aid;
    private String tid;
    private String cid;
    private String sid;
    private String partner_order_id;
    private String partner_user_id;
    private String payment_method_type;

    private String item_name;
    private String item_code;
    private Integer quantity;
    private String created_at;
    private String approved_at;

    private Amount amount;
}
