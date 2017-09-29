import unittest
import re
from time import sleep
from selenium import webdriver
from selenium.common.exceptions import NoSuchElementException
from selenium.common.exceptions import NoAlertPresentException
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions as econd
from selenium.webdriver.support.wait import WebDriverWait


class TestRequests(unittest.TestCase):
    driver = None
        
    @classmethod
    def setUpClass(cls):
        cls.driver = webdriver.Chrome(service_log_path='/Users/narsi01/Desktop/JWC_SN/jenkins/Selenium_nytimes/2017-08-02_14-17-05.590206/webdriver.log')
        cls.driver.implicitly_wait(30.0)
        cls.driver.maximize_window()
        
    @classmethod
    def tearDownClass(cls):
        cls.driver.quit()
        
    def setUp(self):
        self.driver.implicitly_wait(30.0)
        
    def test_00000_https_nytimes_com(self):
        self.driver.get('https://nytimes.com')
        pass
        
