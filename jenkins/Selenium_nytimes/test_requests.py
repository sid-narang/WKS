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
        cls.driver = webdriver.Chrome(service_log_path='/tmp/taurus/2017-02-21_11-42-37.tmpB2NIJ6/webdriver.log')
        cls.driver.implicitly_wait(30.0)
        cls.driver.set_window_size(1280, 1024)
        
    @classmethod
    def tearDownClass(cls):
        cls.driver.quit()
        
    def setUp(self):
        self.driver.implicitly_wait(30.0)
        
    def test_00000_https_nytimes_com(self):
        self.driver.get('https://nytimes.com')
        pass
        
