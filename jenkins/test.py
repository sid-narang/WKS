# -*- coding: utf-8 -*-
from selenium.webdriver.firefox.webdriver import WebDriver
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.common.keys import Keys
import time

success = True
wd = WebDriver()
wd.implicitly_wait(60)

def is_alert_present(wd):
    try:
        wd.switch_to_alert().text
        return True
    except:
        return False

try:
    wd.get("http://blazedemo.com/")
    wd.find_element_by_css_selector("input.btn.btn-primary").click()
    wd.find_element_by_css_selector("input.btn.btn-small").click()
    wd.find_element_by_id("inputName").click()
    wd.find_element_by_id("inputName").clear()
    wd.find_element_by_id("inputName").send_keys("test")
    wd.find_element_by_id("address").click()
    wd.find_element_by_id("address").send_keys("\\9")
    wd.find_element_by_id("city").click()
    wd.find_element_by_id("city").send_keys("\\9")
    wd.find_element_by_css_selector("input.btn.btn-primary").click()
finally:
    wd.quit()
    if not success:
        raise Exception("Test failed.")
