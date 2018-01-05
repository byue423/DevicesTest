package com.example.administrator.devicestest.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.administrator.devicestest.R;
import com.example.administrator.devicestest.utils.DevicesInfoUtils;


/**
 * @auther ZD
 * created at 2017/6/7 11:16
 * 作用：Android获取设备信息
 */

public class DevicesInfoActivity extends Activity implements View.OnClickListener {
    private Button btDevicesInfo;
    private TextView tvPhoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devices_info);
        findViews();
    }


    private void findViews() {
        btDevicesInfo = (Button) findViewById(R.id.bt_devices_info);
        tvPhoneNumber = (TextView) findViewById(R.id.tv_phone_number);

        btDevicesInfo.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (v == btDevicesInfo) {
            showDevicesnfo();
        }
    }

    private void showDevicesnfo() {
        String phoneNum = DevicesInfoUtils.getLine1Number(this);
        Log.i("TAG", "手机号：--->" + phoneNum);
        String DeviceId = DevicesInfoUtils.getDeviceId(this);
        Log.i("TAG", "设备ID：--->" + DeviceId);
        String Serial = DevicesInfoUtils.getSerial(this);
        Log.i("TAG", "序列号：--->" + Serial);
        String IMEI = DevicesInfoUtils.getLocalIMEI(this);
        Log.i("TAG", "IMEI：--->" + IMEI);
        String AndroidId = DevicesInfoUtils.getAndroidId(this);
        Log.i("TAG", "AndroidId：--->" + AndroidId);
        String non = DevicesInfoUtils.getNetworkOperatorName(this);
        Log.i("TAG", "运营商名称：--->" + non);
        String etworkOperator = DevicesInfoUtils.getNetworkOperator(this);
        Log.i("TAG", "运营商编号：--->" + etworkOperator);
        String SimOperatorName = DevicesInfoUtils.getSimOperatorName(this);
        Log.i("TAG", "服务商名称：--->" + SimOperatorName);
        String SimOperator = DevicesInfoUtils.getSimOperator(this);
        Log.i("TAG", "获取SIM卡提供的移动国家码和移动网络码：--->" + SimOperator);
        String SimCountryIso = DevicesInfoUtils.getSimCountryIso(this);
        Log.i("TAG", "获取ISO国家码：--->" + SimCountryIso);
        String date = DevicesInfoUtils.getMac(this);
        Log.i("TAG", "MAC：--->" + date);
        String mac = DevicesInfoUtils.getDateAndTime(this);
        Log.i("TAG", "获取当前日期时间：--->" + mac);
        String Language = DevicesInfoUtils.getLanguage(this);
        Log.i("TAG", "获取手机系统语言：--->" + Language);
        String Metrics = DevicesInfoUtils.getWeithAndHeight(this);
        Log.i("TAG", "获取屏幕分辩率：--->" + Metrics);
        String CountryIso = DevicesInfoUtils.getNetworkCountryIso(this);
        Log.i("TAG", "sim卡所在国家：--->" + CountryIso);
        String PhoneModel = DevicesInfoUtils.getPhoneModel(this);
        Log.i("TAG", "获取当前手机型号：--->" + PhoneModel);
        String PhoneProduct = DevicesInfoUtils.getPhoneProduct(this);
        Log.i("TAG", "获取当前手机型号：--->" + PhoneProduct);
        String TimeZone = DevicesInfoUtils.getTimeZone(this);
        Log.i("TAG", "获取当前时区：--->" + TimeZone);
        String ssm = DevicesInfoUtils.getSimSerialNumber(this);
        Log.i("TAG", "sim卡序列号：--->" + ssm);
        String SubscriberId = DevicesInfoUtils.getSubscriberId(this);
        Log.i("TAG", "IMSI：--->" + SubscriberId);
        boolean NetAvai = DevicesInfoUtils.isNetworkAvailable(this);
        Log.i("TAG", "网络连接是否可用：--->" + NetAvai);
        String eithAndHeight = DevicesInfoUtils.getWeithAndHeight(this);
        Log.i("TAG", "手机屏幕高度：--->" + eithAndHeight);
        String SystemMemory = DevicesInfoUtils.getSystemMemory(this);
        Log.i("TAG", "取手机可用内存和总内存：--->" + SystemMemory);
        String CpuInfo = DevicesInfoUtils.getCpuInfo();
        Log.i("TAG", "手机CPU信息：--->" + CpuInfo);
        String CellInfos = DevicesInfoUtils.getNeighboringCellInfos(this);
        Log.i("TAG", "前移动终端附近移动终端的信息：--->" + CellInfos);
        String NetworkRoaming = DevicesInfoUtils.getNetworkRoaming(this);
        Log.i("TAG", "是否漫游：--->" + NetworkRoaming);
        String hasIccCard = DevicesInfoUtils.hasIccCard(this);
        Log.i("TAG", "ICC卡是否存在：--->" + hasIccCard);
        String VoiceMailNumber = DevicesInfoUtils.getVoiceMailNumber(this);
        Log.i("TAG", "获取语音邮件号码：--->" + VoiceMailNumber);
        String VoiceMailAlphaTag = DevicesInfoUtils.getVoiceMailAlphaTag(this);
        Log.i("TAG", "取得和语音邮件相关的标签：--->" + VoiceMailAlphaTag);
        String SimState = DevicesInfoUtils.getSimState(this);
        Log.i("TAG", "SIM的状态信息：--->" + SimState);

        String PhoneType = DevicesInfoUtils.getPhoneType(this);
        Log.i("TAG", "手机类型：--->" + PhoneType);
        String NetworkType = DevicesInfoUtils.getNetworkType(this);
        Log.i("TAG", "当前使用的网络类型：--->" + NetworkType);
        String DeviceSoftwareVersion = DevicesInfoUtils.getDeviceSoftwareVersion(this);
        Log.i("TAG", "移动终端的软件版本：--->" + DeviceSoftwareVersion);
        String DataState = DevicesInfoUtils.getDataState(this);
        Log.i("TAG", "获取数据连接状态：--->" + DataState);
        String DataActivityState = DevicesInfoUtils.getDataActivityState(this);
        Log.i("TAG", "获取数据活动状态 ：--->" + DataActivityState);
        String TellLocal = DevicesInfoUtils.getTellLocal(this);
        Log.i("TAG", "电话方位：--->" + TellLocal);


    }


}
