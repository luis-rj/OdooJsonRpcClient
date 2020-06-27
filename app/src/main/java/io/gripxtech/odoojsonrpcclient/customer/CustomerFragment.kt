<?xml version="1.0" encoding="utf-8"?>
<resources>
    <!-- if self_hosted_url set to true, it allows user to manually set protocol and host URL. -->
    <!-- if false then define your protocol and host URL below. -->
    <bool name="self_hosted_url">true</bool>

    <!-- if host URL starts with http:// then set protocol to 0. -->
    <!-- if host URL starts with https:// then set protocol value to 1.-->
    <integer name="protocol">0</integer>

    <!-- set your host_url without leading http:// or https:// -->
    <string name="host_url" translatable="false">192.168.43.52:8069</string>

    <!-- if pre_config_database set to false, it allows user to manually select the database. -->
    <!-- if true then define pre_config_database_name with database name below. -->
    <bool name="pre_config_database">false</bool>

    <!-- set your database -->
    <string name="pre_config_database_name" translatable="false">db_v11</string>

    <!-- if your server is using self signed certificate for using HTTPS protocol then set self_signed_cert to true -->
    <bool name="self_signed_cert">false</bool>

    <!-- Compatible Odoo versions -->
    <!-- Any other Odoo versions which are not in the array are considered as incompatible versions. -->
    <string-array name="supported_odoo_versions">
        <item>10</item>
        <item>11</item>
        <item>12</item>
        <item>13</item>
        <item>14</item>
        <item>15</item>
        <item>saas~12</item>
    </string-array>

    <!-- organization name -->
    <string name="preference_organization_summary" translatable="false">Kasim Rangwala</string>

    <!-- organization website -->
    <string name="preference_organization_website" translatable="false">https://github.com/kasim1011/OdooJsonRpcClient</string>

    <!-- organization privacy policy -->
    <string name="preference_privacy_policy_url" translatable="false">https://github.com/kasim1011/OdooJsonRpcClient/blob/master/LICENSE</string>

    <!-- organization email -->
    <string name="preference_contact_summary" translatable="false">rangwalakasim@ymail.com</string>

    <!-- To add a new language: -->
    <!-- 1) Add language name & language code below -->
    <!-- 2) Reference language name to the languages array -->
    <!-- 3) Reference language code to the languages_codes array -->
    <!-- 4) Add strings.xml for that language -->

    <!-- language -->
    <string name="language_spanish" translatable="false">Español (experimental)</string>
    <string name="language_code_spanish" translatable="false">es</string>
    <string name="language_english" translatable="false">English</string>
    <string name="language_code_english" translatable="false">en</string>
    <string name="language_arabic" translatable="false">العربية (تجريبية)</string>
    <string name="language_code_arabic" translatable="false">ar</string>

    <string-array name="languages">
        <item>@string/language_system_default</item>
        <item>@string/language_spanish</item>
        <item>@string/language_english</item>
        <item>@string/language_arabic</item>
    </string-array>

    <string-array name="languages_codes">
        <item>@string/language_code_system_default</item>
        <item>@string/language_code_spanish</item>
        <item>@string/language_code_english</item>
        <item>@string/language_code_arabic</item>
    </string-array>
</resources>
