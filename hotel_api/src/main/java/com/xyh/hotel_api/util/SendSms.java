package com.xyh.hotel_api.util;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;

public class SendSms {
    public static String accessKeyId = "LTAI4GKuGYJPhhNuy7XkKDJk";
    public static String accessSecret = "GG0kMokGhgT0SXkZHFbGXuwZi3Xp1x";


    public static String sendMeg(String phoneNumbers, String code) {
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou",accessKeyId , accessSecret);//此处填写accessKeyId和accessSecret
        IAcsClient client = new DefaultAcsClient(profile);

        CommonRequest request = new CommonRequest();
        request.setSysMethod(MethodType.POST);
        request.setSysDomain("dysmsapi.aliyuncs.com");
        request.setSysVersion("2017-05-25");
        request.setSysAction("SendSms");
        request.putQueryParameter("RegionId", "cn-hangzhou");
        request.putQueryParameter("PhoneNumbers", phoneNumbers);
        request.putQueryParameter("SignName", "ABC商城");//填写模板名称
        request.putQueryParameter("TemplateCode", "SMS_204955150");//填写模板id
        request.putQueryParameter("TemplateParam", "{\"code\":\""+code+"\"}");

        try {
            CommonResponse response = client.getCommonResponse(request);
            System.out.println(response.getData());
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
        return code;
    }
}
